package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * NRPL2cpAddressSetFilteredBy
 */

public class NRPL2cpAddressSetFilteredBy   {
  @JsonProperty("CTA")
  private Boolean CTA = null;

  @JsonProperty("CTB")
  private Boolean CTB = null;

  @JsonProperty("CTB2")
  private Boolean cTB2 = null;

  public NRPL2cpAddressSetFilteredBy CTA(Boolean CTA) {
    this.CTA = CTA;
    return this;
  }

   /**
   * Get CTA
   * @return CTA
  **/
  @JsonProperty("CTA")
  @ApiModelProperty(value = "")
  public Boolean getCTA() {
    return CTA;
  }

  public void setCTA(Boolean CTA) {
    this.CTA = CTA;
  }

  public NRPL2cpAddressSetFilteredBy CTB(Boolean CTB) {
    this.CTB = CTB;
    return this;
  }

   /**
   * Get CTB
   * @return CTB
  **/
  @JsonProperty("CTB")
  @ApiModelProperty(value = "")
  public Boolean getCTB() {
    return CTB;
  }

  public void setCTB(Boolean CTB) {
    this.CTB = CTB;
  }

  public NRPL2cpAddressSetFilteredBy cTB2(Boolean cTB2) {
    this.cTB2 = cTB2;
    return this;
  }

   /**
   * Get cTB2
   * @return cTB2
  **/
  @JsonProperty("CTB2")
  @ApiModelProperty(value = "")
  public Boolean getCTB2() {
    return cTB2;
  }

  public void setCTB2(Boolean cTB2) {
    this.cTB2 = cTB2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPL2cpAddressSetFilteredBy nRPL2cpAddressSetFilteredBy = (NRPL2cpAddressSetFilteredBy) o;
    return Objects.equals(this.CTA, nRPL2cpAddressSetFilteredBy.CTA) &&
        Objects.equals(this.CTB, nRPL2cpAddressSetFilteredBy.CTB) &&
        Objects.equals(this.cTB2, nRPL2cpAddressSetFilteredBy.cTB2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CTA, CTB, cTB2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPL2cpAddressSetFilteredBy {\n");
    
    sb.append("    CTA: ").append(toIndentedString(CTA)).append("\n");
    sb.append("    CTB: ").append(toIndentedString(CTB)).append("\n");
    sb.append("    cTB2: ").append(toIndentedString(cTB2)).append("\n");
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

