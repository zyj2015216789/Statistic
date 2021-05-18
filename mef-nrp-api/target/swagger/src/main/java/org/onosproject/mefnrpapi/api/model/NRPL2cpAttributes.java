package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.onosproject.mefnrpapi.api.model.NRPL2cpAddressSet;
import org.onosproject.mefnrpapi.api.model.NRPL2cpPeering;



/**
 * MEF NRP Layer 2 Control Protocols Processing.
 **/

/**
 * MEF NRP Layer 2 Control Protocols Processing.
 */
@ApiModel(description = "MEF NRP Layer 2 Control Protocols Processing.")

public class NRPL2cpAttributes   {
  @JsonProperty("nrp_l2cpAddressSet")
  private List<NRPL2cpAddressSet> nrpL2cpAddressSet = new ArrayList<NRPL2cpAddressSet>();

  @JsonProperty("nrp_l2cpPeering")
  private List<NRPL2cpPeering> nrpL2cpPeering = new ArrayList<NRPL2cpPeering>();

  public NRPL2cpAttributes nrpL2cpAddressSet(List<NRPL2cpAddressSet> nrpL2cpAddressSet) {
    this.nrpL2cpAddressSet = nrpL2cpAddressSet;
    return this;
  }

  public NRPL2cpAttributes addNrpL2cpAddressSetItem(NRPL2cpAddressSet nrpL2cpAddressSetItem) {
    this.nrpL2cpAddressSet.add(nrpL2cpAddressSetItem);
    return this;
  }

   /**
   * Get nrpL2cpAddressSet
   * @return nrpL2cpAddressSet
  **/
  @JsonProperty("nrp_l2cpAddressSet")
  @ApiModelProperty(value = "")
  public List<NRPL2cpAddressSet> getNrpL2cpAddressSet() {
    return nrpL2cpAddressSet;
  }

  public void setNrpL2cpAddressSet(List<NRPL2cpAddressSet> nrpL2cpAddressSet) {
    this.nrpL2cpAddressSet = nrpL2cpAddressSet;
  }

  public NRPL2cpAttributes nrpL2cpPeering(List<NRPL2cpPeering> nrpL2cpPeering) {
    this.nrpL2cpPeering = nrpL2cpPeering;
    return this;
  }

  public NRPL2cpAttributes addNrpL2cpPeeringItem(NRPL2cpPeering nrpL2cpPeeringItem) {
    this.nrpL2cpPeering.add(nrpL2cpPeeringItem);
    return this;
  }

   /**
   * Get nrpL2cpPeering
   * @return nrpL2cpPeering
  **/
  @JsonProperty("nrp_l2cpPeering")
  @ApiModelProperty(value = "")
  public List<NRPL2cpPeering> getNrpL2cpPeering() {
    return nrpL2cpPeering;
  }

  public void setNrpL2cpPeering(List<NRPL2cpPeering> nrpL2cpPeering) {
    this.nrpL2cpPeering = nrpL2cpPeering;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPL2cpAttributes nRPL2cpAttributes = (NRPL2cpAttributes) o;
    return Objects.equals(this.nrpL2cpAddressSet, nRPL2cpAttributes.nrpL2cpAddressSet) &&
        Objects.equals(this.nrpL2cpPeering, nRPL2cpAttributes.nrpL2cpPeering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrpL2cpAddressSet, nrpL2cpPeering);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPL2cpAttributes {\n");
    
    sb.append("    nrpL2cpAddressSet: ").append(toIndentedString(nrpL2cpAddressSet)).append("\n");
    sb.append("    nrpL2cpPeering: ").append(toIndentedString(nrpL2cpPeering)).append("\n");
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

