package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A set of parameters for service frames for traffic flow using Hierarchical Bandwidth Profile as defined in MEF 10.3.
 **/

/**
 * A set of parameters for service frames for traffic flow using Hierarchical Bandwidth Profile as defined in MEF 10.3.
 */
@ApiModel(description = "A set of parameters for service frames for traffic flow using Hierarchical Bandwidth Profile as defined in MEF 10.3.")

public class NRPBwpFlow   {
  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("rank")
  private String rank = null;

  @JsonProperty("bwpCfgEirMax")
  private Integer bwpCfgEirMax = null;

  @JsonProperty("bwpCfgIdentifier")
  private String bwpCfgIdentifier = null;

  @JsonProperty("bwpCfgCir")
  private Integer bwpCfgCir = null;

  @JsonProperty("bwpCfgCirMax")
  private Integer bwpCfgCirMax = null;

  @JsonProperty("bwpCfgCbs")
  private Integer bwpCfgCbs = null;

  @JsonProperty("bwpCfgEir")
  private Integer bwpCfgEir = null;

  @JsonProperty("bwpCfgEbs")
  private Integer bwpCfgEbs = null;

  @JsonProperty("bwpCfgCm")
  private String bwpCfgCm = null;

  @JsonProperty("bwpCfgCf")
  private String bwpCfgCf = null;

  public NRPBwpFlow envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * Get envelopeId
   * @return envelopeId
  **/
  @JsonProperty("envelopeId")
  @ApiModelProperty(value = "")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public NRPBwpFlow rank(String rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @JsonProperty("rank")
  @ApiModelProperty(value = "")
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public NRPBwpFlow bwpCfgEirMax(Integer bwpCfgEirMax) {
    this.bwpCfgEirMax = bwpCfgEirMax;
    return this;
  }

   /**
   * Get bwpCfgEirMax
   * @return bwpCfgEirMax
  **/
  @JsonProperty("bwpCfgEirMax")
  @ApiModelProperty(value = "")
  public Integer getBwpCfgEirMax() {
    return bwpCfgEirMax;
  }

  public void setBwpCfgEirMax(Integer bwpCfgEirMax) {
    this.bwpCfgEirMax = bwpCfgEirMax;
  }

  public NRPBwpFlow bwpCfgIdentifier(String bwpCfgIdentifier) {
    this.bwpCfgIdentifier = bwpCfgIdentifier;
    return this;
  }

   /**
   * Get bwpCfgIdentifier
   * @return bwpCfgIdentifier
  **/
  @JsonProperty("bwpCfgIdentifier")
  @ApiModelProperty(value = "")
  public String getBwpCfgIdentifier() {
    return bwpCfgIdentifier;
  }

  public void setBwpCfgIdentifier(String bwpCfgIdentifier) {
    this.bwpCfgIdentifier = bwpCfgIdentifier;
  }

  public NRPBwpFlow bwpCfgCir(Integer bwpCfgCir) {
    this.bwpCfgCir = bwpCfgCir;
    return this;
  }

   /**
   * Get bwpCfgCir
   * @return bwpCfgCir
  **/
  @JsonProperty("bwpCfgCir")
  @ApiModelProperty(value = "")
  public Integer getBwpCfgCir() {
    return bwpCfgCir;
  }

  public void setBwpCfgCir(Integer bwpCfgCir) {
    this.bwpCfgCir = bwpCfgCir;
  }

  public NRPBwpFlow bwpCfgCirMax(Integer bwpCfgCirMax) {
    this.bwpCfgCirMax = bwpCfgCirMax;
    return this;
  }

   /**
   * Get bwpCfgCirMax
   * @return bwpCfgCirMax
  **/
  @JsonProperty("bwpCfgCirMax")
  @ApiModelProperty(value = "")
  public Integer getBwpCfgCirMax() {
    return bwpCfgCirMax;
  }

  public void setBwpCfgCirMax(Integer bwpCfgCirMax) {
    this.bwpCfgCirMax = bwpCfgCirMax;
  }

  public NRPBwpFlow bwpCfgCbs(Integer bwpCfgCbs) {
    this.bwpCfgCbs = bwpCfgCbs;
    return this;
  }

   /**
   * Get bwpCfgCbs
   * @return bwpCfgCbs
  **/
  @JsonProperty("bwpCfgCbs")
  @ApiModelProperty(value = "")
  public Integer getBwpCfgCbs() {
    return bwpCfgCbs;
  }

  public void setBwpCfgCbs(Integer bwpCfgCbs) {
    this.bwpCfgCbs = bwpCfgCbs;
  }

  public NRPBwpFlow bwpCfgEir(Integer bwpCfgEir) {
    this.bwpCfgEir = bwpCfgEir;
    return this;
  }

   /**
   * Get bwpCfgEir
   * @return bwpCfgEir
  **/
  @JsonProperty("bwpCfgEir")
  @ApiModelProperty(value = "")
  public Integer getBwpCfgEir() {
    return bwpCfgEir;
  }

  public void setBwpCfgEir(Integer bwpCfgEir) {
    this.bwpCfgEir = bwpCfgEir;
  }

  public NRPBwpFlow bwpCfgEbs(Integer bwpCfgEbs) {
    this.bwpCfgEbs = bwpCfgEbs;
    return this;
  }

   /**
   * Get bwpCfgEbs
   * @return bwpCfgEbs
  **/
  @JsonProperty("bwpCfgEbs")
  @ApiModelProperty(value = "")
  public Integer getBwpCfgEbs() {
    return bwpCfgEbs;
  }

  public void setBwpCfgEbs(Integer bwpCfgEbs) {
    this.bwpCfgEbs = bwpCfgEbs;
  }

  public NRPBwpFlow bwpCfgCm(String bwpCfgCm) {
    this.bwpCfgCm = bwpCfgCm;
    return this;
  }

   /**
   * Get bwpCfgCm
   * @return bwpCfgCm
  **/
  @JsonProperty("bwpCfgCm")
  @ApiModelProperty(value = "")
  public String getBwpCfgCm() {
    return bwpCfgCm;
  }

  public void setBwpCfgCm(String bwpCfgCm) {
    this.bwpCfgCm = bwpCfgCm;
  }

  public NRPBwpFlow bwpCfgCf(String bwpCfgCf) {
    this.bwpCfgCf = bwpCfgCf;
    return this;
  }

   /**
   * Get bwpCfgCf
   * @return bwpCfgCf
  **/
  @JsonProperty("bwpCfgCf")
  @ApiModelProperty(value = "")
  public String getBwpCfgCf() {
    return bwpCfgCf;
  }

  public void setBwpCfgCf(String bwpCfgCf) {
    this.bwpCfgCf = bwpCfgCf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPBwpFlow nRPBwpFlow = (NRPBwpFlow) o;
    return Objects.equals(this.envelopeId, nRPBwpFlow.envelopeId) &&
        Objects.equals(this.rank, nRPBwpFlow.rank) &&
        Objects.equals(this.bwpCfgEirMax, nRPBwpFlow.bwpCfgEirMax) &&
        Objects.equals(this.bwpCfgIdentifier, nRPBwpFlow.bwpCfgIdentifier) &&
        Objects.equals(this.bwpCfgCir, nRPBwpFlow.bwpCfgCir) &&
        Objects.equals(this.bwpCfgCirMax, nRPBwpFlow.bwpCfgCirMax) &&
        Objects.equals(this.bwpCfgCbs, nRPBwpFlow.bwpCfgCbs) &&
        Objects.equals(this.bwpCfgEir, nRPBwpFlow.bwpCfgEir) &&
        Objects.equals(this.bwpCfgEbs, nRPBwpFlow.bwpCfgEbs) &&
        Objects.equals(this.bwpCfgCm, nRPBwpFlow.bwpCfgCm) &&
        Objects.equals(this.bwpCfgCf, nRPBwpFlow.bwpCfgCf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeId, rank, bwpCfgEirMax, bwpCfgIdentifier, bwpCfgCir, bwpCfgCirMax, bwpCfgCbs, bwpCfgEir, bwpCfgEbs, bwpCfgCm, bwpCfgCf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPBwpFlow {\n");
    
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    bwpCfgEirMax: ").append(toIndentedString(bwpCfgEirMax)).append("\n");
    sb.append("    bwpCfgIdentifier: ").append(toIndentedString(bwpCfgIdentifier)).append("\n");
    sb.append("    bwpCfgCir: ").append(toIndentedString(bwpCfgCir)).append("\n");
    sb.append("    bwpCfgCirMax: ").append(toIndentedString(bwpCfgCirMax)).append("\n");
    sb.append("    bwpCfgCbs: ").append(toIndentedString(bwpCfgCbs)).append("\n");
    sb.append("    bwpCfgEir: ").append(toIndentedString(bwpCfgEir)).append("\n");
    sb.append("    bwpCfgEbs: ").append(toIndentedString(bwpCfgEbs)).append("\n");
    sb.append("    bwpCfgCm: ").append(toIndentedString(bwpCfgCm)).append("\n");
    sb.append("    bwpCfgCf: ").append(toIndentedString(bwpCfgCf)).append("\n");
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

