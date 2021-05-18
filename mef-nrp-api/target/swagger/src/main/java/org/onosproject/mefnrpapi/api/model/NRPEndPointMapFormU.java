package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * CE-VLAN IDs that maps to EVC Endpoint.
 **/

/**
 * CE-VLAN IDs that maps to EVC Endpoint.
 */
@ApiModel(description = "CE-VLAN IDs that maps to EVC Endpoint.")

public class NRPEndPointMapFormU   {
  @JsonProperty("nrp_cevlanid")
  private List<String> nrpCevlanid = new ArrayList<String>();

  public NRPEndPointMapFormU nrpCevlanid(List<String> nrpCevlanid) {
    this.nrpCevlanid = nrpCevlanid;
    return this;
  }

  public NRPEndPointMapFormU addNrpCevlanidItem(String nrpCevlanidItem) {
    this.nrpCevlanid.add(nrpCevlanidItem);
    return this;
  }

   /**
   * Get nrpCevlanid
   * @return nrpCevlanid
  **/
  @JsonProperty("nrp_cevlanid")
  @ApiModelProperty(value = "")
  public List<String> getNrpCevlanid() {
    return nrpCevlanid;
  }

  public void setNrpCevlanid(List<String> nrpCevlanid) {
    this.nrpCevlanid = nrpCevlanid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEndPointMapFormU nRPEndPointMapFormU = (NRPEndPointMapFormU) o;
    return Objects.equals(this.nrpCevlanid, nRPEndPointMapFormU.nrpCevlanid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpCevlanid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEndPointMapFormU {\n");
    
    sb.append("    nrpCevlanid: ").append(toIndentedString(nrpCevlanid)).append("\n");
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

