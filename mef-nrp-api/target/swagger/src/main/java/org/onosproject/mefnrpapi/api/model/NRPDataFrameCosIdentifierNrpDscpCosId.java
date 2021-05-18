package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPDataFrameCosIdentifierNrpDscpCosId
 */

public class NRPDataFrameCosIdentifierNrpDscpCosId   {
  @JsonProperty("ipv4")
  private String ipv4 = null;

  @JsonProperty("ipv6")
  private String ipv6 = null;

  @JsonProperty("classOfServiceName")
  private String classOfServiceName = null;

  public NRPDataFrameCosIdentifierNrpDscpCosId ipv4(String ipv4) {
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @JsonProperty("ipv4")
  @ApiModelProperty(value = "")
  public String getIpv4() {
    return ipv4;
  }

  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }

  public NRPDataFrameCosIdentifierNrpDscpCosId ipv6(String ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @JsonProperty("ipv6")
  @ApiModelProperty(value = "")
  public String getIpv6() {
    return ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }

  public NRPDataFrameCosIdentifierNrpDscpCosId classOfServiceName(String classOfServiceName) {
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
    NRPDataFrameCosIdentifierNrpDscpCosId nRPDataFrameCosIdentifierNrpDscpCosId = (NRPDataFrameCosIdentifierNrpDscpCosId) o;
    return Objects.equals(this.ipv4, nRPDataFrameCosIdentifierNrpDscpCosId.ipv4) &&
        Objects.equals(this.ipv6, nRPDataFrameCosIdentifierNrpDscpCosId.ipv6) &&
        Objects.equals(this.classOfServiceName, nRPDataFrameCosIdentifierNrpDscpCosId.classOfServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4, ipv6, classOfServiceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPDataFrameCosIdentifierNrpDscpCosId {\n");
    
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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

