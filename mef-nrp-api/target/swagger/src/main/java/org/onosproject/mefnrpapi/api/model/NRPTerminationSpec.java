package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPBwpFlow;
import org.onosproject.mefnrpapi.api.model.NRPENNITerminationSpec;
import org.onosproject.mefnrpapi.api.model.NRPINNITerminationSpec;
import org.onosproject.mefnrpapi.api.model.NRPUNITerminationSpec;



/**
 * NRP Termination Specification 
 **/

/**
 * NRP Termination Specification 
 */
@ApiModel(description = "NRP Termination Specification ")

public class NRPTerminationSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nrp_physicalLayer")
  private String nrpPhysicalLayer = null;

  @JsonProperty("nrp_syncMode")
  private String nrpSyncMode = null;

  @JsonProperty("nrp_numberOfLinks")
  private Integer nrpNumberOfLinks = null;

  @JsonProperty("nrp_resiliency")
  private String nrpResiliency = null;

  @JsonProperty("nrp_portConvsIdToAggLinkMap")
  private String nrpPortConvsIdToAggLinkMap = null;

  @JsonProperty("nrp_maxFrameSize")
  private Integer nrpMaxFrameSize = null;

  @JsonProperty("nrp_linkOamEnabled")
  private Boolean nrpLinkOamEnabled = null;

  @JsonProperty("nrp_ingressBwProfile")
  private NRPBwpFlow nrpIngressBwProfile = null;

  @JsonProperty("nrp_egressBwProfile")
  private NRPBwpFlow nrpEgressBwProfile = null;

  @JsonProperty("nrp_uniTerminationSpec")
  private NRPUNITerminationSpec nrpUniTerminationSpec = null;

  @JsonProperty("nrp_inniTerminationSpec")
  private NRPINNITerminationSpec nrpInniTerminationSpec = null;

  @JsonProperty("nrp_enniTerminationSpec")
  private NRPENNITerminationSpec nrpEnniTerminationSpec = null;

  public NRPTerminationSpec id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NRPTerminationSpec nrpPhysicalLayer(String nrpPhysicalLayer) {
    this.nrpPhysicalLayer = nrpPhysicalLayer;
    return this;
  }

   /**
   * Mapped from UNI, Reference MEF 10.3, Section 9.2
   * @return nrpPhysicalLayer
  **/
  @JsonProperty("nrp_physicalLayer")
  @ApiModelProperty(value = "Mapped from UNI, Reference MEF 10.3, Section 9.2")
  public String getNrpPhysicalLayer() {
    return nrpPhysicalLayer;
  }

  public void setNrpPhysicalLayer(String nrpPhysicalLayer) {
    this.nrpPhysicalLayer = nrpPhysicalLayer;
  }

  public NRPTerminationSpec nrpSyncMode(String nrpSyncMode) {
    this.nrpSyncMode = nrpSyncMode;
    return this;
  }

   /**
   * MEF 10.3, Section 9.3 Synchronous Mode Service Attribute
   * @return nrpSyncMode
  **/
  @JsonProperty("nrp_syncMode")
  @ApiModelProperty(value = "MEF 10.3, Section 9.3 Synchronous Mode Service Attribute")
  public String getNrpSyncMode() {
    return nrpSyncMode;
  }

  public void setNrpSyncMode(String nrpSyncMode) {
    this.nrpSyncMode = nrpSyncMode;
  }

  public NRPTerminationSpec nrpNumberOfLinks(Integer nrpNumberOfLinks) {
    this.nrpNumberOfLinks = nrpNumberOfLinks;
    return this;
  }

   /**
   * MEF 10.3, Section 9.4 Number of Links Service Attribute
   * @return nrpNumberOfLinks
  **/
  @JsonProperty("nrp_numberOfLinks")
  @ApiModelProperty(value = "MEF 10.3, Section 9.4 Number of Links Service Attribute")
  public Integer getNrpNumberOfLinks() {
    return nrpNumberOfLinks;
  }

  public void setNrpNumberOfLinks(Integer nrpNumberOfLinks) {
    this.nrpNumberOfLinks = nrpNumberOfLinks;
  }

  public NRPTerminationSpec nrpResiliency(String nrpResiliency) {
    this.nrpResiliency = nrpResiliency;
    return this;
  }

   /**
   * MEF 10.3, Section 9.5 UNI Resiliency Service Attribute
   * @return nrpResiliency
  **/
  @JsonProperty("nrp_resiliency")
  @ApiModelProperty(value = "MEF 10.3, Section 9.5 UNI Resiliency Service Attribute")
  public String getNrpResiliency() {
    return nrpResiliency;
  }

  public void setNrpResiliency(String nrpResiliency) {
    this.nrpResiliency = nrpResiliency;
  }

  public NRPTerminationSpec nrpPortConvsIdToAggLinkMap(String nrpPortConvsIdToAggLinkMap) {
    this.nrpPortConvsIdToAggLinkMap = nrpPortConvsIdToAggLinkMap;
    return this;
  }

   /**
   * The Port Conversion ID to Aggregation Link Map Attribute is applicable only when the EthernetServiceInterface resiliency attribute has the value of All Active. Its value is Port Conversation ID to Aggregation Link Map as defined in IEEE Std 802.1AX-2014.
   * @return nrpPortConvsIdToAggLinkMap
  **/
  @JsonProperty("nrp_portConvsIdToAggLinkMap")
  @ApiModelProperty(value = "The Port Conversion ID to Aggregation Link Map Attribute is applicable only when the EthernetServiceInterface resiliency attribute has the value of All Active. Its value is Port Conversation ID to Aggregation Link Map as defined in IEEE Std 802.1AX-2014.")
  public String getNrpPortConvsIdToAggLinkMap() {
    return nrpPortConvsIdToAggLinkMap;
  }

  public void setNrpPortConvsIdToAggLinkMap(String nrpPortConvsIdToAggLinkMap) {
    this.nrpPortConvsIdToAggLinkMap = nrpPortConvsIdToAggLinkMap;
  }

  public NRPTerminationSpec nrpMaxFrameSize(Integer nrpMaxFrameSize) {
    this.nrpMaxFrameSize = nrpMaxFrameSize;
    return this;
  }

   /**
   * MEF 10.3, Section 9.7
   * @return nrpMaxFrameSize
  **/
  @JsonProperty("nrp_maxFrameSize")
  @ApiModelProperty(value = "MEF 10.3, Section 9.7")
  public Integer getNrpMaxFrameSize() {
    return nrpMaxFrameSize;
  }

  public void setNrpMaxFrameSize(Integer nrpMaxFrameSize) {
    this.nrpMaxFrameSize = nrpMaxFrameSize;
  }

  public NRPTerminationSpec nrpLinkOamEnabled(Boolean nrpLinkOamEnabled) {
    this.nrpLinkOamEnabled = nrpLinkOamEnabled;
    return this;
  }

   /**
   * MEF 10.3, Section 9.16
   * @return nrpLinkOamEnabled
  **/
  @JsonProperty("nrp_linkOamEnabled")
  @ApiModelProperty(value = "MEF 10.3, Section 9.16")
  public Boolean getNrpLinkOamEnabled() {
    return nrpLinkOamEnabled;
  }

  public void setNrpLinkOamEnabled(Boolean nrpLinkOamEnabled) {
    this.nrpLinkOamEnabled = nrpLinkOamEnabled;
  }

  public NRPTerminationSpec nrpIngressBwProfile(NRPBwpFlow nrpIngressBwProfile) {
    this.nrpIngressBwProfile = nrpIngressBwProfile;
    return this;
  }

   /**
   * Get nrpIngressBwProfile
   * @return nrpIngressBwProfile
  **/
  @JsonProperty("nrp_ingressBwProfile")
  @ApiModelProperty(value = "")
  public NRPBwpFlow getNrpIngressBwProfile() {
    return nrpIngressBwProfile;
  }

  public void setNrpIngressBwProfile(NRPBwpFlow nrpIngressBwProfile) {
    this.nrpIngressBwProfile = nrpIngressBwProfile;
  }

  public NRPTerminationSpec nrpEgressBwProfile(NRPBwpFlow nrpEgressBwProfile) {
    this.nrpEgressBwProfile = nrpEgressBwProfile;
    return this;
  }

   /**
   * Get nrpEgressBwProfile
   * @return nrpEgressBwProfile
  **/
  @JsonProperty("nrp_egressBwProfile")
  @ApiModelProperty(value = "")
  public NRPBwpFlow getNrpEgressBwProfile() {
    return nrpEgressBwProfile;
  }

  public void setNrpEgressBwProfile(NRPBwpFlow nrpEgressBwProfile) {
    this.nrpEgressBwProfile = nrpEgressBwProfile;
  }

  public NRPTerminationSpec nrpUniTerminationSpec(NRPUNITerminationSpec nrpUniTerminationSpec) {
    this.nrpUniTerminationSpec = nrpUniTerminationSpec;
    return this;
  }

   /**
   * Get nrpUniTerminationSpec
   * @return nrpUniTerminationSpec
  **/
  @JsonProperty("nrp_uniTerminationSpec")
  @ApiModelProperty(value = "")
  public NRPUNITerminationSpec getNrpUniTerminationSpec() {
    return nrpUniTerminationSpec;
  }

  public void setNrpUniTerminationSpec(NRPUNITerminationSpec nrpUniTerminationSpec) {
    this.nrpUniTerminationSpec = nrpUniTerminationSpec;
  }

  public NRPTerminationSpec nrpInniTerminationSpec(NRPINNITerminationSpec nrpInniTerminationSpec) {
    this.nrpInniTerminationSpec = nrpInniTerminationSpec;
    return this;
  }

   /**
   * Get nrpInniTerminationSpec
   * @return nrpInniTerminationSpec
  **/
  @JsonProperty("nrp_inniTerminationSpec")
  @ApiModelProperty(value = "")
  public NRPINNITerminationSpec getNrpInniTerminationSpec() {
    return nrpInniTerminationSpec;
  }

  public void setNrpInniTerminationSpec(NRPINNITerminationSpec nrpInniTerminationSpec) {
    this.nrpInniTerminationSpec = nrpInniTerminationSpec;
  }

  public NRPTerminationSpec nrpEnniTerminationSpec(NRPENNITerminationSpec nrpEnniTerminationSpec) {
    this.nrpEnniTerminationSpec = nrpEnniTerminationSpec;
    return this;
  }

   /**
   * Get nrpEnniTerminationSpec
   * @return nrpEnniTerminationSpec
  **/
  @JsonProperty("nrp_enniTerminationSpec")
  @ApiModelProperty(value = "")
  public NRPENNITerminationSpec getNrpEnniTerminationSpec() {
    return nrpEnniTerminationSpec;
  }

  public void setNrpEnniTerminationSpec(NRPENNITerminationSpec nrpEnniTerminationSpec) {
    this.nrpEnniTerminationSpec = nrpEnniTerminationSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPTerminationSpec nRPTerminationSpec = (NRPTerminationSpec) o;
    return Objects.equals(this.id, nRPTerminationSpec.id) &&
        Objects.equals(this.nrpPhysicalLayer, nRPTerminationSpec.nrpPhysicalLayer) &&
        Objects.equals(this.nrpSyncMode, nRPTerminationSpec.nrpSyncMode) &&
        Objects.equals(this.nrpNumberOfLinks, nRPTerminationSpec.nrpNumberOfLinks) &&
        Objects.equals(this.nrpResiliency, nRPTerminationSpec.nrpResiliency) &&
        Objects.equals(this.nrpPortConvsIdToAggLinkMap, nRPTerminationSpec.nrpPortConvsIdToAggLinkMap) &&
        Objects.equals(this.nrpMaxFrameSize, nRPTerminationSpec.nrpMaxFrameSize) &&
        Objects.equals(this.nrpLinkOamEnabled, nRPTerminationSpec.nrpLinkOamEnabled) &&
        Objects.equals(this.nrpIngressBwProfile, nRPTerminationSpec.nrpIngressBwProfile) &&
        Objects.equals(this.nrpEgressBwProfile, nRPTerminationSpec.nrpEgressBwProfile) &&
        Objects.equals(this.nrpUniTerminationSpec, nRPTerminationSpec.nrpUniTerminationSpec) &&
        Objects.equals(this.nrpInniTerminationSpec, nRPTerminationSpec.nrpInniTerminationSpec) &&
        Objects.equals(this.nrpEnniTerminationSpec, nRPTerminationSpec.nrpEnniTerminationSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nrpPhysicalLayer, nrpSyncMode, nrpNumberOfLinks, nrpResiliency, nrpPortConvsIdToAggLinkMap, nrpMaxFrameSize, nrpLinkOamEnabled, nrpIngressBwProfile, nrpEgressBwProfile, nrpUniTerminationSpec, nrpInniTerminationSpec, nrpEnniTerminationSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPTerminationSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nrpPhysicalLayer: ").append(toIndentedString(nrpPhysicalLayer)).append("\n");
    sb.append("    nrpSyncMode: ").append(toIndentedString(nrpSyncMode)).append("\n");
    sb.append("    nrpNumberOfLinks: ").append(toIndentedString(nrpNumberOfLinks)).append("\n");
    sb.append("    nrpResiliency: ").append(toIndentedString(nrpResiliency)).append("\n");
    sb.append("    nrpPortConvsIdToAggLinkMap: ").append(toIndentedString(nrpPortConvsIdToAggLinkMap)).append("\n");
    sb.append("    nrpMaxFrameSize: ").append(toIndentedString(nrpMaxFrameSize)).append("\n");
    sb.append("    nrpLinkOamEnabled: ").append(toIndentedString(nrpLinkOamEnabled)).append("\n");
    sb.append("    nrpIngressBwProfile: ").append(toIndentedString(nrpIngressBwProfile)).append("\n");
    sb.append("    nrpEgressBwProfile: ").append(toIndentedString(nrpEgressBwProfile)).append("\n");
    sb.append("    nrpUniTerminationSpec: ").append(toIndentedString(nrpUniTerminationSpec)).append("\n");
    sb.append("    nrpInniTerminationSpec: ").append(toIndentedString(nrpInniTerminationSpec)).append("\n");
    sb.append("    nrpEnniTerminationSpec: ").append(toIndentedString(nrpEnniTerminationSpec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

