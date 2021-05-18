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
 * NRPIvcEndpointConnAdaptSpec
 */

public class NRPIvcEndpointConnAdaptSpec   {
  @JsonProperty("nrp_ivcEndPointId")
  private String nrpIvcEndPointId = null;

  @JsonProperty("nrp_ivcEndPointRole")
  private NRPEndPointRole nrpIvcEndPointRole = null;

  @JsonProperty("nrp_ivcEndPointMap")
  private List<NRPEndPointMap> nrpIvcEndPointMap = new ArrayList<NRPEndPointMap>();

  @JsonProperty("nrp_mtu")
  private String nrpMtu = null;

  @JsonProperty("nrp_speed")
  private String nrpSpeed = null;

  @JsonProperty("nrp_testMegEnabled")
  private Boolean nrpTestMegEnabled = null;

  @JsonProperty("nrp_subscriberMegMipEnabled")
  private Boolean nrpSubscriberMegMipEnabled = null;

  public NRPIvcEndpointConnAdaptSpec nrpIvcEndPointId(String nrpIvcEndPointId) {
    this.nrpIvcEndPointId = nrpIvcEndPointId;
    return this;
  }

   /**
   * Get nrpIvcEndPointId
   * @return nrpIvcEndPointId
  **/
  @JsonProperty("nrp_ivcEndPointId")
  @ApiModelProperty(value = "")
  public String getNrpIvcEndPointId() {
    return nrpIvcEndPointId;
  }

  public void setNrpIvcEndPointId(String nrpIvcEndPointId) {
    this.nrpIvcEndPointId = nrpIvcEndPointId;
  }

  public NRPIvcEndpointConnAdaptSpec nrpIvcEndPointRole(NRPEndPointRole nrpIvcEndPointRole) {
    this.nrpIvcEndPointRole = nrpIvcEndPointRole;
    return this;
  }

   /**
   * Get nrpIvcEndPointRole
   * @return nrpIvcEndPointRole
  **/
  @JsonProperty("nrp_ivcEndPointRole")
  @ApiModelProperty(value = "")
  public NRPEndPointRole getNrpIvcEndPointRole() {
    return nrpIvcEndPointRole;
  }

  public void setNrpIvcEndPointRole(NRPEndPointRole nrpIvcEndPointRole) {
    this.nrpIvcEndPointRole = nrpIvcEndPointRole;
  }

  public NRPIvcEndpointConnAdaptSpec nrpIvcEndPointMap(List<NRPEndPointMap> nrpIvcEndPointMap) {
    this.nrpIvcEndPointMap = nrpIvcEndPointMap;
    return this;
  }

  public NRPIvcEndpointConnAdaptSpec addNrpIvcEndPointMapItem(NRPEndPointMap nrpIvcEndPointMapItem) {
    this.nrpIvcEndPointMap.add(nrpIvcEndPointMapItem);
    return this;
  }

   /**
   * Get nrpIvcEndPointMap
   * @return nrpIvcEndPointMap
  **/
  @JsonProperty("nrp_ivcEndPointMap")
  @ApiModelProperty(value = "")
  public List<NRPEndPointMap> getNrpIvcEndPointMap() {
    return nrpIvcEndPointMap;
  }

  public void setNrpIvcEndPointMap(List<NRPEndPointMap> nrpIvcEndPointMap) {
    this.nrpIvcEndPointMap = nrpIvcEndPointMap;
  }

  public NRPIvcEndpointConnAdaptSpec nrpMtu(String nrpMtu) {
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

  public NRPIvcEndpointConnAdaptSpec nrpSpeed(String nrpSpeed) {
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

  public NRPIvcEndpointConnAdaptSpec nrpTestMegEnabled(Boolean nrpTestMegEnabled) {
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

  public NRPIvcEndpointConnAdaptSpec nrpSubscriberMegMipEnabled(Boolean nrpSubscriberMegMipEnabled) {
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
    NRPIvcEndpointConnAdaptSpec nRPIvcEndpointConnAdaptSpec = (NRPIvcEndpointConnAdaptSpec) o;
    return Objects.equals(this.nrpIvcEndPointId, nRPIvcEndpointConnAdaptSpec.nrpIvcEndPointId) &&
        Objects.equals(this.nrpIvcEndPointRole, nRPIvcEndpointConnAdaptSpec.nrpIvcEndPointRole) &&
        Objects.equals(this.nrpIvcEndPointMap, nRPIvcEndpointConnAdaptSpec.nrpIvcEndPointMap) &&
        Objects.equals(this.nrpMtu, nRPIvcEndpointConnAdaptSpec.nrpMtu) &&
        Objects.equals(this.nrpSpeed, nRPIvcEndpointConnAdaptSpec.nrpSpeed) &&
        Objects.equals(this.nrpTestMegEnabled, nRPIvcEndpointConnAdaptSpec.nrpTestMegEnabled) &&
        Objects.equals(this.nrpSubscriberMegMipEnabled, nRPIvcEndpointConnAdaptSpec.nrpSubscriberMegMipEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpIvcEndPointId, nrpIvcEndPointRole, nrpIvcEndPointMap, nrpMtu, nrpSpeed, nrpTestMegEnabled, nrpSubscriberMegMipEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPIvcEndpointConnAdaptSpec {\n");
    
    sb.append("    nrpIvcEndPointId: ").append(toIndentedString(nrpIvcEndPointId)).append("\n");
    sb.append("    nrpIvcEndPointRole: ").append(toIndentedString(nrpIvcEndPointRole)).append("\n");
    sb.append("    nrpIvcEndPointMap: ").append(toIndentedString(nrpIvcEndPointMap)).append("\n");
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

