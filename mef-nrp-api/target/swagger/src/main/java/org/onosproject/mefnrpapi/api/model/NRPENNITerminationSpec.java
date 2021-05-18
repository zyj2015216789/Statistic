package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * NRP ENNI Termination Specification 
 **/

/**
 * NRP ENNI Termination Specification 
 */
@ApiModel(description = "NRP ENNI Termination Specification ")

public class NRPENNITerminationSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nrp_")
  private String nrp_ = null;

  public NRPENNITerminationSpec id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NRPENNITerminationSpec nrp_(String nrp_) {
    this.nrp_ = nrp_;
    return this;
  }

   /**
   * 
   * @return nrp_
  **/
  @JsonProperty("nrp_")
  @ApiModelProperty(value = "")
  public String getNrp_() {
    return nrp_;
  }

  public void setNrp_(String nrp_) {
    this.nrp_ = nrp_;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPENNITerminationSpec nRPENNITerminationSpec = (NRPENNITerminationSpec) o;
    return Objects.equals(this.id, nRPENNITerminationSpec.id) &&
        Objects.equals(this.nrp_, nRPENNITerminationSpec.nrp_);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nrp_);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPENNITerminationSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nrp_: ").append(toIndentedString(nrp_)).append("\n");
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

