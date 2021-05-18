package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * NRP Service Provider UNI Profile
 **/

/**
 * NRP Service Provider UNI Profile
 */
@ApiModel(description = "NRP Service Provider UNI Profile")

public class NRPServiceProviderUniProfile   {
  @JsonProperty("nrp_maxNumOfEvc")
  private Integer nrpMaxNumOfEvc = null;

  @JsonProperty("nrp_bundlingEnabled")
  private Boolean nrpBundlingEnabled = null;

  @JsonProperty("nrp_allToOneBundlingEnabled")
  private Boolean nrpAllToOneBundlingEnabled = null;

  @JsonProperty("nrp_serviceMultiplexingEnabled")
  private Boolean nrpServiceMultiplexingEnabled = null;

  public NRPServiceProviderUniProfile nrpMaxNumOfEvc(Integer nrpMaxNumOfEvc) {
    this.nrpMaxNumOfEvc = nrpMaxNumOfEvc;
    return this;
  }

   /**
   * Maximum Number of EVCs - MEF 10.3, Section 9.11
   * @return nrpMaxNumOfEvc
  **/
  @JsonProperty("nrp_maxNumOfEvc")
  @ApiModelProperty(value = "Maximum Number of EVCs - MEF 10.3, Section 9.11")
  public Integer getNrpMaxNumOfEvc() {
    return nrpMaxNumOfEvc;
  }

  public void setNrpMaxNumOfEvc(Integer nrpMaxNumOfEvc) {
    this.nrpMaxNumOfEvc = nrpMaxNumOfEvc;
  }

  public NRPServiceProviderUniProfile nrpBundlingEnabled(Boolean nrpBundlingEnabled) {
    this.nrpBundlingEnabled = nrpBundlingEnabled;
    return this;
  }

   /**
   * Bundling - MEF 10.3, Section 9.12
   * @return nrpBundlingEnabled
  **/
  @JsonProperty("nrp_bundlingEnabled")
  @ApiModelProperty(value = "Bundling - MEF 10.3, Section 9.12")
  public Boolean getNrpBundlingEnabled() {
    return nrpBundlingEnabled;
  }

  public void setNrpBundlingEnabled(Boolean nrpBundlingEnabled) {
    this.nrpBundlingEnabled = nrpBundlingEnabled;
  }

  public NRPServiceProviderUniProfile nrpAllToOneBundlingEnabled(Boolean nrpAllToOneBundlingEnabled) {
    this.nrpAllToOneBundlingEnabled = nrpAllToOneBundlingEnabled;
    return this;
  }

   /**
   * All to One Bundling - MEF 10.3, Section 9.13
   * @return nrpAllToOneBundlingEnabled
  **/
  @JsonProperty("nrp_allToOneBundlingEnabled")
  @ApiModelProperty(value = "All to One Bundling - MEF 10.3, Section 9.13")
  public Boolean getNrpAllToOneBundlingEnabled() {
    return nrpAllToOneBundlingEnabled;
  }

  public void setNrpAllToOneBundlingEnabled(Boolean nrpAllToOneBundlingEnabled) {
    this.nrpAllToOneBundlingEnabled = nrpAllToOneBundlingEnabled;
  }

  public NRPServiceProviderUniProfile nrpServiceMultiplexingEnabled(Boolean nrpServiceMultiplexingEnabled) {
    this.nrpServiceMultiplexingEnabled = nrpServiceMultiplexingEnabled;
    return this;
  }

   /**
   * Service Multiplexing - MEF 10.3, Section 9.18
   * @return nrpServiceMultiplexingEnabled
  **/
  @JsonProperty("nrp_serviceMultiplexingEnabled")
  @ApiModelProperty(value = "Service Multiplexing - MEF 10.3, Section 9.18")
  public Boolean getNrpServiceMultiplexingEnabled() {
    return nrpServiceMultiplexingEnabled;
  }

  public void setNrpServiceMultiplexingEnabled(Boolean nrpServiceMultiplexingEnabled) {
    this.nrpServiceMultiplexingEnabled = nrpServiceMultiplexingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPServiceProviderUniProfile nRPServiceProviderUniProfile = (NRPServiceProviderUniProfile) o;
    return Objects.equals(this.nrpMaxNumOfEvc, nRPServiceProviderUniProfile.nrpMaxNumOfEvc) &&
        Objects.equals(this.nrpBundlingEnabled, nRPServiceProviderUniProfile.nrpBundlingEnabled) &&
        Objects.equals(this.nrpAllToOneBundlingEnabled, nRPServiceProviderUniProfile.nrpAllToOneBundlingEnabled) &&
        Objects.equals(this.nrpServiceMultiplexingEnabled, nRPServiceProviderUniProfile.nrpServiceMultiplexingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpMaxNumOfEvc, nrpBundlingEnabled, nrpAllToOneBundlingEnabled, nrpServiceMultiplexingEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPServiceProviderUniProfile {\n");
    
    sb.append("    nrpMaxNumOfEvc: ").append(toIndentedString(nrpMaxNumOfEvc)).append("\n");
    sb.append("    nrpBundlingEnabled: ").append(toIndentedString(nrpBundlingEnabled)).append("\n");
    sb.append("    nrpAllToOneBundlingEnabled: ").append(toIndentedString(nrpAllToOneBundlingEnabled)).append("\n");
    sb.append("    nrpServiceMultiplexingEnabled: ").append(toIndentedString(nrpServiceMultiplexingEnabled)).append("\n");
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

