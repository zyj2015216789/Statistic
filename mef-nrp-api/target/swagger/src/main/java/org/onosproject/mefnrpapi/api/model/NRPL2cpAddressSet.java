package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPL2cpAddressSetFilteredBy;



/**
 * NRP Layer 2 Control Protocol Address Set
 **/

/**
 * NRP Layer 2 Control Protocol Address Set
 */
@ApiModel(description = "NRP Layer 2 Control Protocol Address Set")

public class NRPL2cpAddressSet   {
  @JsonProperty("l2cpDestinationAddress")
  private String l2cpDestinationAddress = null;

  @JsonProperty("assignment8021Q")
  private String assignment8021Q = null;

  @JsonProperty("filteredBy")
  private NRPL2cpAddressSetFilteredBy filteredBy = null;

  public NRPL2cpAddressSet l2cpDestinationAddress(String l2cpDestinationAddress) {
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

  public NRPL2cpAddressSet assignment8021Q(String assignment8021Q) {
    this.assignment8021Q = assignment8021Q;
    return this;
  }

   /**
   * Get assignment8021Q
   * @return assignment8021Q
  **/
  @JsonProperty("assignment8021Q")
  @ApiModelProperty(value = "")
  public String getAssignment8021Q() {
    return assignment8021Q;
  }

  public void setAssignment8021Q(String assignment8021Q) {
    this.assignment8021Q = assignment8021Q;
  }

  public NRPL2cpAddressSet filteredBy(NRPL2cpAddressSetFilteredBy filteredBy) {
    this.filteredBy = filteredBy;
    return this;
  }

   /**
   * Get filteredBy
   * @return filteredBy
  **/
  @JsonProperty("filteredBy")
  @ApiModelProperty(value = "")
  public NRPL2cpAddressSetFilteredBy getFilteredBy() {
    return filteredBy;
  }

  public void setFilteredBy(NRPL2cpAddressSetFilteredBy filteredBy) {
    this.filteredBy = filteredBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPL2cpAddressSet nRPL2cpAddressSet = (NRPL2cpAddressSet) o;
    return Objects.equals(this.l2cpDestinationAddress, nRPL2cpAddressSet.l2cpDestinationAddress) &&
        Objects.equals(this.assignment8021Q, nRPL2cpAddressSet.assignment8021Q) &&
        Objects.equals(this.filteredBy, nRPL2cpAddressSet.filteredBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l2cpDestinationAddress, assignment8021Q, filteredBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPL2cpAddressSet {\n");
    
    sb.append("    l2cpDestinationAddress: ").append(toIndentedString(l2cpDestinationAddress)).append("\n");
    sb.append("    assignment8021Q: ").append(toIndentedString(assignment8021Q)).append("\n");
    sb.append("    filteredBy: ").append(toIndentedString(filteredBy)).append("\n");
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

