package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.ConnectionPointAndAdapterSpec;
import org.onosproject.mefnrpapi.api.model.NRPTerminationSpec;



/**
 * ONFv1.1 Layer Protocol Specification
 **/

/**
 * ONFv1.1 Layer Protocol Specification
 */
@ApiModel(description = "ONFv1.1 Layer Protocol Specification")

public class LpSpec   {
  @JsonProperty("terminationSpec")
  private NRPTerminationSpec terminationSpec = null;

  @JsonProperty("connectionPointAndAdapterSpec")
  private ConnectionPointAndAdapterSpec connectionPointAndAdapterSpec = null;

  public LpSpec terminationSpec(NRPTerminationSpec terminationSpec) {
    this.terminationSpec = terminationSpec;
    return this;
  }

   /**
   * Get terminationSpec
   * @return terminationSpec
  **/
  @JsonProperty("terminationSpec")
  @ApiModelProperty(value = "")
  public NRPTerminationSpec getTerminationSpec() {
    return terminationSpec;
  }

  public void setTerminationSpec(NRPTerminationSpec terminationSpec) {
    this.terminationSpec = terminationSpec;
  }

  public LpSpec connectionPointAndAdapterSpec(ConnectionPointAndAdapterSpec connectionPointAndAdapterSpec) {
    this.connectionPointAndAdapterSpec = connectionPointAndAdapterSpec;
    return this;
  }

   /**
   * Get connectionPointAndAdapterSpec
   * @return connectionPointAndAdapterSpec
  **/
  @JsonProperty("connectionPointAndAdapterSpec")
  @ApiModelProperty(value = "")
  public ConnectionPointAndAdapterSpec getConnectionPointAndAdapterSpec() {
    return connectionPointAndAdapterSpec;
  }

  public void setConnectionPointAndAdapterSpec(ConnectionPointAndAdapterSpec connectionPointAndAdapterSpec) {
    this.connectionPointAndAdapterSpec = connectionPointAndAdapterSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LpSpec lpSpec = (LpSpec) o;
    return Objects.equals(this.terminationSpec, lpSpec.terminationSpec) &&
        Objects.equals(this.connectionPointAndAdapterSpec, lpSpec.connectionPointAndAdapterSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminationSpec, connectionPointAndAdapterSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LpSpec {\n");
    
    sb.append("    terminationSpec: ").append(toIndentedString(terminationSpec)).append("\n");
    sb.append("    connectionPointAndAdapterSpec: ").append(toIndentedString(connectionPointAndAdapterSpec)).append("\n");
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

