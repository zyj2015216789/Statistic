package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPDataFrameCosIdentifierNrpSoamCosId
 */

public class NRPDataFrameCosIdentifierNrpSoamCosId   {
  @JsonProperty("classOfServiceName")
  private String classOfServiceName = null;

  public NRPDataFrameCosIdentifierNrpSoamCosId classOfServiceName(String classOfServiceName) {
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
    NRPDataFrameCosIdentifierNrpSoamCosId nRPDataFrameCosIdentifierNrpSoamCosId = (NRPDataFrameCosIdentifierNrpSoamCosId) o;
    return Objects.equals(this.classOfServiceName, nRPDataFrameCosIdentifierNrpSoamCosId.classOfServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classOfServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPDataFrameCosIdentifierNrpSoamCosId {\n");
    
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

