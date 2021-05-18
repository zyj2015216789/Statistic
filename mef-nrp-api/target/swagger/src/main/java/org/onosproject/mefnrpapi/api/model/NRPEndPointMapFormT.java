package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * S-VLAN IDs that maps to IVC Endpoint.
 **/

/**
 * S-VLAN IDs that maps to IVC Endpoint.
 */
@ApiModel(description = "S-VLAN IDs that maps to IVC Endpoint.")

public class NRPEndPointMapFormT   {
  @JsonProperty("nrp_svlanid")
  private List<String> nrpSvlanid = new ArrayList<String>();

  @JsonProperty("nrp_tpid")
  private List<String> nrpTpid = new ArrayList<String>();

  public NRPEndPointMapFormT nrpSvlanid(List<String> nrpSvlanid) {
    this.nrpSvlanid = nrpSvlanid;
    return this;
  }

  public NRPEndPointMapFormT addNrpSvlanidItem(String nrpSvlanidItem) {
    this.nrpSvlanid.add(nrpSvlanidItem);
    return this;
  }

   /**
   * Get nrpSvlanid
   * @return nrpSvlanid
  **/
  @JsonProperty("nrp_svlanid")
  @ApiModelProperty(value = "")
  public List<String> getNrpSvlanid() {
    return nrpSvlanid;
  }

  public void setNrpSvlanid(List<String> nrpSvlanid) {
    this.nrpSvlanid = nrpSvlanid;
  }

  public NRPEndPointMapFormT nrpTpid(List<String> nrpTpid) {
    this.nrpTpid = nrpTpid;
    return this;
  }

  public NRPEndPointMapFormT addNrpTpidItem(String nrpTpidItem) {
    this.nrpTpid.add(nrpTpidItem);
    return this;
  }

   /**
   * Get nrpTpid
   * @return nrpTpid
  **/
  @JsonProperty("nrp_tpid")
  @ApiModelProperty(value = "")
  public List<String> getNrpTpid() {
    return nrpTpid;
  }

  public void setNrpTpid(List<String> nrpTpid) {
    this.nrpTpid = nrpTpid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEndPointMapFormT nRPEndPointMapFormT = (NRPEndPointMapFormT) o;
    return Objects.equals(this.nrpSvlanid, nRPEndPointMapFormT.nrpSvlanid) &&
        Objects.equals(this.nrpTpid, nRPEndPointMapFormT.nrpTpid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpSvlanid, nrpTpid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEndPointMapFormT {\n");
    
    sb.append("    nrpSvlanid: ").append(toIndentedString(nrpSvlanid)).append("\n");
    sb.append("    nrpTpid: ").append(toIndentedString(nrpTpid)).append("\n");
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

