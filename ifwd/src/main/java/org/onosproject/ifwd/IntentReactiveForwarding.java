/*
 * Copyright 2014 Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.ifwd;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;
import org.onosproject.net.Port;
import org.onosproject.net.device.DeviceService;
import org.onosproject.net.device.PortStatistics;
import org.onosproject.net.flow.FlowEntry;
import org.onosproject.net.flow.FlowRuleService;
import org.onosproject.net.flow.FlowRuleStore;
import org.onosproject.net.link.LinkService;
import org.onosproject.core.ApplicationId;
import org.onosproject.core.CoreService;

import org.onlab.packet.Ethernet;
import org.onosproject.core.ApplicationId;
import org.onosproject.core.CoreService;
import org.onosproject.net.Host;
import org.onosproject.net.HostId;
import org.onosproject.net.PortNumber;
import org.onosproject.net.flow.DefaultTrafficSelector;
import org.onosproject.net.flow.DefaultTrafficTreatment;
import org.onosproject.net.flow.TrafficSelector;
import org.onosproject.net.flow.TrafficTreatment;
import org.onosproject.net.flowobjective.DefaultForwardingObjective;
import org.onosproject.net.flowobjective.FlowObjectiveService;
import org.onosproject.net.flowobjective.ForwardingObjective;
import org.onosproject.net.host.HostService;
import org.onosproject.net.intent.HostToHostIntent;
import org.onosproject.net.intent.IntentService;
import org.onosproject.net.intent.IntentState;
import org.onosproject.net.intent.Key;
import org.onosproject.net.packet.DefaultOutboundPacket;
import org.onosproject.net.packet.InboundPacket;
import org.onosproject.net.packet.OutboundPacket;
import org.onosproject.net.packet.PacketContext;
import org.onosproject.net.packet.PacketPriority;
import org.onosproject.net.packet.PacketProcessor;
import org.onosproject.net.packet.PacketService;
import org.onosproject.net.topology.TopologyService;

import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;



import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.ws.rs.GET;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.lang3.tuple.*;
/**
 * WORK-IN-PROGRESS: Sample reactive forwarding application using intent framework.
 */
@Component(immediate = true)
public class IntentReactiveForwarding {
    private final Logger log = getLogger(getClass());
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected LinkService linkService;
    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected DeviceService deviceService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected CoreService coreService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected TopologyService topologyService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected PacketService packetService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected IntentService intentService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected HostService hostService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected FlowRuleService flowRuleService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected FlowObjectiveService flowObjectiveService;

    private ReactivePacketProcessor processor = new ReactivePacketProcessor();
    private ApplicationId appId;

    private static final int DROP_RULE_TIMEOUT = 300;

    private static final EnumSet<IntentState> WITHDRAWN_STATES = EnumSet.of(IntentState.WITHDRAWN,
                                                                            IntentState.WITHDRAWING,
                                                                            IntentState.WITHDRAW_REQ);
    HashMap<String, Integer> packetCount = new HashMap<String, Integer>();
    HashMap<String, Pair<Long,Long>>tokenCount = new HashMap<String, Pair<Long,Long>>();
    @Activate
    public void activate() {
        ArrayList<Integer> shortFlow = new ArrayList();
        ArrayList<Integer> ruleCount = new ArrayList();
        // HashMap<String, Integer> packetCount = new HashMap<String, Integer>();
        appId = coreService.registerApplication("org.onosproject.ifwd");

        packetService.addProcessor(processor, PacketProcessor.director(2));
        TrafficSelector.Builder selector = DefaultTrafficSelector.builder();
        selector.matchEthType(Ethernet.TYPE_IPV4);
        packetService.requestPackets(selector.build(), PacketPriority.REACTIVE, appId);

        for (int siempre = 0; siempre < 10; siempre++){
            log.info("start statistic");
            shortFlow.clear();
            ruleCount.clear();
            packetCount.clear();
            getStatistics(shortFlow, ruleCount);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e){
                log.info(e.getMessage());
            }
            
        }

        log.info("Started");
    }

    @Deactivate
    public void deactivate() {
        packetService.removeProcessor(processor);
        processor = null;
        log.info("Stopped");
    }
   
    public void getStatistics(ArrayList shortFlow, ArrayList ruleCount) {
        Iterable<Device> devices = deviceService.getAvailableDevices(Device.Type.SWITCH);
        // assume that the number of switches will not exceed 500
        
        String[] switches = new String[500];
        int a = 0;
        for(Device d: devices){
            int short_count = 0;
            switches[a] = d.id().toString();
            a++;
            int ruleDevice = (int)(flowRuleService.getFlowRuleCount(d.id()));
            //log.info("every device have the count rule : {}",ruleDevice);
            ruleCount.add(ruleDevice);
            Iterable<FlowEntry> flowEntry = flowRuleService.getFlowEntries(d.id());
            for(FlowEntry f: flowEntry){
                if(f.packets() < 3){
                    short_count++;
                }
                log.info("every flow count:{}",f.packets());
            }
            shortFlow.add(short_count);
        }
        try{
            log.info("generate statistics - INFO 1 | generate res.xml");
            generateDoc(switches, shortFlow, ruleCount);
        } catch (Exception e) {
            log.info("geneerate statistics - ERROR 0| Error all generar *.xml");
            log.info(e.getMessage());
        }
    }

    public void generateDoc(String[] switchID, ArrayList<Integer>shortFlow, ArrayList<Integer>ruleCount) throws IOException {
        File file = new File("/home/onos/onos/feature_static.txt");
        if(!file.exists() && !file.isDirectory()){
            file.mkdir();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Writer out = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(out);
        for(int i = 0; i < ruleCount.size(); i++){
            String key = switchID[i];
            bw.write(switchID[i]+",");
            if(packetCount.containsKey(key)){
                bw.write(packetCount.get(key)+",");
            }else{
                bw.write(0+",");
            }
            bw.write(shortFlow.get(i)+",");
            bw.write(ruleCount.get(i)+"\n");
           // bw.newLine();
            bw.flush();
        }
        bw.write("**************\n");
        try {
            bw.close();
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }


    }
    /**
     * Packet processor responsible for forwarding packets along their paths.
     */
     private class ReactivePacketProcessor implements PacketProcessor {

        @Override
        public void process(PacketContext context) {
            // Stop processing if the packet has been handled, since we
            // can't do any more to it.
            if (context.isHandled()) {
                return;
            }
            InboundPacket pkt = context.inPacket();
            String device = pkt.receivedFrom().deviceId().toString();
            //String devicePort = pkt.receivedFrom().port().toString();
            if(packetCount.containsKey(device)){
                packetCount.put(device, packetCount.get(device) + 1);
            }else {
                packetCount.put(device, 1);
            }
            
            // before forwd, check the tokem
            /*
               readyQueue: 其实物理上不需要存在，直接只是去调用处理函数就可以了
               waitQueue: 循环处理这里面的数据（如何保证丢失的话是低优先级被扔掉）
               token的触发方式：每秒更新？使用的时候调用计算
            */
            long tokenNum = tokenCount.get(device).getLeft();
            long newTime = new java.util.Date().getTime()/1000;
            long timeUpdate = tokenCount.get(device).getRight() - newTime;
            tokenNum += timeUpdate;
            if(tokenNum > 0){
                tokenNum--;
                tokenCount.put(device, Pair.of(tokenNum, newTime));
                //tokenCount.put(device, pair);
                execute(context);
            }else{
                // 加入waitQueue
                // 首先是要查看自己的设备的grade
                // grade 更新也要记得写，触发一次阈值，更新一次grade,同时调整waitQueue大小
                HashMap<Integer,LinkedList<PacketContext>>waitHead;
            }
            
        }
    }
    private void execute(PacketContext context){
        InboundPacket pkt = context.inPacket();
        Ethernet ethPkt = pkt.parsed();
        if (ethPkt == null) {
            return;
        }
        HostId srcId = HostId.hostId(ethPkt.getSourceMAC());
        HostId dstId = HostId.hostId(ethPkt.getDestinationMAC());

            // Do we know who this is for? If not, flood and bail.
        Host dst = hostService.getHost(dstId);
        if (dst == null) {
            flood(context);
            return;
        }

            // Otherwise forward and be done with it.
        setUpConnectivity(context, srcId, dstId);
        forwardPacketToDst(context, dst);
    }
    // Floods the specified packet if permissible.
    private void flood(PacketContext context) {
        if (topologyService.isBroadcastPoint(topologyService.currentTopology(),
                                             context.inPacket().receivedFrom())) {
            packetOut(context, PortNumber.FLOOD);
        } else {
            context.block();
        }
    }

    // Sends a packet out the specified port.
    private void packetOut(PacketContext context, PortNumber portNumber) {
        context.treatmentBuilder().setOutput(portNumber);
        context.send();
    }

    private void forwardPacketToDst(PacketContext context, Host dst) {
        TrafficTreatment treatment = DefaultTrafficTreatment.builder().setOutput(dst.location().port()).build();
        OutboundPacket packet = new DefaultOutboundPacket(dst.location().deviceId(),
                                                          treatment, context.inPacket().unparsed());
        packetService.emit(packet);
        // log.info("sending packet: {}", packet);
    }

    // Install a rule forwarding the packet to the specified port.
    private void setUpConnectivity(PacketContext context, HostId srcId, HostId dstId) {
        TrafficSelector selector = DefaultTrafficSelector.emptySelector();
        TrafficTreatment treatment = DefaultTrafficTreatment.emptyTreatment();

        Key key;
        if (srcId.toString().compareTo(dstId.toString()) < 0) {
            key = Key.of(srcId.toString() + dstId.toString(), appId);
        } else {
            key = Key.of(dstId.toString() + srcId.toString(), appId);
        }

        HostToHostIntent intent = (HostToHostIntent) intentService.getIntent(key);
        // TODO handle the FAILED state
        if (intent != null) {
            if (WITHDRAWN_STATES.contains(intentService.getIntentState(key))) {
                HostToHostIntent hostIntent = HostToHostIntent.builder()
                        .appId(appId)
                        .key(key)
                        .one(srcId)
                        .two(dstId)
                        .selector(selector)
                        .treatment(treatment)
                        .build();

                intentService.submit(hostIntent);
            } else if (intentService.getIntentState(key) == IntentState.FAILED) {

                TrafficSelector objectiveSelector = DefaultTrafficSelector.builder()
                        .matchEthSrc(srcId.mac()).matchEthDst(dstId.mac()).build();

                TrafficTreatment dropTreatment = DefaultTrafficTreatment.builder()
                        .drop().build();

                ForwardingObjective objective = DefaultForwardingObjective.builder()
                        .withSelector(objectiveSelector)
                        .withTreatment(dropTreatment)
                        .fromApp(appId)
                        .withPriority(intent.priority() - 1)
                        .makeTemporary(DROP_RULE_TIMEOUT)
                        .withFlag(ForwardingObjective.Flag.VERSATILE)
                        .add();

                flowObjectiveService.forward(context.outPacket().sendThrough(), objective);
            }

        } else if (intent == null) {
            HostToHostIntent hostIntent = HostToHostIntent.builder()
                    .appId(appId)
                    .key(key)
                    .one(srcId)
                    .two(dstId)
                    .selector(selector)
                    .treatment(treatment)
                    .build();

            intentService.submit(hostIntent);
        }

    }
    

}
