package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPL2cpAttributes;
import org.onosproject.mefnrpapi.api.model.NRPOperatorUniProfile;
import org.onosproject.mefnrpapi.api.model.NRPServiceProviderUniProfile;



/**
 * NRP UNI Termination Specification 
 **/

/**
 * NRP UNI Termination Specification 
 */
@ApiModel(description = "NRP UNI Termination Specification ")

public class NRPUNITerminationSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nrp_uniCfgCeVidUntagged")
  private Integer nrpUniCfgCeVidUntagged = null;

  @JsonProperty("nrp_serviceprovideruniprofile")
  private NRPServiceProviderUniProfile nrpServiceprovideruniprofile = null;

  @JsonProperty("nrp_operatoruniprofile")
  private NRPOperatorUniProfile nrpOperatoruniprofile = null;

  @JsonProperty("nrp_L2cpAttributes")
  private NRPL2cpAttributes nrpL2cpAttributes = null;

  public NRPUNITerminationSpec id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NRPUNITerminationSpec nrpUniCfgCeVidUntagged(Integer nrpUniCfgCeVidUntagged) {
    this.nrpUniCfgCeVidUntagged = nrpUniCfgCeVidUntagged;
    return this;
  }

   /**
   * CE-VLAN ID for Untagged and Priority Tagged Service Frames. MEF 10.3, Section 9.9
   * @return nrpUniCfgCeVidUntagged
  **/
  @JsonProperty("nrp_uniCfgCeVidUntagged")
  @ApiModelProperty(value = "CE-VLAN ID for Untagged and Priority Tagged Service Frames. MEF 10.3, Section 9.9")
  public Integer getNrpUniCfgCeVidUntagged() {
    return nrpUniCfgCeVidUntagged;
  }

  public void setNrpUniCfgCeVidUntagged(Integer nrpUniCfgCeVidUntagged) {
    this.nrpUniCfgCeVidUntagged = nrpUniCfgCeVidUntagged;
  }

  public NRPUNITerminationSpec nrpServiceprovideruniprofile(NRPServiceProviderUniProfile nrpServiceprovideruniprofile) {
    this.nrpServiceprovideruniprofile = nrpServiceprovideruniprofile;
    return this;
  }

   /**
   * Get nrpServiceprovideruniprofile
   * @return nrpServiceprovideruniprofile
  **/
  @JsonProperty("nrp_serviceprovideruniprofile")
  @ApiModelProperty(value = "")
  public NRPServiceProviderUniProfile getNrpServiceprovideruniprofile() {
    return nrpServiceprovideruniprofile;
  }

  public void setNrpServiceprovideruniprofile(NRPServiceProviderUniProfile nrpServiceprovideruniprofile) {
    this.nrpServiceprovideruniprofile = nrpServiceprovideruniprofile;
  }

  public NRPUNITerminationSpec nrpOperatoruniprofile(NRPOperatorUniProfile nrpOperatoruniprofile) {
    this.nrpOperatoruniprofile = nrpOperatoruniprofile;
    return this;
  }

   /**
   * Get nrpOperatoruniprofile
   * @return nrpOperatoruniprofile
  **/
  @JsonProperty("nrp_operatoruniprofile")
  @ApiModelProperty(value = "")
  public NRPOperatorUniProfile getNrpOperatoruniprofile() {
    return nrpOperatoruniprofile;
  }

  public void setNrpOperatoruniprofile(NRPOperatorUniProfile nrpOperatoruniprofile) {
    this.nrpOperatoruniprofile = nrpOperatoruniprofile;
  }

  public NRPUNITerminationSpec nrpL2cpAttributes(NRPL2cpAttributes nrpL2cpAttributes) {
    this.nrpL2cpAttributes = nrpL2cpAttributes;
    return this;
  }

   /**
   * Get nrpL2cpAttributes
   * @return nrpL2cpAttributes
  **/
  @JsonProperty("nrp_L2cpAttributes")
  @ApiModelProperty(value = "")
  public NRPL2cpAttributes getNrpL2cpAttributes() {
    return nrpL2cpAttributes;
  }

  public void setNrpL2cpAttributes(NRPL2cpAttributes nrpL2cpAttributes) {
    this.nrpL2cpAttributes = nrpL2cpAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPUNITerminationSpec nRPUNITerminationSpec = (NRPUNITerminationSpec) o;
    return Objects.equals(this.id, nRPUNITerminationSpec.id) &&
        Objects.equals(this.nrpUniCfgCeVidUntagged, nRPUNITerminationSpec.nrpUniCfgCeVidUntagged) &&
        Objects.equals(this.nrpServiceprovideruniprofile, nRPUNITerminationSpec.nrpServiceprovideruniprofile) &&
        Objects.equals(this.nrpOperatoruniprofile, nRPUNITerminationSpec.nrpOperatoruniprofile) &&
        Objects.equals(this.nrpL2cpAttributes, nRPUNITerminationSpec.nrpL2cpAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nrpUniCfgCeVidUntagged, nrpServiceprovideruniprofile, nrpOperatoruniprofile, nrpL2cpAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPUNITerminationSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nrpUniCfgCeVidUntagged: ").append(toIndentedString(nrpUniCfgCeVidUntagged)).append("\n");
    sb.append("    nrpServiceprovideruniprofile: ").append(toIndentedString(nrpServiceprovideruniprofile)).append("\n");
    sb.append("    nrpOperatoruniprofile: ").append(toIndentedString(nrpOperatoruniprofile)).append("\n");
    sb.append("    nrpL2cpAttributes: ").append(toIndentedString(nrpL2cpAttributes)).append("\n");
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

