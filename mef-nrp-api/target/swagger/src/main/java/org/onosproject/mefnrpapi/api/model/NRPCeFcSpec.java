package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPEdgeCeFcSpec;
import org.onosproject.mefnrpapi.api.model.NRPTransitCeFcSpec;



/**
 * NRP Customer Edge Forwarding Construct Specification 
 **/

/**
 * NRP Customer Edge Forwarding Construct Specification 
 */
@ApiModel(description = "NRP Customer Edge Forwarding Construct Specification ")

public class NRPCeFcSpec   {
  /**
   * Mapped from MEF 10.3, Section 8.1 EVC Type
   */
  public enum NrpConnectionTypeEnum {
    POINTTOPOINT("PointToPoint"),
    
    MULTIPOINTTOMULTIPOINT("MultipointToMultipoint"),
    
    ROOTEDMULTIPOINT("RootedMultipoint");

    private String value;

    NrpConnectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NrpConnectionTypeEnum fromValue(String text) {
      for (NrpConnectionTypeEnum b : NrpConnectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nrp_connectionType")
  private NrpConnectionTypeEnum nrpConnectionType = null;

  /**
   * Gets or Sets nrpUnicastFrameDelivery
   */
  public enum NrpUnicastFrameDeliveryEnum {
    CONDITIONALLY("Conditionally"),
    
    UNCONDITIONALLY("Unconditionally");

    private String value;

    NrpUnicastFrameDeliveryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NrpUnicastFrameDeliveryEnum fromValue(String text) {
      for (NrpUnicastFrameDeliveryEnum b : NrpUnicastFrameDeliveryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nrp_unicastFrameDelivery")
  private NrpUnicastFrameDeliveryEnum nrpUnicastFrameDelivery = null;

  /**
   * Gets or Sets nrpMulticastFrameDelivery
   */
  public enum NrpMulticastFrameDeliveryEnum {
    CONDITIONALLY("Conditionally"),
    
    UNCONDITIONALLY("Unconditionally");

    private String value;

    NrpMulticastFrameDeliveryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NrpMulticastFrameDeliveryEnum fromValue(String text) {
      for (NrpMulticastFrameDeliveryEnum b : NrpMulticastFrameDeliveryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nrp_multicastFrameDelivery")
  private NrpMulticastFrameDeliveryEnum nrpMulticastFrameDelivery = null;

  /**
   * Gets or Sets nrpBroadcastFrameDelivery
   */
  public enum NrpBroadcastFrameDeliveryEnum {
    CONDITIONALLY("Conditionally"),
    
    UNCONDITIONALLY("Unconditionally");

    private String value;

    NrpBroadcastFrameDeliveryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NrpBroadcastFrameDeliveryEnum fromValue(String text) {
      for (NrpBroadcastFrameDeliveryEnum b : NrpBroadcastFrameDeliveryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nrp_broadcastFrameDelivery")
  private NrpBroadcastFrameDeliveryEnum nrpBroadcastFrameDelivery = null;

  @JsonProperty("nrp_edgeCeFcSpec")
  private NRPEdgeCeFcSpec nrpEdgeCeFcSpec = null;

  @JsonProperty("nrp_transitCeFcSpec")
  private NRPTransitCeFcSpec nrpTransitCeFcSpec = null;

  public NRPCeFcSpec nrpConnectionType(NrpConnectionTypeEnum nrpConnectionType) {
    this.nrpConnectionType = nrpConnectionType;
    return this;
  }

   /**
   * Mapped from MEF 10.3, Section 8.1 EVC Type
   * @return nrpConnectionType
  **/
  @JsonProperty("nrp_connectionType")
  @ApiModelProperty(value = "Mapped from MEF 10.3, Section 8.1 EVC Type")
  public NrpConnectionTypeEnum getNrpConnectionType() {
    return nrpConnectionType;
  }

  public void setNrpConnectionType(NrpConnectionTypeEnum nrpConnectionType) {
    this.nrpConnectionType = nrpConnectionType;
  }

  public NRPCeFcSpec nrpUnicastFrameDelivery(NrpUnicastFrameDeliveryEnum nrpUnicastFrameDelivery) {
    this.nrpUnicastFrameDelivery = nrpUnicastFrameDelivery;
    return this;
  }

   /**
   * Get nrpUnicastFrameDelivery
   * @return nrpUnicastFrameDelivery
  **/
  @JsonProperty("nrp_unicastFrameDelivery")
  @ApiModelProperty(value = "")
  public NrpUnicastFrameDeliveryEnum getNrpUnicastFrameDelivery() {
    return nrpUnicastFrameDelivery;
  }

  public void setNrpUnicastFrameDelivery(NrpUnicastFrameDeliveryEnum nrpUnicastFrameDelivery) {
    this.nrpUnicastFrameDelivery = nrpUnicastFrameDelivery;
  }

  public NRPCeFcSpec nrpMulticastFrameDelivery(NrpMulticastFrameDeliveryEnum nrpMulticastFrameDelivery) {
    this.nrpMulticastFrameDelivery = nrpMulticastFrameDelivery;
    return this;
  }

   /**
   * Get nrpMulticastFrameDelivery
   * @return nrpMulticastFrameDelivery
  **/
  @JsonProperty("nrp_multicastFrameDelivery")
  @ApiModelProperty(value = "")
  public NrpMulticastFrameDeliveryEnum getNrpMulticastFrameDelivery() {
    return nrpMulticastFrameDelivery;
  }

  public void setNrpMulticastFrameDelivery(NrpMulticastFrameDeliveryEnum nrpMulticastFrameDelivery) {
    this.nrpMulticastFrameDelivery = nrpMulticastFrameDelivery;
  }

  public NRPCeFcSpec nrpBroadcastFrameDelivery(NrpBroadcastFrameDeliveryEnum nrpBroadcastFrameDelivery) {
    this.nrpBroadcastFrameDelivery = nrpBroadcastFrameDelivery;
    return this;
  }

   /**
   * Get nrpBroadcastFrameDelivery
   * @return nrpBroadcastFrameDelivery
  **/
  @JsonProperty("nrp_broadcastFrameDelivery")
  @ApiModelProperty(value = "")
  public NrpBroadcastFrameDeliveryEnum getNrpBroadcastFrameDelivery() {
    return nrpBroadcastFrameDelivery;
  }

  public void setNrpBroadcastFrameDelivery(NrpBroadcastFrameDeliveryEnum nrpBroadcastFrameDelivery) {
    this.nrpBroadcastFrameDelivery = nrpBroadcastFrameDelivery;
  }

  public NRPCeFcSpec nrpEdgeCeFcSpec(NRPEdgeCeFcSpec nrpEdgeCeFcSpec) {
    this.nrpEdgeCeFcSpec = nrpEdgeCeFcSpec;
    return this;
  }

   /**
   * Get nrpEdgeCeFcSpec
   * @return nrpEdgeCeFcSpec
  **/
  @JsonProperty("nrp_edgeCeFcSpec")
  @ApiModelProperty(value = "")
  public NRPEdgeCeFcSpec getNrpEdgeCeFcSpec() {
    return nrpEdgeCeFcSpec;
  }

  public void setNrpEdgeCeFcSpec(NRPEdgeCeFcSpec nrpEdgeCeFcSpec) {
    this.nrpEdgeCeFcSpec = nrpEdgeCeFcSpec;
  }

  public NRPCeFcSpec nrpTransitCeFcSpec(NRPTransitCeFcSpec nrpTransitCeFcSpec) {
    this.nrpTransitCeFcSpec = nrpTransitCeFcSpec;
    return this;
  }

   /**
   * Get nrpTransitCeFcSpec
   * @return nrpTransitCeFcSpec
  **/
  @JsonProperty("nrp_transitCeFcSpec")
  @ApiModelProperty(value = "")
  public NRPTransitCeFcSpec getNrpTransitCeFcSpec() {
    return nrpTransitCeFcSpec;
  }

  public void setNrpTransitCeFcSpec(NRPTransitCeFcSpec nrpTransitCeFcSpec) {
    this.nrpTransitCeFcSpec = nrpTransitCeFcSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPCeFcSpec nRPCeFcSpec = (NRPCeFcSpec) o;
    return Objects.equals(this.nrpConnectionType, nRPCeFcSpec.nrpConnectionType) &&
        Objects.equals(this.nrpUnicastFrameDelivery, nRPCeFcSpec.nrpUnicastFrameDelivery) &&
        Objects.equals(this.nrpMulticastFrameDelivery, nRPCeFcSpec.nrpMulticastFrameDelivery) &&
        Objects.equals(this.nrpBroadcastFrameDelivery, nRPCeFcSpec.nrpBroadcastFrameDelivery) &&
        Objects.equals(this.nrpEdgeCeFcSpec, nRPCeFcSpec.nrpEdgeCeFcSpec) &&
        Objects.equals(this.nrpTransitCeFcSpec, nRPCeFcSpec.nrpTransitCeFcSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpConnectionType, nrpUnicastFrameDelivery, nrpMulticastFrameDelivery, nrpBroadcastFrameDelivery, nrpEdgeCeFcSpec, nrpTransitCeFcSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPCeFcSpec {\n");
    
    sb.append("    nrpConnectionType: ").append(toIndentedString(nrpConnectionType)).append("\n");
    sb.append("    nrpUnicastFrameDelivery: ").append(toIndentedString(nrpUnicastFrameDelivery)).append("\n");
    sb.append("    nrpMulticastFrameDelivery: ").append(toIndentedString(nrpMulticastFrameDelivery)).append("\n");
    sb.append("    nrpBroadcastFrameDelivery: ").append(toIndentedString(nrpBroadcastFrameDelivery)).append("\n");
    sb.append("    nrpEdgeCeFcSpec: ").append(toIndentedString(nrpEdgeCeFcSpec)).append("\n");
    sb.append("    nrpTransitCeFcSpec: ").append(toIndentedString(nrpTransitCeFcSpec)).append("\n");
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

