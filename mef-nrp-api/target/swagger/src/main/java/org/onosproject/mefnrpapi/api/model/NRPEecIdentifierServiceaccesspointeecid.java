package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPEecIdentifierServiceaccesspointeecid
 */

public class NRPEecIdentifierServiceaccesspointeecid   {
  @JsonProperty("evc")
  private String evc = null;

  @JsonProperty("egressEquivalenceClass")
  private String egressEquivalenceClass = null;

  public NRPEecIdentifierServiceaccesspointeecid evc(String evc) {
    this.evc = evc;
    return this;
  }

   /**
   * Get evc
   * @return evc
  **/
  @JsonProperty("evc")
  @ApiModelProperty(value = "")
  public String getEvc() {
    return evc;
  }

  public void setEvc(String evc) {
    this.evc = evc;
  }

  public NRPEecIdentifierServiceaccesspointeecid egressEquivalenceClass(String egressEquivalenceClass) {
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
    NRPEecIdentifierServiceaccesspointeecid nRPEecIdentifierServiceaccesspointeecid = (NRPEecIdentifierServiceaccesspointeecid) o;
    return Objects.equals(this.evc, nRPEecIdentifierServiceaccesspointeecid.evc) &&
        Objects.equals(this.egressEquivalenceClass, nRPEecIdentifierServiceaccesspointeecid.egressEquivalenceClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evc, egressEquivalenceClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEecIdentifierServiceaccesspointeecid {\n");
    
    sb.append("    evc: ").append(toIndentedString(evc)).append("\n");
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

