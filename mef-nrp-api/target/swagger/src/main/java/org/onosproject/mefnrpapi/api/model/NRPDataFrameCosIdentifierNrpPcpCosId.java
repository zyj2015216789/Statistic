package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPDataFrameCosIdentifierNrpPcpCosId
 */

public class NRPDataFrameCosIdentifierNrpPcpCosId   {
  @JsonProperty("cosId")
  private String cosId = null;

  @JsonProperty("classOfServiceName")
  private String classOfServiceName = null;

  public NRPDataFrameCosIdentifierNrpPcpCosId cosId(String cosId) {
    this.cosId = cosId;
    return this;
  }

   /**
   * Get cosId
   * @return cosId
  **/
  @JsonProperty("cosId")
  @ApiModelProperty(value = "")
  public String getCosId() {
    return cosId;
  }

  public void setCosId(String cosId) {
    this.cosId = cosId;
  }

  public NRPDataFrameCosIdentifierNrpPcpCosId classOfServiceName(String classOfServiceName) {
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
    NRPDataFrameCosIdentifierNrpPcpCosId nRPDataFrameCosIdentifierNrpPcpCosId = (NRPDataFrameCosIdentifierNrpPcpCosId) o;
    return Objects.equals(this.cosId, nRPDataFrameCosIdentifierNrpPcpCosId.cosId) &&
        Objects.equals(this.classOfServiceName, nRPDataFrameCosIdentifierNrpPcpCosId.classOfServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cosId, classOfServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPDataFrameCosIdentifierNrpPcpCosId {\n");
    
    sb.append("    cosId: ").append(toIndentedString(cosId)).append("\n");
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

