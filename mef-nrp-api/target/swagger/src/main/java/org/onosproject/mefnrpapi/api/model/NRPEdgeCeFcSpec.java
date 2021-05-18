package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * NRP Edge Customer Edge Forwarding Construct Specification 
 **/

/**
 * NRP Edge Customer Edge Forwarding Construct Specification 
 */
@ApiModel(description = "NRP Edge Customer Edge Forwarding Construct Specification ")

public class NRPEdgeCeFcSpec   {
  @JsonProperty("NRP_evcEndpoint")
  private String nRPEvcEndpoint = null;

  @JsonProperty("nrp_ceVlanIdPreservation")
  private Boolean nrpCeVlanIdPreservation = null;

  @JsonProperty("nrp_ceVlanCosPreservation")
  private Boolean nrpCeVlanCosPreservation = null;

  public NRPEdgeCeFcSpec nRPEvcEndpoint(String nRPEvcEndpoint) {
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

  public NRPEdgeCeFcSpec nrpCeVlanIdPreservation(Boolean nrpCeVlanIdPreservation) {
    this.nrpCeVlanIdPreservation = nrpCeVlanIdPreservation;
    return this;
  }

   /**
   * Get nrpCeVlanIdPreservation
   * @return nrpCeVlanIdPreservation
  **/
  @JsonProperty("nrp_ceVlanIdPreservation")
  @ApiModelProperty(value = "")
  public Boolean getNrpCeVlanIdPreservation() {
    return nrpCeVlanIdPreservation;
  }

  public void setNrpCeVlanIdPreservation(Boolean nrpCeVlanIdPreservation) {
    this.nrpCeVlanIdPreservation = nrpCeVlanIdPreservation;
  }

  public NRPEdgeCeFcSpec nrpCeVlanCosPreservation(Boolean nrpCeVlanCosPreservation) {
    this.nrpCeVlanCosPreservation = nrpCeVlanCosPreservation;
    return this;
  }

   /**
   * Get nrpCeVlanCosPreservation
   * @return nrpCeVlanCosPreservation
  **/
  @JsonProperty("nrp_ceVlanCosPreservation")
  @ApiModelProperty(value = "")
  public Boolean getNrpCeVlanCosPreservation() {
    return nrpCeVlanCosPreservation;
  }

  public void setNrpCeVlanCosPreservation(Boolean nrpCeVlanCosPreservation) {
    this.nrpCeVlanCosPreservation = nrpCeVlanCosPreservation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEdgeCeFcSpec nRPEdgeCeFcSpec = (NRPEdgeCeFcSpec) o;
    return Objects.equals(this.nRPEvcEndpoint, nRPEdgeCeFcSpec.nRPEvcEndpoint) &&
        Objects.equals(this.nrpCeVlanIdPreservation, nRPEdgeCeFcSpec.nrpCeVlanIdPreservation) &&
        Objects.equals(this.nrpCeVlanCosPreservation, nRPEdgeCeFcSpec.nrpCeVlanCosPreservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nRPEvcEndpoint, nrpCeVlanIdPreservation, nrpCeVlanCosPreservation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEdgeCeFcSpec {\n");
    
    sb.append("    nRPEvcEndpoint: ").append(toIndentedString(nRPEvcEndpoint)).append("\n");
    sb.append("    nrpCeVlanIdPreservation: ").append(toIndentedString(nrpCeVlanIdPreservation)).append("\n");
    sb.append("    nrpCeVlanCosPreservation: ").append(toIndentedString(nrpCeVlanCosPreservation)).append("\n");
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

