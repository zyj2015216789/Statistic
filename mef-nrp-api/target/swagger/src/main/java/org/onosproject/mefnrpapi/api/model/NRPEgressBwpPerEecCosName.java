package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPBwpFlow;



/**
 * NRP Egress Bandwidth Profile Per Class of Service Identifier. MEF 10.3, Section 10.8.
 **/

/**
 * NRP Egress Bandwidth Profile Per Class of Service Identifier. MEF 10.3, Section 10.8.
 */
@ApiModel(description = "NRP Egress Bandwidth Profile Per Class of Service Identifier. MEF 10.3, Section 10.8.")

public class NRPEgressBwpPerEecCosName   {
  @JsonProperty("nrp_bwpflow")
  private NRPBwpFlow nrpBwpflow = null;

  @JsonProperty("nrp_eecName")
  private String nrpEecName = null;

  public NRPEgressBwpPerEecCosName nrpBwpflow(NRPBwpFlow nrpBwpflow) {
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

  public NRPEgressBwpPerEecCosName nrpEecName(String nrpEecName) {
    this.nrpEecName = nrpEecName;
    return this;
  }

   /**
   * Get nrpEecName
   * @return nrpEecName
  **/
  @JsonProperty("nrp_eecName")
  @ApiModelProperty(value = "")
  public String getNrpEecName() {
    return nrpEecName;
  }

  public void setNrpEecName(String nrpEecName) {
    this.nrpEecName = nrpEecName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEgressBwpPerEecCosName nRPEgressBwpPerEecCosName = (NRPEgressBwpPerEecCosName) o;
    return Objects.equals(this.nrpBwpflow, nRPEgressBwpPerEecCosName.nrpBwpflow) &&
        Objects.equals(this.nrpEecName, nRPEgressBwpPerEecCosName.nrpEecName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpBwpflow, nrpEecName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEgressBwpPerEecCosName {\n");
    
    sb.append("    nrpBwpflow: ").append(toIndentedString(nrpBwpflow)).append("\n");
    sb.append("    nrpEecName: ").append(toIndentedString(nrpEecName)).append("\n");
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

