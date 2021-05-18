package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPDataFrameCosIdentifierNrpDscpCosId;
import org.onosproject.mefnrpapi.api.model.NRPDataFrameCosIdentifierNrpEndPointCosId;
import org.onosproject.mefnrpapi.api.model.NRPDataFrameCosIdentifierNrpL2cpCosId;
import org.onosproject.mefnrpapi.api.model.NRPDataFrameCosIdentifierNrpPcpCosId;
import org.onosproject.mefnrpapi.api.model.NRPDataFrameCosIdentifierNrpSoamCosId;



/**
 * NRP CoS Identifier - mapped from MEF 10.3, Section 10.2, Class of Service Identifiers.
 **/

/**
 * NRP CoS Identifier - mapped from MEF 10.3, Section 10.2, Class of Service Identifiers.
 */
@ApiModel(description = "NRP CoS Identifier - mapped from MEF 10.3, Section 10.2, Class of Service Identifiers.")

public class NRPDataFrameCosIdentifier   {
  @JsonProperty("nrp_endPointCosId")
  private NRPDataFrameCosIdentifierNrpEndPointCosId nrpEndPointCosId = null;

  @JsonProperty("nrp_pcpCosId")
  private NRPDataFrameCosIdentifierNrpPcpCosId nrpPcpCosId = null;

  @JsonProperty("nrp_dscpCosId")
  private NRPDataFrameCosIdentifierNrpDscpCosId nrpDscpCosId = null;

  @JsonProperty("nrp_L2cpCosId")
  private NRPDataFrameCosIdentifierNrpL2cpCosId nrpL2cpCosId = null;

  @JsonProperty("nrp_SoamCosId")
  private NRPDataFrameCosIdentifierNrpSoamCosId nrpSoamCosId = null;

  public NRPDataFrameCosIdentifier nrpEndPointCosId(NRPDataFrameCosIdentifierNrpEndPointCosId nrpEndPointCosId) {
    this.nrpEndPointCosId = nrpEndPointCosId;
    return this;
  }

   /**
   * Get nrpEndPointCosId
   * @return nrpEndPointCosId
  **/
  @JsonProperty("nrp_endPointCosId")
  @ApiModelProperty(value = "")
  public NRPDataFrameCosIdentifierNrpEndPointCosId getNrpEndPointCosId() {
    return nrpEndPointCosId;
  }

  public void setNrpEndPointCosId(NRPDataFrameCosIdentifierNrpEndPointCosId nrpEndPointCosId) {
    this.nrpEndPointCosId = nrpEndPointCosId;
  }

  public NRPDataFrameCosIdentifier nrpPcpCosId(NRPDataFrameCosIdentifierNrpPcpCosId nrpPcpCosId) {
    this.nrpPcpCosId = nrpPcpCosId;
    return this;
  }

   /**
   * Get nrpPcpCosId
   * @return nrpPcpCosId
  **/
  @JsonProperty("nrp_pcpCosId")
  @ApiModelProperty(value = "")
  public NRPDataFrameCosIdentifierNrpPcpCosId getNrpPcpCosId() {
    return nrpPcpCosId;
  }

  public void setNrpPcpCosId(NRPDataFrameCosIdentifierNrpPcpCosId nrpPcpCosId) {
    this.nrpPcpCosId = nrpPcpCosId;
  }

  public NRPDataFrameCosIdentifier nrpDscpCosId(NRPDataFrameCosIdentifierNrpDscpCosId nrpDscpCosId) {
    this.nrpDscpCosId = nrpDscpCosId;
    return this;
  }

   /**
   * Get nrpDscpCosId
   * @return nrpDscpCosId
  **/
  @JsonProperty("nrp_dscpCosId")
  @ApiModelProperty(value = "")
  public NRPDataFrameCosIdentifierNrpDscpCosId getNrpDscpCosId() {
    return nrpDscpCosId;
  }

  public void setNrpDscpCosId(NRPDataFrameCosIdentifierNrpDscpCosId nrpDscpCosId) {
    this.nrpDscpCosId = nrpDscpCosId;
  }

  public NRPDataFrameCosIdentifier nrpL2cpCosId(NRPDataFrameCosIdentifierNrpL2cpCosId nrpL2cpCosId) {
    this.nrpL2cpCosId = nrpL2cpCosId;
    return this;
  }

   /**
   * Get nrpL2cpCosId
   * @return nrpL2cpCosId
  **/
  @JsonProperty("nrp_L2cpCosId")
  @ApiModelProperty(value = "")
  public NRPDataFrameCosIdentifierNrpL2cpCosId getNrpL2cpCosId() {
    return nrpL2cpCosId;
  }

  public void setNrpL2cpCosId(NRPDataFrameCosIdentifierNrpL2cpCosId nrpL2cpCosId) {
    this.nrpL2cpCosId = nrpL2cpCosId;
  }

  public NRPDataFrameCosIdentifier nrpSoamCosId(NRPDataFrameCosIdentifierNrpSoamCosId nrpSoamCosId) {
    this.nrpSoamCosId = nrpSoamCosId;
    return this;
  }

   /**
   * Get nrpSoamCosId
   * @return nrpSoamCosId
  **/
  @JsonProperty("nrp_SoamCosId")
  @ApiModelProperty(value = "")
  public NRPDataFrameCosIdentifierNrpSoamCosId getNrpSoamCosId() {
    return nrpSoamCosId;
  }

  public void setNrpSoamCosId(NRPDataFrameCosIdentifierNrpSoamCosId nrpSoamCosId) {
    this.nrpSoamCosId = nrpSoamCosId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPDataFrameCosIdentifier nRPDataFrameCosIdentifier = (NRPDataFrameCosIdentifier) o;
    return Objects.equals(this.nrpEndPointCosId, nRPDataFrameCosIdentifier.nrpEndPointCosId) &&
        Objects.equals(this.nrpPcpCosId, nRPDataFrameCosIdentifier.nrpPcpCosId) &&
        Objects.equals(this.nrpDscpCosId, nRPDataFrameCosIdentifier.nrpDscpCosId) &&
        Objects.equals(this.nrpL2cpCosId, nRPDataFrameCosIdentifier.nrpL2cpCosId) &&
        Objects.equals(this.nrpSoamCosId, nRPDataFrameCosIdentifier.nrpSoamCosId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpEndPointCosId, nrpPcpCosId, nrpDscpCosId, nrpL2cpCosId, nrpSoamCosId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPDataFrameCosIdentifier {\n");
    
    sb.append("    nrpEndPointCosId: ").append(toIndentedString(nrpEndPointCosId)).append("\n");
    sb.append("    nrpPcpCosId: ").append(toIndentedString(nrpPcpCosId)).append("\n");
    sb.append("    nrpDscpCosId: ").append(toIndentedString(nrpDscpCosId)).append("\n");
    sb.append("    nrpL2cpCosId: ").append(toIndentedString(nrpL2cpCosId)).append("\n");
    sb.append("    nrpSoamCosId: ").append(toIndentedString(nrpSoamCosId)).append("\n");
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

