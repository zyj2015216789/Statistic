package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPEecIdentifierNrpSoameecid
 */

public class NRPEecIdentifierNrpSoameecid   {
  @JsonProperty("egressEquivalenceClass")
  private String egressEquivalenceClass = null;

  public NRPEecIdentifierNrpSoameecid egressEquivalenceClass(String egressEquivalenceClass) {
    this.egressEquivalenceClass = egressEquivalenceClass;
    return this;
  }

   /**
   * Get egressEquivalenceClass
   * @return egressEquivalenceClass
  **/
  @JsonProperty("egressEquivalenceClass")
  @ApiModelProperty(value = "")
  public String getEgressEquivalenceClass() {
    return egressEquivalenceClass;
  }

  public void setEgressEquivalenceClass(String egressEquivalenceClass) {
    this.egressEquivalenceClass = egressEquivalenceClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEecIdentifierNrpSoameecid nRPEecIdentifierNrpSoameecid = (NRPEecIdentifierNrpSoameecid) o;
    return Objects.equals(this.egressEquivalenceClass, nRPEecIdentifierNrpSoameecid.egressEquivalenceClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(egressEquivalenceClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEecIdentifierNrpSoameecid {\n");
    
    sb.append("    egressEquivalenceClass: ").append(toIndentedString(egressEquivalenceClass)).append("\n");
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

