package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPEecIdentifierNrpL2cpeecid
 */

public class NRPEecIdentifierNrpL2cpeecid   {
  @JsonProperty("L2cpEvcGrpEntry")
  private String l2cpEvcGrpEntry = null;

  @JsonProperty("egressEquivalenceClass")
  private String egressEquivalenceClass = null;

  public NRPEecIdentifierNrpL2cpeecid l2cpEvcGrpEntry(String l2cpEvcGrpEntry) {
    this.l2cpEvcGrpEntry = l2cpEvcGrpEntry;
    return this;
  }

   /**
   * Get l2cpEvcGrpEntry
   * @return l2cpEvcGrpEntry
  **/
  @JsonProperty("L2cpEvcGrpEntry")
  @ApiModelProperty(value = "")
  public String getL2cpEvcGrpEntry() {
    return l2cpEvcGrpEntry;
  }

  public void setL2cpEvcGrpEntry(String l2cpEvcGrpEntry) {
    this.l2cpEvcGrpEntry = l2cpEvcGrpEntry;
  }

  public NRPEecIdentifierNrpL2cpeecid egressEquivalenceClass(String egressEquivalenceClass) {
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
    NRPEecIdentifierNrpL2cpeecid nRPEecIdentifierNrpL2cpeecid = (NRPEecIdentifierNrpL2cpeecid) o;
    return Objects.equals(this.l2cpEvcGrpEntry, nRPEecIdentifierNrpL2cpeecid.l2cpEvcGrpEntry) &&
        Objects.equals(this.egressEquivalenceClass, nRPEecIdentifierNrpL2cpeecid.egressEquivalenceClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l2cpEvcGrpEntry, egressEquivalenceClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEecIdentifierNrpL2cpeecid {\n");
    
    sb.append("    l2cpEvcGrpEntry: ").append(toIndentedString(l2cpEvcGrpEntry)).append("\n");
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

