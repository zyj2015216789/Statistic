package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * NRP Transit Customer Edge Forwarding Construct Specification 
 **/

/**
 * NRP Transit Customer Edge Forwarding Construct Specification 
 */
@ApiModel(description = "NRP Transit Customer Edge Forwarding Construct Specification ")

public class NRPTransitCeFcSpec   {
  @JsonProperty("NRP_evcEndpoint")
  private String nRPEvcEndpoint = null;

  @JsonProperty("nrp_sVlanIdPreservation")
  private Boolean nrpSVlanIdPreservation = null;

  @JsonProperty("nrp_sVlanCosPreservation")
  private Boolean nrpSVlanCosPreservation = null;

  public NRPTransitCeFcSpec nRPEvcEndpoint(String nRPEvcEndpoint) {
    this.nRPEvcEndpoint = nRPEvcEndpoint;
    return this;
  }

   /**
   * Get nRPEvcEndpoint
   * @return nRPEvcEndpoint
  **/
  @JsonProperty("NRP_evcEndpoint")
  @ApiModelProperty(value = "")
  public String getNRPEvcEndpoint() {
    return nRPEvcEndpoint;
  }

  public void setNRPEvcEndpoint(String nRPEvcEndpoint) {
    this.nRPEvcEndpoint = nRPEvcEndpoint;
  }

  public NRPTransitCeFcSpec nrpSVlanIdPreservation(Boolean nrpSVlanIdPreservation) {
    this.nrpSVlanIdPreservation = nrpSVlanIdPreservation;
    return this;
  }

   /**
   * Get nrpSVlanIdPreservation
   * @return nrpSVlanIdPreservation
  **/
  @JsonProperty("nrp_sVlanIdPreservation")
  @ApiModelProperty(value = "")
  public Boolean getNrpSVlanIdPreservation() {
    return nrpSVlanIdPreservation;
  }

  public void setNrpSVlanIdPreservation(Boolean nrpSVlanIdPreservation) {
    this.nrpSVlanIdPreservation = nrpSVlanIdPreservation;
  }

  public NRPTransitCeFcSpec nrpSVlanCosPreservation(Boolean nrpSVlanCosPreservation) {
    this.nrpSVlanCosPreservation = nrpSVlanCosPreservation;
    return this;
  }

   /**
   * Get nrpSVlanCosPreservation
   * @return nrpSVlanCosPreservation
  **/
  @JsonProperty("nrp_sVlanCosPreservation")
  @ApiModelProperty(value = "")
  public Boolean getNrpSVlanCosPreservation() {
    return nrpSVlanCosPreservation;
  }

  public void setNrpSVlanCosPreservation(Boolean nrpSVlanCosPreservation) {
    this.nrpSVlanCosPreservation = nrpSVlanCosPreservation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPTransitCeFcSpec nRPTransitCeFcSpec = (NRPTransitCeFcSpec) o;
    return Objects.equals(this.nRPEvcEndpoint, nRPTransitCeFcSpec.nRPEvcEndpoint) &&
        Objects.equals(this.nrpSVlanIdPreservation, nRPTransitCeFcSpec.nrpSVlanIdPreservation) &&
        Objects.equals(this.nrpSVlanCosPreservation, nRPTransitCeFcSpec.nrpSVlanCosPreservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nRPEvcEndpoint, nrpSVlanIdPreservation, nrpSVlanCosPreservation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPTransitCeFcSpec {\n");
    
    sb.append("    nRPEvcEndpoint: ").append(toIndentedString(nRPEvcEndpoint)).append("\n");
    sb.append("    nrpSVlanIdPreservation: ").append(toIndentedString(nrpSVlanIdPreservation)).append("\n");
    sb.append("    nrpSVlanCosPreservation: ").append(toIndentedString(nrpSVlanCosPreservation)).append("\n");
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

