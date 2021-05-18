package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.onosproject.mefnrpapi.api.model.LogicalTerminationPoint;



/**
 * The association of the ForwardingConstruct to Logical Termination Points.
 **/

/**
 * The association of the ForwardingConstruct to Logical Termination Points.
 */
@ApiModel(description = "The association of the ForwardingConstruct to Logical Termination Points.")

public class FcPort   {
  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    WORKING("Working"),
    
    PROTECTION("Protection"),
    
    PROTECTED("Protected"),
    
    SYMMETRIC("Symmetric"),
    
    HUB("Hub"),
    
    SPOKE("Spoke"),
    
    LEAF("Leaf"),
    
    ROOT("Root");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("ltpRefList")
  private List<LogicalTerminationPoint> ltpRefList = new ArrayList<LogicalTerminationPoint>();

  public FcPort role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  @ApiModelProperty(value = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public FcPort ltpRefList(List<LogicalTerminationPoint> ltpRefList) {
    this.ltpRefList = ltpRefList;
    return this;
  }

  public FcPort addLtpRefListItem(LogicalTerminationPoint ltpRefListItem) {
    this.ltpRefList.add(ltpRefListItem);
    return this;
  }

   /**
   * Get ltpRefList
   * @return ltpRefList
  **/
  @JsonProperty("ltpRefList")
  @ApiModelProperty(value = "")
  public List<LogicalTerminationPoint> getLtpRefList() {
    return ltpRefList;
  }

  public void setLtpRefList(List<LogicalTerminationPoint> ltpRefList) {
    this.ltpRefList = ltpRefList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FcPort fcPort = (FcPort) o;
    return Objects.equals(this.role, fcPort.role) &&
        Objects.equals(this.ltpRefList, fcPort.ltpRefList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, ltpRefList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FcPort {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    ltpRefList: ").append(toIndentedString(ltpRefList)).append("\n");
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

