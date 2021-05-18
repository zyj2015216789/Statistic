package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.LpSpec;



/**
 * ONFv1.1 object used for controlling termination and monitoring functionality.
 **/

/**
 * ONFv1.1 object used for controlling termination and monitoring functionality.
 */
@ApiModel(description = "ONFv1.1 object used for controlling termination and monitoring functionality.")

public class LayerProtocol   {
  @JsonProperty("layerProtocolName")
  private String layerProtocolName = null;

  @JsonProperty("nrp_lpSpec")
  private LpSpec nrpLpSpec = null;

  public LayerProtocol layerProtocolName(String layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

   /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @JsonProperty("layerProtocolName")
  @ApiModelProperty(value = "")
  public String getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(String layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public LayerProtocol nrpLpSpec(LpSpec nrpLpSpec) {
    this.nrpLpSpec = nrpLpSpec;
    return this;
  }

   /**
   * Get nrpLpSpec
   * @return nrpLpSpec
  **/
  @JsonProperty("nrp_lpSpec")
  @ApiModelProperty(value = "")
  public LpSpec getNrpLpSpec() {
    return nrpLpSpec;
  }

  public void setNrpLpSpec(LpSpec nrpLpSpec) {
    this.nrpLpSpec = nrpLpSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerProtocol layerProtocol = (LayerProtocol) o;
    return Objects.equals(this.layerProtocolName, layerProtocol.layerProtocolName) &&
        Objects.equals(this.nrpLpSpec, layerProtocol.nrpLpSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerProtocolName, nrpLpSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerProtocol {\n");
    
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    nrpLpSpec: ").append(toIndentedString(nrpLpSpec)).append("\n");
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

