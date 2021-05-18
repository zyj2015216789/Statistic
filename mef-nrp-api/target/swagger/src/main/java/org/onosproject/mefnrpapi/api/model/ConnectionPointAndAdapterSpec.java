package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.CeConnPtAndAdaptSpec;



/**
 * ONFv1.1 ConnectionPointAndAdapterSpec
 **/

/**
 * ONFv1.1 ConnectionPointAndAdapterSpec
 */
@ApiModel(description = "ONFv1.1 ConnectionPointAndAdapterSpec")

public class ConnectionPointAndAdapterSpec   {
  @JsonProperty("connectionPointAndAdapterSpec")
  private CeConnPtAndAdaptSpec connectionPointAndAdapterSpec = null;

  public ConnectionPointAndAdapterSpec connectionPointAndAdapterSpec(CeConnPtAndAdaptSpec connectionPointAndAdapterSpec) {
    this.connectionPointAndAdapterSpec = connectionPointAndAdapterSpec;
    return this;
  }

   /**
   * Get connectionPointAndAdapterSpec
   * @return connectionPointAndAdapterSpec
  **/
  @JsonProperty("connectionPointAndAdapterSpec")
  @ApiModelProperty(value = "")
  public CeConnPtAndAdaptSpec getConnectionPointAndAdapterSpec() {
    return connectionPointAndAdapterSpec;
  }

  public void setConnectionPointAndAdapterSpec(CeConnPtAndAdaptSpec connectionPointAndAdapterSpec) {
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
    ConnectionPointAndAdapterSpec connectionPointAndAdapterSpec = (ConnectionPointAndAdapterSpec) o;
    return Objects.equals(this.connectionPointAndAdapterSpec, connectionPointAndAdapterSpec.connectionPointAndAdapterSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionPointAndAdapterSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionPointAndAdapterSpec {\n");
    
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

