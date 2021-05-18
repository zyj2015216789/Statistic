package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPEecIdentifierNrpDscpeecid;
import org.onosproject.mefnrpapi.api.model.NRPEecIdentifierNrpL2cpeecid;
import org.onosproject.mefnrpapi.api.model.NRPEecIdentifierNrpPcpeecid;
import org.onosproject.mefnrpapi.api.model.NRPEecIdentifierNrpSoameecid;
import org.onosproject.mefnrpapi.api.model.NRPEecIdentifierServiceaccesspointeecid;



/**
 * Egress Equivalence Class Identifier - mapped from MEF 10.3, Section 10.4, Egress Equivalence Class Identifier Service Attribute.
 **/

/**
 * Egress Equivalence Class Identifier - mapped from MEF 10.3, Section 10.4, Egress Equivalence Class Identifier Service Attribute.
 */
@ApiModel(description = "Egress Equivalence Class Identifier - mapped from MEF 10.3, Section 10.4, Egress Equivalence Class Identifier Service Attribute.")

public class NRPEecIdentifier   {
  @JsonProperty("serviceaccesspointeecid")
  private NRPEecIdentifierServiceaccesspointeecid serviceaccesspointeecid = null;

  @JsonProperty("nrp_pcpeecid")
  private NRPEecIdentifierNrpPcpeecid nrpPcpeecid = null;

  @JsonProperty("nrp_dscpeecid")
  private NRPEecIdentifierNrpDscpeecid nrpDscpeecid = null;

  @JsonProperty("nrp_l2cpeecid")
  private NRPEecIdentifierNrpL2cpeecid nrpL2cpeecid = null;

  @JsonProperty("nrp_soameecid")
  private NRPEecIdentifierNrpSoameecid nrpSoameecid = null;

  public NRPEecIdentifier serviceaccesspointeecid(NRPEecIdentifierServiceaccesspointeecid serviceaccesspointeecid) {
    this.serviceaccesspointeecid = serviceaccesspointeecid;
    return this;
  }

   /**
   * Get serviceaccesspointeecid
   * @return serviceaccesspointeecid
  **/
  @JsonProperty("serviceaccesspointeecid")
  @ApiModelProperty(value = "")
  public NRPEecIdentifierServiceaccesspointeecid getServiceaccesspointeecid() {
    return serviceaccesspointeecid;
  }

  public void setServiceaccesspointeecid(NRPEecIdentifierServiceaccesspointeecid serviceaccesspointeecid) {
    this.serviceaccesspointeecid = serviceaccesspointeecid;
  }

  public NRPEecIdentifier nrpPcpeecid(NRPEecIdentifierNrpPcpeecid nrpPcpeecid) {
    this.nrpPcpeecid = nrpPcpeecid;
    return this;
  }

   /**
   * Get nrpPcpeecid
   * @return nrpPcpeecid
  **/
  @JsonProperty("nrp_pcpeecid")
  @ApiModelProperty(value = "")
  public NRPEecIdentifierNrpPcpeecid getNrpPcpeecid() {
    return nrpPcpeecid;
  }

  public void setNrpPcpeecid(NRPEecIdentifierNrpPcpeecid nrpPcpeecid) {
    this.nrpPcpeecid = nrpPcpeecid;
  }

  public NRPEecIdentifier nrpDscpeecid(NRPEecIdentifierNrpDscpeecid nrpDscpeecid) {
    this.nrpDscpeecid = nrpDscpeecid;
    return this;
  }

   /**
   * Get nrpDscpeecid
   * @return nrpDscpeecid
  **/
  @JsonProperty("nrp_dscpeecid")
  @ApiModelProperty(value = "")
  public NRPEecIdentifierNrpDscpeecid getNrpDscpeecid() {
    return nrpDscpeecid;
  }

  public void setNrpDscpeecid(NRPEecIdentifierNrpDscpeecid nrpDscpeecid) {
    this.nrpDscpeecid = nrpDscpeecid;
  }

  public NRPEecIdentifier nrpL2cpeecid(NRPEecIdentifierNrpL2cpeecid nrpL2cpeecid) {
    this.nrpL2cpeecid = nrpL2cpeecid;
    return this;
  }

   /**
   * Get nrpL2cpeecid
   * @return nrpL2cpeecid
  **/
  @JsonProperty("nrp_l2cpeecid")
  @ApiModelProperty(value = "")
  public NRPEecIdentifierNrpL2cpeecid getNrpL2cpeecid() {
    return nrpL2cpeecid;
  }

  public void setNrpL2cpeecid(NRPEecIdentifierNrpL2cpeecid nrpL2cpeecid) {
    this.nrpL2cpeecid = nrpL2cpeecid;
  }

  public NRPEecIdentifier nrpSoameecid(NRPEecIdentifierNrpSoameecid nrpSoameecid) {
    this.nrpSoameecid = nrpSoameecid;
    return this;
  }

   /**
   * Get nrpSoameecid
   * @return nrpSoameecid
  **/
  @JsonProperty("nrp_soameecid")
  @ApiModelProperty(value = "")
  public NRPEecIdentifierNrpSoameecid getNrpSoameecid() {
    return nrpSoameecid;
  }

  public void setNrpSoameecid(NRPEecIdentifierNrpSoameecid nrpSoameecid) {
    this.nrpSoameecid = nrpSoameecid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEecIdentifier nRPEecIdentifier = (NRPEecIdentifier) o;
    return Objects.equals(this.serviceaccesspointeecid, nRPEecIdentifier.serviceaccesspointeecid) &&
        Objects.equals(this.nrpPcpeecid, nRPEecIdentifier.nrpPcpeecid) &&
        Objects.equals(this.nrpDscpeecid, nRPEecIdentifier.nrpDscpeecid) &&
        Objects.equals(this.nrpL2cpeecid, nRPEecIdentifier.nrpL2cpeecid) &&
        Objects.equals(this.nrpSoameecid, nRPEecIdentifier.nrpSoameecid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceaccesspointeecid, nrpPcpeecid, nrpDscpeecid, nrpL2cpeecid, nrpSoameecid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEecIdentifier {\n");
    
    sb.append("    serviceaccesspointeecid: ").append(toIndentedString(serviceaccesspointeecid)).append("\n");
    sb.append("    nrpPcpeecid: ").append(toIndentedString(nrpPcpeecid)).append("\n");
    sb.append("    nrpDscpeecid: ").append(toIndentedString(nrpDscpeecid)).append("\n");
    sb.append("    nrpL2cpeecid: ").append(toIndentedString(nrpL2cpeecid)).append("\n");
    sb.append("    nrpSoameecid: ").append(toIndentedString(nrpSoameecid)).append("\n");
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

