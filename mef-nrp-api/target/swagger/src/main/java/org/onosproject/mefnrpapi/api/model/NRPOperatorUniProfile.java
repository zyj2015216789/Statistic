package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * NRP Operator UNI Profile - profile groups the UNI attributes (or their values) that are applicable to OVC (vs. applicable to EVC).
 **/

/**
 * NRP Operator UNI Profile - profile groups the UNI attributes (or their values) that are applicable to OVC (vs. applicable to EVC).
 */
@ApiModel(description = "NRP Operator UNI Profile - profile groups the UNI attributes (or their values) that are applicable to OVC (vs. applicable to EVC).")

public class NRPOperatorUniProfile   {
  @JsonProperty("nrp_operatorUniId")
  private String nrpOperatorUniId = null;

  @JsonProperty("nrp_maxNumOfOvcEndPoint")
  private Integer nrpMaxNumOfOvcEndPoint = null;

  @JsonProperty("nrp_maxNumOfCeVlanIdPerOvcEndPoint")
  private Integer nrpMaxNumOfCeVlanIdPerOvcEndPoint = null;

  public NRPOperatorUniProfile nrpOperatorUniId(String nrpOperatorUniId) {
    this.nrpOperatorUniId = nrpOperatorUniId;
    return this;
  }

   /**
   * 
   * @return nrpOperatorUniId
  **/
  @JsonProperty("nrp_operatorUniId")
  @ApiModelProperty(value = "")
  public String getNrpOperatorUniId() {
    return nrpOperatorUniId;
  }

  public void setNrpOperatorUniId(String nrpOperatorUniId) {
    this.nrpOperatorUniId = nrpOperatorUniId;
  }

  public NRPOperatorUniProfile nrpMaxNumOfOvcEndPoint(Integer nrpMaxNumOfOvcEndPoint) {
    this.nrpMaxNumOfOvcEndPoint = nrpMaxNumOfOvcEndPoint;
    return this;
  }

   /**
   * 
   * @return nrpMaxNumOfOvcEndPoint
  **/
  @JsonProperty("nrp_maxNumOfOvcEndPoint")
  @ApiModelProperty(value = "")
  public Integer getNrpMaxNumOfOvcEndPoint() {
    return nrpMaxNumOfOvcEndPoint;
  }

  public void setNrpMaxNumOfOvcEndPoint(Integer nrpMaxNumOfOvcEndPoint) {
    this.nrpMaxNumOfOvcEndPoint = nrpMaxNumOfOvcEndPoint;
  }

  public NRPOperatorUniProfile nrpMaxNumOfCeVlanIdPerOvcEndPoint(Integer nrpMaxNumOfCeVlanIdPerOvcEndPoint) {
    this.nrpMaxNumOfCeVlanIdPerOvcEndPoint = nrpMaxNumOfCeVlanIdPerOvcEndPoint;
    return this;
  }

   /**
   * 
   * @return nrpMaxNumOfCeVlanIdPerOvcEndPoint
  **/
  @JsonProperty("nrp_maxNumOfCeVlanIdPerOvcEndPoint")
  @ApiModelProperty(value = "")
  public Integer getNrpMaxNumOfCeVlanIdPerOvcEndPoint() {
    return nrpMaxNumOfCeVlanIdPerOvcEndPoint;
  }

  public void setNrpMaxNumOfCeVlanIdPerOvcEndPoint(Integer nrpMaxNumOfCeVlanIdPerOvcEndPoint) {
    this.nrpMaxNumOfCeVlanIdPerOvcEndPoint = nrpMaxNumOfCeVlanIdPerOvcEndPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPOperatorUniProfile nRPOperatorUniProfile = (NRPOperatorUniProfile) o;
    return Objects.equals(this.nrpOperatorUniId, nRPOperatorUniProfile.nrpOperatorUniId) &&
        Objects.equals(this.nrpMaxNumOfOvcEndPoint, nRPOperatorUniProfile.nrpMaxNumOfOvcEndPoint) &&
        Objects.equals(this.nrpMaxNumOfCeVlanIdPerOvcEndPoint, nRPOperatorUniProfile.nrpMaxNumOfCeVlanIdPerOvcEndPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpOperatorUniId, nrpMaxNumOfOvcEndPoint, nrpMaxNumOfCeVlanIdPerOvcEndPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPOperatorUniProfile {\n");
    
    sb.append("    nrpOperatorUniId: ").append(toIndentedString(nrpOperatorUniId)).append("\n");
    sb.append("    nrpMaxNumOfOvcEndPoint: ").append(toIndentedString(nrpMaxNumOfOvcEndPoint)).append("\n");
    sb.append("    nrpMaxNumOfCeVlanIdPerOvcEndPoint: ").append(toIndentedString(nrpMaxNumOfCeVlanIdPerOvcEndPoint)).append("\n");
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

