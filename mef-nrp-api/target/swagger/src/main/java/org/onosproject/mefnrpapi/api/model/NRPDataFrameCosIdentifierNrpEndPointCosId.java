package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPDataFrameCosIdentifierNrpEndPointCosId
 */

public class NRPDataFrameCosIdentifierNrpEndPointCosId   {
  @JsonProperty("evcId")
  private String evcId = null;

  @JsonProperty("color")
  private String color = null;

  public NRPDataFrameCosIdentifierNrpEndPointCosId evcId(String evcId) {
    this.evcId = evcId;
    return this;
  }

   /**
   * Get evcId
   * @return evcId
  **/
  @JsonProperty("evcId")
  @ApiModelProperty(value = "")
  public String getEvcId() {
    return evcId;
  }

  public void setEvcId(String evcId) {
    this.evcId = evcId;
  }

  public NRPDataFrameCosIdentifierNrpEndPointCosId color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @JsonProperty("color")
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPDataFrameCosIdentifierNrpEndPointCosId nRPDataFrameCosIdentifierNrpEndPointCosId = (NRPDataFrameCosIdentifierNrpEndPointCosId) o;
    return Objects.equals(this.evcId, nRPDataFrameCosIdentifierNrpEndPointCosId.evcId) &&
        Objects.equals(this.color, nRPDataFrameCosIdentifierNrpEndPointCosId.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evcId, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPDataFrameCosIdentifierNrpEndPointCosId {\n");
    
    sb.append("    evcId: ").append(toIndentedString(evcId)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

