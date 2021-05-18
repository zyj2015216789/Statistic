package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPBwpFlow;



/**
 * NRP Ingress Bandwidth Profile Per Class of Service Identifier. MEF 10.3, Section 10.6.
 **/

/**
 * NRP Ingress Bandwidth Profile Per Class of Service Identifier. MEF 10.3, Section 10.6.
 */
@ApiModel(description = "NRP Ingress Bandwidth Profile Per Class of Service Identifier. MEF 10.3, Section 10.6.")

public class NRPIngressBwpPerCosName   {
  @JsonProperty("nrp_bwpflow")
  private NRPBwpFlow nrpBwpflow = null;

  @JsonProperty("nrp_cosName")
  private String nrpCosName = null;

  public NRPIngressBwpPerCosName nrpBwpflow(NRPBwpFlow nrpBwpflow) {
    this.nrpBwpflow = nrpBwpflow;
    return this;
  }

   /**
   * Get nrpBwpflow
   * @return nrpBwpflow
  **/
  @JsonProperty("nrp_bwpflow")
  @ApiModelProperty(value = "")
  public NRPBwpFlow getNrpBwpflow() {
    return nrpBwpflow;
  }

  public void setNrpBwpflow(NRPBwpFlow nrpBwpflow) {
    this.nrpBwpflow = nrpBwpflow;
  }

  public NRPIngressBwpPerCosName nrpCosName(String nrpCosName) {
    this.nrpCosName = nrpCosName;
    return this;
  }

   /**
   * Get nrpCosName
   * @return nrpCosName
  **/
  @JsonProperty("nrp_cosName")
  @ApiModelProperty(value = "")
  public String getNrpCosName() {
    return nrpCosName;
  }

  public void setNrpCosName(String nrpCosName) {
    this.nrpCosName = nrpCosName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPIngressBwpPerCosName nRPIngressBwpPerCosName = (NRPIngressBwpPerCosName) o;
    return Objects.equals(this.nrpBwpflow, nRPIngressBwpPerCosName.nrpBwpflow) &&
        Objects.equals(this.nrpCosName, nRPIngressBwpPerCosName.nrpCosName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpBwpflow, nrpCosName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPIngressBwpPerCosName {\n");
    
    sb.append("    nrpBwpflow: ").append(toIndentedString(nrpBwpflow)).append("\n");
    sb.append("    nrpCosName: ").append(toIndentedString(nrpCosName)).append("\n");
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

