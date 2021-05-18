package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPEndPointMapFormT;
import org.onosproject.mefnrpapi.api.model.NRPEndPointMapFormU;



/**
 * CE-VLAN IDs that maps to EVC/OVC/IVC.
 **/

/**
 * CE-VLAN IDs that maps to EVC/OVC/IVC.
 */
@ApiModel(description = "CE-VLAN IDs that maps to EVC/OVC/IVC.")

public class NRPEndPointMap   {
  @JsonProperty("nrp_endPointMapFormU")
  private NRPEndPointMapFormU nrpEndPointMapFormU = null;

  @JsonProperty("nrp_endPointMapFormT")
  private NRPEndPointMapFormT nrpEndPointMapFormT = null;

  public NRPEndPointMap nrpEndPointMapFormU(NRPEndPointMapFormU nrpEndPointMapFormU) {
    this.nrpEndPointMapFormU = nrpEndPointMapFormU;
    return this;
  }

   /**
   * Get nrpEndPointMapFormU
   * @return nrpEndPointMapFormU
  **/
  @JsonProperty("nrp_endPointMapFormU")
  @ApiModelProperty(value = "")
  public NRPEndPointMapFormU getNrpEndPointMapFormU() {
    return nrpEndPointMapFormU;
  }

  public void setNrpEndPointMapFormU(NRPEndPointMapFormU nrpEndPointMapFormU) {
    this.nrpEndPointMapFormU = nrpEndPointMapFormU;
  }

  public NRPEndPointMap nrpEndPointMapFormT(NRPEndPointMapFormT nrpEndPointMapFormT) {
    this.nrpEndPointMapFormT = nrpEndPointMapFormT;
    return this;
  }

   /**
   * Get nrpEndPointMapFormT
   * @return nrpEndPointMapFormT
  **/
  @JsonProperty("nrp_endPointMapFormT")
  @ApiModelProperty(value = "")
  public NRPEndPointMapFormT getNrpEndPointMapFormT() {
    return nrpEndPointMapFormT;
  }

  public void setNrpEndPointMapFormT(NRPEndPointMapFormT nrpEndPointMapFormT) {
    this.nrpEndPointMapFormT = nrpEndPointMapFormT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPEndPointMap nRPEndPointMap = (NRPEndPointMap) o;
    return Objects.equals(this.nrpEndPointMapFormU, nRPEndPointMap.nrpEndPointMapFormU) &&
        Objects.equals(this.nrpEndPointMapFormT, nRPEndPointMap.nrpEndPointMapFormT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpEndPointMapFormU, nrpEndPointMapFormT);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPEndPointMap {\n");
    
    sb.append("    nrpEndPointMapFormU: ").append(toIndentedString(nrpEndPointMapFormU)).append("\n");
    sb.append("    nrpEndPointMapFormT: ").append(toIndentedString(nrpEndPointMapFormT)).append("\n");
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

