package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPL2cpPeeringProtocolIdentifier
 */

public class NRPL2cpPeeringProtocolIdentifier   {
  @JsonProperty("Ethertype")
  private String ethertype = null;

  @JsonProperty("Subtypes")
  private String subtypes = null;

  public NRPL2cpPeeringProtocolIdentifier ethertype(String ethertype) {
    this.ethertype = ethertype;
    return this;
  }

   /**
   * Get ethertype
   * @return ethertype
  **/
  @JsonProperty("Ethertype")
  @ApiModelProperty(value = "")
  public String getEthertype() {
    return ethertype;
  }

  public void setEthertype(String ethertype) {
    this.ethertype = ethertype;
  }

  public NRPL2cpPeeringProtocolIdentifier subtypes(String subtypes) {
    this.subtypes = subtypes;
    return this;
  }

   /**
   * Get subtypes
   * @return subtypes
  **/
  @JsonProperty("Subtypes")
  @ApiModelProperty(value = "")
  public String getSubtypes() {
    return subtypes;
  }

  public void setSubtypes(String subtypes) {
    this.subtypes = subtypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPL2cpPeeringProtocolIdentifier nRPL2cpPeeringProtocolIdentifier = (NRPL2cpPeeringProtocolIdentifier) o;
    return Objects.equals(this.ethertype, nRPL2cpPeeringProtocolIdentifier.ethertype) &&
        Objects.equals(this.subtypes, nRPL2cpPeeringProtocolIdentifier.subtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethertype, subtypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPL2cpPeeringProtocolIdentifier {\n");
    
    sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
    sb.append("    subtypes: ").append(toIndentedString(subtypes)).append("\n");
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

