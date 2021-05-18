package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPBwpFlow;
import org.onosproject.mefnrpapi.api.model.NRPDataFrameCosIdentifier;
import org.onosproject.mefnrpapi.api.model.NRPEecIdentifier;
import org.onosproject.mefnrpapi.api.model.NRPEgressBwpPerEecCosName;
import org.onosproject.mefnrpapi.api.model.NRPEvcEndpointConnAdaptSpec;
import org.onosproject.mefnrpapi.api.model.NRPIngressBwpPerCosName;
import org.onosproject.mefnrpapi.api.model.NRPIvcEndpointConnAdaptSpec;
import org.onosproject.mefnrpapi.api.model.NRPOvcEndpointConnAdaptSpec;
import org.onosproject.mefnrpapi.api.model.NRPSourceMacAddressLimit;



/**
 * MEF NRP ConnectionPointAndAdapterSpec
 **/

/**
 * MEF NRP ConnectionPointAndAdapterSpec
 */
@ApiModel(description = "MEF NRP ConnectionPointAndAdapterSpec")

public class NRPConnAdaptSpec   {
  @JsonProperty("nrp_cosidentifier")
  private NRPDataFrameCosIdentifier nrpCosidentifier = null;

  @JsonProperty("nrp_coloridentifier")
  private Object nrpColoridentifier = null;

  @JsonProperty("nrp_eecIdentifier")
  private NRPEecIdentifier nrpEecIdentifier = null;

  @JsonProperty("nrp_ingressBwpFlow")
  private NRPBwpFlow nrpIngressBwpFlow = null;

  @JsonProperty("nrp_egressBwpFlow")
  private NRPBwpFlow nrpEgressBwpFlow = null;

  @JsonProperty("nrp_ingressbwppercosname")
  private NRPIngressBwpPerCosName nrpIngressbwppercosname = null;

  @JsonProperty("nrp_egressbwppereecname")
  private NRPEgressBwpPerEecCosName nrpEgressbwppereecname = null;

  @JsonProperty("nrp_sourceMacAddressLimit")
  private NRPSourceMacAddressLimit nrpSourceMacAddressLimit = null;

  @JsonProperty("nrpIvcEndPointConnAdaptSpect")
  private NRPIvcEndpointConnAdaptSpec nrpIvcEndPointConnAdaptSpect = null;

  @JsonProperty("nrpEvcEndPointConnAdaptSpect")
  private NRPEvcEndpointConnAdaptSpec nrpEvcEndPointConnAdaptSpect = null;

  @JsonProperty("nrpOvcEndPointConnAdaptSpect")
  private NRPOvcEndpointConnAdaptSpec nrpOvcEndPointConnAdaptSpect = null;

  public NRPConnAdaptSpec nrpCosidentifier(NRPDataFrameCosIdentifier nrpCosidentifier) {
    this.nrpCosidentifier = nrpCosidentifier;
    return this;
  }

   /**
   * Get nrpCosidentifier
   * @return nrpCosidentifier
  **/
  @JsonProperty("nrp_cosidentifier")
  @ApiModelProperty(value = "")
  public NRPDataFrameCosIdentifier getNrpCosidentifier() {
    return nrpCosidentifier;
  }

  public void setNrpCosidentifier(NRPDataFrameCosIdentifier nrpCosidentifier) {
    this.nrpCosidentifier = nrpCosidentifier;
  }

  public NRPConnAdaptSpec nrpColoridentifier(Object nrpColoridentifier) {
    this.nrpColoridentifier = nrpColoridentifier;
    return this;
  }

   /**
   * NRP Color Identifier - mapped from MEF 10.3, Section 10.3, Color Identifier.
   * @return nrpColoridentifier
  **/
  @JsonProperty("nrp_coloridentifier")
  @ApiModelProperty(value = "NRP Color Identifier - mapped from MEF 10.3, Section 10.3, Color Identifier.")
  public Object getNrpColoridentifier() {
    return nrpColoridentifier;
  }

  public void setNrpColoridentifier(Object nrpColoridentifier) {
    this.nrpColoridentifier = nrpColoridentifier;
  }

  public NRPConnAdaptSpec nrpEecIdentifier(NRPEecIdentifier nrpEecIdentifier) {
    this.nrpEecIdentifier = nrpEecIdentifier;
    return this;
  }

   /**
   * Get nrpEecIdentifier
   * @return nrpEecIdentifier
  **/
  @JsonProperty("nrp_eecIdentifier")
  @ApiModelProperty(value = "")
  public NRPEecIdentifier getNrpEecIdentifier() {
    return nrpEecIdentifier;
  }

  public void setNrpEecIdentifier(NRPEecIdentifier nrpEecIdentifier) {
    this.nrpEecIdentifier = nrpEecIdentifier;
  }

  public NRPConnAdaptSpec nrpIngressBwpFlow(NRPBwpFlow nrpIngressBwpFlow) {
    this.nrpIngressBwpFlow = nrpIngressBwpFlow;
    return this;
  }

   /**
   * Get nrpIngressBwpFlow
   * @return nrpIngressBwpFlow
  **/
  @JsonProperty("nrp_ingressBwpFlow")
  @ApiModelProperty(value = "")
  public NRPBwpFlow getNrpIngressBwpFlow() {
    return nrpIngressBwpFlow;
  }

  public void setNrpIngressBwpFlow(NRPBwpFlow nrpIngressBwpFlow) {
    this.nrpIngressBwpFlow = nrpIngressBwpFlow;
  }

  public NRPConnAdaptSpec nrpEgressBwpFlow(NRPBwpFlow nrpEgressBwpFlow) {
    this.nrpEgressBwpFlow = nrpEgressBwpFlow;
    return this;
  }

   /**
   * Get nrpEgressBwpFlow
   * @return nrpEgressBwpFlow
  **/
  @JsonProperty("nrp_egressBwpFlow")
  @ApiModelProperty(value = "")
  public NRPBwpFlow getNrpEgressBwpFlow() {
    return nrpEgressBwpFlow;
  }

  public void setNrpEgressBwpFlow(NRPBwpFlow nrpEgressBwpFlow) {
    this.nrpEgressBwpFlow = nrpEgressBwpFlow;
  }

  public NRPConnAdaptSpec nrpIngressbwppercosname(NRPIngressBwpPerCosName nrpIngressbwppercosname) {
    this.nrpIngressbwppercosname = nrpIngressbwppercosname;
    return this;
  }

   /**
   * Get nrpIngressbwppercosname
   * @return nrpIngressbwppercosname
  **/
  @JsonProperty("nrp_ingressbwppercosname")
  @ApiModelProperty(value = "")
  public NRPIngressBwpPerCosName getNrpIngressbwppercosname() {
    return nrpIngressbwppercosname;
  }

  public void setNrpIngressbwppercosname(NRPIngressBwpPerCosName nrpIngressbwppercosname) {
    this.nrpIngressbwppercosname = nrpIngressbwppercosname;
  }

  public NRPConnAdaptSpec nrpEgressbwppereecname(NRPEgressBwpPerEecCosName nrpEgressbwppereecname) {
    this.nrpEgressbwppereecname = nrpEgressbwppereecname;
    return this;
  }

   /**
   * Get nrpEgressbwppereecname
   * @return nrpEgressbwppereecname
  **/
  @JsonProperty("nrp_egressbwppereecname")
  @ApiModelProperty(value = "")
  public NRPEgressBwpPerEecCosName getNrpEgressbwppereecname() {
    return nrpEgressbwppereecname;
  }

  public void setNrpEgressbwppereecname(NRPEgressBwpPerEecCosName nrpEgressbwppereecname) {
    this.nrpEgressbwppereecname = nrpEgressbwppereecname;
  }

  public NRPConnAdaptSpec nrpSourceMacAddressLimit(NRPSourceMacAddressLimit nrpSourceMacAddressLimit) {
    this.nrpSourceMacAddressLimit = nrpSourceMacAddressLimit;
    return this;
  }

   /**
   * Get nrpSourceMacAddressLimit
   * @return nrpSourceMacAddressLimit
  **/
  @JsonProperty("nrp_sourceMacAddressLimit")
  @ApiModelProperty(value = "")
  public NRPSourceMacAddressLimit getNrpSourceMacAddressLimit() {
    return nrpSourceMacAddressLimit;
  }

  public void setNrpSourceMacAddressLimit(NRPSourceMacAddressLimit nrpSourceMacAddressLimit) {
    this.nrpSourceMacAddressLimit = nrpSourceMacAddressLimit;
  }

  public NRPConnAdaptSpec nrpIvcEndPointConnAdaptSpect(NRPIvcEndpointConnAdaptSpec nrpIvcEndPointConnAdaptSpect) {
    this.nrpIvcEndPointConnAdaptSpect = nrpIvcEndPointConnAdaptSpect;
    return this;
  }

   /**
   * Get nrpIvcEndPointConnAdaptSpect
   * @return nrpIvcEndPointConnAdaptSpect
  **/
  @JsonProperty("nrpIvcEndPointConnAdaptSpect")
  @ApiModelProperty(value = "")
  public NRPIvcEndpointConnAdaptSpec getNrpIvcEndPointConnAdaptSpect() {
    return nrpIvcEndPointConnAdaptSpect;
  }

  public void setNrpIvcEndPointConnAdaptSpect(NRPIvcEndpointConnAdaptSpec nrpIvcEndPointConnAdaptSpect) {
    this.nrpIvcEndPointConnAdaptSpect = nrpIvcEndPointConnAdaptSpect;
  }

  public NRPConnAdaptSpec nrpEvcEndPointConnAdaptSpect(NRPEvcEndpointConnAdaptSpec nrpEvcEndPointConnAdaptSpect) {
    this.nrpEvcEndPointConnAdaptSpect = nrpEvcEndPointConnAdaptSpect;
    return this;
  }

   /**
   * Get nrpEvcEndPointConnAdaptSpect
   * @return nrpEvcEndPointConnAdaptSpect
  **/
  @JsonProperty("nrpEvcEndPointConnAdaptSpect")
  @ApiModelProperty(value = "")
  public NRPEvcEndpointConnAdaptSpec getNrpEvcEndPointConnAdaptSpect() {
    return nrpEvcEndPointConnAdaptSpect;
  }

  public void setNrpEvcEndPointConnAdaptSpect(NRPEvcEndpointConnAdaptSpec nrpEvcEndPointConnAdaptSpect) {
    this.nrpEvcEndPointConnAdaptSpect = nrpEvcEndPointConnAdaptSpect;
  }

  public NRPConnAdaptSpec nrpOvcEndPointConnAdaptSpect(NRPOvcEndpointConnAdaptSpec nrpOvcEndPointConnAdaptSpect) {
    this.nrpOvcEndPointConnAdaptSpect = nrpOvcEndPointConnAdaptSpect;
    return this;
  }

   /**
   * Get nrpOvcEndPointConnAdaptSpect
   * @return nrpOvcEndPointConnAdaptSpect
  **/
  @JsonProperty("nrpOvcEndPointConnAdaptSpect")
  @ApiModelProperty(value = "")
  public NRPOvcEndpointConnAdaptSpec getNrpOvcEndPointConnAdaptSpect() {
    return nrpOvcEndPointConnAdaptSpect;
  }

  public void setNrpOvcEndPointConnAdaptSpect(NRPOvcEndpointConnAdaptSpec nrpOvcEndPointConnAdaptSpect) {
    this.nrpOvcEndPointConnAdaptSpect = nrpOvcEndPointConnAdaptSpect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPConnAdaptSpec nRPConnAdaptSpec = (NRPConnAdaptSpec) o;
    return Objects.equals(this.nrpCosidentifier, nRPConnAdaptSpec.nrpCosidentifier) &&
        Objects.equals(this.nrpColoridentifier, nRPConnAdaptSpec.nrpColoridentifier) &&
        Objects.equals(this.nrpEecIdentifier, nRPConnAdaptSpec.nrpEecIdentifier) &&
        Objects.equals(this.nrpIngressBwpFlow, nRPConnAdaptSpec.nrpIngressBwpFlow) &&
        Objects.equals(this.nrpEgressBwpFlow, nRPConnAdaptSpec.nrpEgressBwpFlow) &&
        Objects.equals(this.nrpIngressbwppercosname, nRPConnAdaptSpec.nrpIngressbwppercosname) &&
        Objects.equals(this.nrpEgressbwppereecname, nRPConnAdaptSpec.nrpEgressbwppereecname) &&
        Objects.equals(this.nrpSourceMacAddressLimit, nRPConnAdaptSpec.nrpSourceMacAddressLimit) &&
        Objects.equals(this.nrpIvcEndPointConnAdaptSpect, nRPConnAdaptSpec.nrpIvcEndPointConnAdaptSpect) &&
        Objects.equals(this.nrpEvcEndPointConnAdaptSpect, nRPConnAdaptSpec.nrpEvcEndPointConnAdaptSpect) &&
        Objects.equals(this.nrpOvcEndPointConnAdaptSpect, nRPConnAdaptSpec.nrpOvcEndPointConnAdaptSpect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpCosidentifier, nrpColoridentifier, nrpEecIdentifier, nrpIngressBwpFlow, nrpEgressBwpFlow, nrpIngressbwppercosname, nrpEgressbwppereecname, nrpSourceMacAddressLimit, nrpIvcEndPointConnAdaptSpect, nrpEvcEndPointConnAdaptSpect, nrpOvcEndPointConnAdaptSpect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPConnAdaptSpec {\n");
    
    sb.append("    nrpCosidentifier: ").append(toIndentedString(nrpCosidentifier)).append("\n");
    sb.append("    nrpColoridentifier: ").append(toIndentedString(nrpColoridentifier)).append("\n");
    sb.append("    nrpEecIdentifier: ").append(toIndentedString(nrpEecIdentifier)).append("\n");
    sb.append("    nrpIngressBwpFlow: ").append(toIndentedString(nrpIngressBwpFlow)).append("\n");
    sb.append("    nrpEgressBwpFlow: ").append(toIndentedString(nrpEgressBwpFlow)).append("\n");
    sb.append("    nrpIngressbwppercosname: ").append(toIndentedString(nrpIngressbwppercosname)).append("\n");
    sb.append("    nrpEgressbwppereecname: ").append(toIndentedString(nrpEgressbwppereecname)).append("\n");
    sb.append("    nrpSourceMacAddressLimit: ").append(toIndentedString(nrpSourceMacAddressLimit)).append("\n");
    sb.append("    nrpIvcEndPointConnAdaptSpect: ").append(toIndentedString(nrpIvcEndPointConnAdaptSpect)).append("\n");
    sb.append("    nrpEvcEndPointConnAdaptSpect: ").append(toIndentedString(nrpEvcEndPointConnAdaptSpect)).append("\n");
    sb.append("    nrpOvcEndPointConnAdaptSpect: ").append(toIndentedString(nrpOvcEndPointConnAdaptSpect)).append("\n");
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

