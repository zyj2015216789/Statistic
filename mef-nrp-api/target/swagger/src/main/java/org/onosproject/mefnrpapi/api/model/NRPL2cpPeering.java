package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPL2cpPeeringProtocolIdentifier;



/**
 * NRP Layer 2 Control Protocol Peering
 **/

/**
 * NRP Layer 2 Control Protocol Peering
 */
@ApiModel(description = "NRP Layer 2 Control Protocol Peering")

public class NRPL2cpPeering   {
  @JsonProperty("protocolToBePeered")
  private String protocolToBePeered = null;

  @JsonProperty("protocolIdentifier")
  private NRPL2cpPeeringProtocolIdentifier protocolIdentifier = null;

  @JsonProperty("l2cpDestinationAddress")
  private String l2cpDestinationAddress = null;

  @JsonProperty("linkIdentifier")
  private String linkIdentifier = null;

  public NRPL2cpPeering protocolToBePeered(String protocolToBePeered) {
    this.protocolToBePeered = protocolToBePeered;
    return this;
  }

   /**
   * Get protocolToBePeered
   * @return protocolToBePeered
  **/
  @JsonProperty("protocolToBePeered")
  @ApiModelProperty(value = "")
  public String getProtocolToBePeered() {
    return protocolToBePeered;
  }

  public void setProtocolToBePeered(String protocolToBePeered) {
    this.protocolToBePeered = protocolToBePeered;
  }

  public NRPL2cpPeering protocolIdentifier(NRPL2cpPeeringProtocolIdentifier protocolIdentifier) {
    this.protocolIdentifier = protocolIdentifier;
    return this;
  }

   /**
   * Get protocolIdentifier
   * @return protocolIdentifier
  **/
  @JsonProperty("protocolIdentifier")
  @ApiModelProperty(value = "")
  public NRPL2cpPeeringProtocolIdentifier getProtocolIdentifier() {
    return protocolIdentifier;
  }

  public void setProtocolIdentifier(NRPL2cpPeeringProtocolIdentifier protocolIdentifier) {
    this.protocolIdentifier = protocolIdentifier;
  }

  public NRPL2cpPeering l2cpDestinationAddress(String l2cpDestinationAddress) {
    this.l2cpDestinationAddress = l2cpDestinationAddress;
    return this;
  }

   /**
   * Get l2cpDestinationAddress
   * @return l2cpDestinationAddress
  **/
  @JsonProperty("l2cpDestinationAddress")
  @ApiModelProperty(value = "")
  public String getL2cpDestinationAddress() {
    return l2cpDestinationAddress;
  }

  public void setL2cpDestinationAddress(String l2cpDestinationAddress) {
    this.l2cpDestinationAddress = l2cpDestinationAddress;
  }

  public NRPL2cpPeering linkIdentifier(String linkIdentifier) {
    this.linkIdentifier = linkIdentifier;
    return this;
  }

   /**
   * Get linkIdentifier
   * @return linkIdentifier
  **/
  @JsonProperty("linkIdentifier")
  @ApiModelProperty(value = "")
  public String getLinkIdentifier() {
    return linkIdentifier;
  }

  public void setLinkIdentifier(String linkIdentifier) {
    this.linkIdentifier = linkIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPL2cpPeering nRPL2cpPeering = (NRPL2cpPeering) o;
    return Objects.equals(this.protocolToBePeered, nRPL2cpPeering.protocolToBePeered) &&
        Objects.equals(this.protocolIdentifier, nRPL2cpPeering.protocolIdentifier) &&
        Objects.equals(this.l2cpDestinationAddress, nRPL2cpPeering.l2cpDestinationAddress) &&
        Objects.equals(this.linkIdentifier, nRPL2cpPeering.linkIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocolToBePeered, protocolIdentifier, l2cpDestinationAddress, linkIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPL2cpPeering {\n");
    
    sb.append("    protocolToBePeered: ").append(toIndentedString(protocolToBePeered)).append("\n");
    sb.append("    protocolIdentifier: ").append(toIndentedString(protocolIdentifier)).append("\n");
    sb.append("    l2cpDestinationAddress: ").append(toIndentedString(l2cpDestinationAddress)).append("\n");
    sb.append("    linkIdentifier: ").append(toIndentedString(linkIdentifier)).append("\n");
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

