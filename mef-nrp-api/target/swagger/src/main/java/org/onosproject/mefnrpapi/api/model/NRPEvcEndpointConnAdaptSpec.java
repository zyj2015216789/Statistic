package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.onosproject.mefnrpapi.api.model.NRPEndPointMap;
import org.onosproject.mefnrpapi.api.model.NRPEndPointRole;




/**
 * NRPEvcEndpointConnAdaptSpec
 */

public class NRPEvcEndpointConnAdaptSpec   {
  @JsonProperty("nrp_evcEndPointId")
  private String nrpEvcEndPointId = null;

  @JsonProperty("nrp_evcEndPointRole")
  private NRPEndPointRole nrpEvcEndPointRole = null;

  @JsonProperty("nrp_evcEndPointMap")
  private List<NRPEndPointMap> nrpEvcEndPointMap = new ArrayList<NRPEndPointMap>();

  @JsonProperty("nrp_mtu")
  private String nrpMtu = null;

  @JsonProperty("nrp_speed")
  private String nrpSpeed = null;

  @JsonProperty("nrp_testMegEnabled")
  private Boolean nrpTestMegEnabled = null;

  @JsonProperty("nrp_subscriberMegMipEnabled")
  private Boolean nrpSubscriberMegMipEnabled = null;

  public NRPEvcEndpointConnAdaptSpec nrpEvcEndPointId(String nrpEvcEndPointId) {
    this.nrpEvcEndPointId = nrpEvcEndPointId;
    return this;
  }

   /**
   * Get nrpEvcEndPointId
   * @return nrpEvcEndPointId
  **/
  @JsonProperty("nrp_evcEndPointId")
  @ApiModelProperty(value = "")
  public String getNrpEvcEndPointId() {
    return nrpEvcEndPointId;
  }

  public void setNrpEvcEndPointId(String nrpEvcEndPointId) {
    this.nrpEvcEndPointId = nrpEvcEndPointId;
  }

  public NRPEvcEndpointConnAdaptSpec nrpEvcEndPointRole(NRPEndPointRole nrpEvcEndPointRole) {
    this.nrpEvcEndPointRole = nrpEvcEndPointRole;
    return this;
  }

   /**
   * Get nrpEvcEndPointRole
   * @return nrpEvcEndPointRole
  **/
  @JsonProperty("nrp_evcEndPointRole")
  @ApiModelProperty(value = "")
  public NRPEndPointRole getNrpEvcEndPointRole() {
    return nrpEvcEndPointRole;
  }

  public void setNrpEvcEndPointRole(NRPEndPointRole nrpEvcEndPointRole) {
    this.nrpEvcEndPointRole = nrpEvcEndPointRole;
  }

  public NRPEvcEndpointConnAdaptSpec nrpEvcEndPointMap(List<NRPEndPointMap> nrpEvcEndPointMap) {
    this.nrpEvcEndPointMap = nrpEvcEndPointMap;
    return this;
  }

  public NRPEvcEndpointConnAdaptSpec addNrpEvcEndPointMapItem(NRPEndPointMap nrpEvcEndPointMapItem) {
    this.nrpEvcEndPointMap.add(nrpEvcEndPointMapItem);
    return this;
  }

   /**
   * Get nrpEvcEndPointMap
   * @return nrpEvcEndPointMap
  **/
  @JsonProperty("nrp_evcEndPointMap")
  @ApiModelProperty(value = "")
  public List<NRPEndPointMap> getNrpEvcEndPointMap() {
    return nrpEvcEndPointMap;
  }

  public void setNrpEvcEndPointMap(List<NRPEndPointMap> nrpEvcEndPointMap) {
    this.nrpEvcEndPointMap = nrpEvcEndPointMap;
  }

  public NRPEvcEndpointConnAdaptSpec nrpMtu(String nrpMtu) {
    this.nrpMtu = nrpMtu;
    return this;
  }

   /**
   * Get nrpMtu
   * @return nrpMtu
  **/
  @JsonProperty("nrp_mtu")
  @ApiModelProperty(value = "")
  public String getNrpMtu() {
    return nrpMtu;
  }

  public void setNrpMtu(String nrpMtu) {
    this.nrpMtu = nrpMtu;
  }

  public NRPEvcEndpointConnAdaptSpec nrpSpeed(String nrpSpeed) {
    this.nrpSpeed = nrpSpeed;
    return this;
  }

   /**
   * Get nrpSpeed
   * @return nrpSpeed
  **/
  @JsonProperty("nrp_speed")
  @ApiModelProperty(value = "")
  public String getNrpSpeed() {
    return nrpSpeed;
  }

  public void setNrpSpeed(String nrpSpeed) {
    this.nrpSpeed = nrpSpeed;
  }

  public NRPEvcEndpointConnAdaptSpec nrpTestMegEnabled(Boolean nrpTestMegEnabled) {
    this.nrpTestMegEnabled = nrpTestMegEnabled;
    return this;
  }

   /**
   * Test MEF. MEF 10.3, Section 10.10.
   * @return nrpTestMegEnabled
  **/
  @JsonProperty("nrp_testMegEnabled")
  @ApiModelProperty(value = "Test MEF. MEF 10.3, Section 10.10.")
  public Boolean getNrpTestMegEnabled() {
    return nrpTestMegEnabled;
  }

  public void setNrpTestMegEnabled(Boolean nrpTestMegEnabled) {
    this.nrpTestMegEnabled = nrpTestMegEnabled;
  }

  public NRPEvcEndpointConnAdaptSpec nrpSubscriberMegMipEnabled(Boolean nrpSubscriberMegMipEnabled) {
    this.nrpSubscriberMegMipEnabled = nrpSubscriberMegMipEnabled;
    return this;
  }

   /**
   * Subscriber MEG MIP. MEF 10.3, Section 10.11.
   * @return nrpSubscriberMegMipEnabled
  **/
  @JsonProperty("nrp_subscriberMegMipEnabled")
  @ApiModelProperty(value = "Subscriber MEG MIP. MEF 10.3, Section 10.11.")
  public Boolean getNrpSubscriberMegMipEnabled() {
    return nrpSubscriberMegMipEnabled;
  }

  public void setNrpSubscriberMegMipEnabled(Boolean nrpSubscriberMegMipEnabled) {
    this.nrpSubscriberMegMipEnabled = nrpSubscriberMegMipEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEvcEndpointConnAdaptSpec nRPEvcEndpointConnAdaptSpec = (NRPEvcEndpointConnAdaptSpec) o;
    return Objects.equals(this.nrpEvcEndPointId, nRPEvcEndpointConnAdaptSpec.nrpEvcEndPointId) &&
        Objects.equals(this.nrpEvcEndPointRole, nRPEvcEndpointConnAdaptSpec.nrpEvcEndPointRole) &&
        Objects.equals(this.nrpEvcEndPointMap, nRPEvcEndpointConnAdaptSpec.nrpEvcEndPointMap) &&
        Objects.equals(this.nrpMtu, nRPEvcEndpointConnAdaptSpec.nrpMtu) &&
        Objects.equals(this.nrpSpeed, nRPEvcEndpointConnAdaptSpec.nrpSpeed) &&
        Objects.equals(this.nrpTestMegEnabled, nRPEvcEndpointConnAdaptSpec.nrpTestMegEnabled) &&
        Objects.equals(this.nrpSubscriberMegMipEnabled, nRPEvcEndpointConnAdaptSpec.nrpSubscriberMegMipEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpEvcEndPointId, nrpEvcEndPointRole, nrpEvcEndPointMap, nrpMtu, nrpSpeed, nrpTestMegEnabled, nrpSubscriberMegMipEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEvcEndpointConnAdaptSpec {\n");
    
    sb.append("    nrpEvcEndPointId: ").append(toIndentedString(nrpEvcEndPointId)).append("\n");
    sb.append("    nrpEvcEndPointRole: ").append(toIndentedString(nrpEvcEndPointRole)).append("\n");
    sb.append("    nrpEvcEndPointMap: ").append(toIndentedString(nrpEvcEndPointMap)).append("\n");
    sb.append("    nrpMtu: ").append(toIndentedString(nrpMtu)).append("\n");
    sb.append("    nrpSpeed: ").append(toIndentedString(nrpSpeed)).append("\n");
    sb.append("    nrpTestMegEnabled: ").append(toIndentedString(nrpTestMegEnabled)).append("\n");
    sb.append("    nrpSubscriberMegMipEnabled: ").append(toIndentedString(nrpSubscriberMegMipEnabled)).append("\n");
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

