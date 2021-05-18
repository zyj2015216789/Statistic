package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.onosproject.mefnrpapi.api.model.NRPConnAdaptSpec;



/**
 * ONFv1.1 CeConnPtAndAdaptSpec
 **/

/**
 * ONFv1.1 CeConnPtAndAdaptSpec
 */
@ApiModel(description = "ONFv1.1 CeConnPtAndAdaptSpec")

public class CeConnPtAndAdaptSpec   {
  @JsonProperty("connectionPointAndAdapterSpec")
  private NRPConnAdaptSpec connectionPointAndAdapterSpec = null;

  public CeConnPtAndAdaptSpec connectionPointAndAdapterSpec(NRPConnAdaptSpec connectionPointAndAdapterSpec) {
    this.connectionPointAndAdapterSpec = connectionPointAndAdapterSpec;
    return this;
  }

   /**
   * Get connectionPointAndAdapterSpec
   * @return connectionPointAndAdapterSpec
  **/
  @JsonProperty("connectionPointAndAdapterSpec")
  @ApiModelProperty(value = "")
  public NRPConnAdaptSpec getConnectionPointAndAdapterSpec() {
    return connectionPointAndAdapterSpec;
  }

  public void setConnectionPointAndAdapterSpec(NRPConnAdaptSpec connectionPointAndAdapterSpec) {
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
    CeConnPtAndAdaptSpec ceConnPtAndAdaptSpec = (CeConnPtAndAdaptSpec) o;
    return Objects.equals(this.connectionPointAndAdapterSpec, ceConnPtAndAdaptSpec.connectionPointAndAdapterSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionPointAndAdapterSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CeConnPtAndAdaptSpec {\n");
    
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

