package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * NRP Source MAC Address Limit. Mapping from MEF 10.3, Section 10.9
 **/

/**
 * NRP Source MAC Address Limit. Mapping from MEF 10.3, Section 10.9
 */
@ApiModel(description = "NRP Source MAC Address Limit. Mapping from MEF 10.3, Section 10.9")

public class NRPSourceMacAddressLimit   {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("timeInterval")
  private String timeInterval = null;

  public NRPSourceMacAddressLimit enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NRPSourceMacAddressLimit limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @JsonProperty("limit")
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public NRPSourceMacAddressLimit timeInterval(String timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }

   /**
   * Get timeInterval
   * @return timeInterval
  **/
  @JsonProperty("timeInterval")
  @ApiModelProperty(value = "")
  public String getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(String timeInterval) {
    this.timeInterval = timeInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPSourceMacAddressLimit nRPSourceMacAddressLimit = (NRPSourceMacAddressLimit) o;
    return Objects.equals(this.enabled, nRPSourceMacAddressLimit.enabled) &&
        Objects.equals(this.limit, nRPSourceMacAddressLimit.limit) &&
        Objects.equals(this.timeInterval, nRPSourceMacAddressLimit.timeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, limit, timeInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPSourceMacAddressLimit {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
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

