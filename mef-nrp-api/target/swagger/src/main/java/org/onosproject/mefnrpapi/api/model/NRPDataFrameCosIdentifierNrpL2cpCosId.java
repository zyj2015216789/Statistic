package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPDataFrameCosIdentifierNrpL2cpCosId
 */

public class NRPDataFrameCosIdentifierNrpL2cpCosId   {
  @JsonProperty("L2cpEvcGrpEntry")
  private String l2cpEvcGrpEntry = null;

  @JsonProperty("classOfServiceName")
  private String classOfServiceName = null;

  public NRPDataFrameCosIdentifierNrpL2cpCosId l2cpEvcGrpEntry(String l2cpEvcGrpEntry) {
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

  public NRPDataFrameCosIdentifierNrpL2cpCosId classOfServiceName(String classOfServiceName) {
    this.classOfServiceName = classOfServiceName;
    return this;
  }

   /**
   * Get classOfServiceName
   * @return classOfServiceName
  **/
  @JsonProperty("classOfServiceName")
  @ApiModelProperty(value = "")
  public String getClassOfServiceName() {
    return classOfServiceName;
  }

  public void setClassOfServiceName(String classOfServiceName) {
    this.classOfServiceName = classOfServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPDataFrameCosIdentifierNrpL2cpCosId nRPDataFrameCosIdentifierNrpL2cpCosId = (NRPDataFrameCosIdentifierNrpL2cpCosId) o;
    return Objects.equals(this.l2cpEvcGrpEntry, nRPDataFrameCosIdentifierNrpL2cpCosId.l2cpEvcGrpEntry) &&
        Objects.equals(this.classOfServiceName, nRPDataFrameCosIdentifierNrpL2cpCosId.classOfServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l2cpEvcGrpEntry, classOfServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPDataFrameCosIdentifierNrpL2cpCosId {\n");
    
    sb.append("    l2cpEvcGrpEntry: ").append(toIndentedString(l2cpEvcGrpEntry)).append("\n");
    sb.append("    classOfServiceName: ").append(toIndentedString(classOfServiceName)).append("\n");
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

