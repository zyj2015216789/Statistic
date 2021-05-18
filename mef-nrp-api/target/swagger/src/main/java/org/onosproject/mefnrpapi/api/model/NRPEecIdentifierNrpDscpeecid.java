package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPEecIdentifierNrpDscpeecid
 */

public class NRPEecIdentifierNrpDscpeecid   {
  @JsonProperty("ipv4")
  private String ipv4 = null;

  @JsonProperty("ipv6")
  private String ipv6 = null;

  @JsonProperty("egressEquivalenceClass")
  private String egressEquivalenceClass = null;

  public NRPEecIdentifierNrpDscpeecid ipv4(String ipv4) {
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

  public NRPEecIdentifierNrpDscpeecid ipv6(String ipv6) {
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

  public NRPEecIdentifierNrpDscpeecid egressEquivalenceClass(String egressEquivalenceClass) {
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
    NRPEecIdentifierNrpDscpeecid nRPEecIdentifierNrpDscpeecid = (NRPEecIdentifierNrpDscpeecid) o;
    return Objects.equals(this.ipv4, nRPEecIdentifierNrpDscpeecid.ipv4) &&
        Objects.equals(this.ipv6, nRPEecIdentifierNrpDscpeecid.ipv6) &&
        Objects.equals(this.egressEquivalenceClass, nRPEecIdentifierNrpDscpeecid.egressEquivalenceClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4, ipv6, egressEquivalenceClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEecIdentifierNrpDscpeecid {\n");
    
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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

