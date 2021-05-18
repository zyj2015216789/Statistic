package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.onosproject.mefnrpapi.api.model.LayerProtocol;
import org.onosproject.mefnrpapi.api.model.NRPPhysicalPortReference;



/**
 * ONF class encapsulates the termination and adaptation functions of one or more transport layers. 
 **/

/**
 * ONF class encapsulates the termination and adaptation functions of one or more transport layers. 
 */
@ApiModel(description = "ONF class encapsulates the termination and adaptation functions of one or more transport layers. ")

public class LogicalTerminationPoint   {
  @JsonProperty("id")
  private String id = null;

  /**
   * State of Logical Termination Point
   */
  public enum AdminStateEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    AdminStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AdminStateEnum fromValue(String text) {
      for (AdminStateEnum b : AdminStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("adminState")
  private AdminStateEnum adminState = null;

  @JsonProperty("physicalPortReference")
  private NRPPhysicalPortReference physicalPortReference = null;

  @JsonProperty("lpList")
  private List<LayerProtocol> lpList = new ArrayList<LayerProtocol>();

  public LogicalTerminationPoint id(String id) {
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

  public LogicalTerminationPoint adminState(AdminStateEnum adminState) {
    this.adminState = adminState;
    return this;
  }

   /**
   * State of Logical Termination Point
   * @return adminState
  **/
  @JsonProperty("adminState")
  @ApiModelProperty(value = "State of Logical Termination Point")
  public AdminStateEnum getAdminState() {
    return adminState;
  }

  public void setAdminState(AdminStateEnum adminState) {
    this.adminState = adminState;
  }

  public LogicalTerminationPoint physicalPortReference(NRPPhysicalPortReference physicalPortReference) {
    this.physicalPortReference = physicalPortReference;
    return this;
  }

   /**
   * Get physicalPortReference
   * @return physicalPortReference
  **/
  @JsonProperty("physicalPortReference")
  @ApiModelProperty(value = "")
  public NRPPhysicalPortReference getPhysicalPortReference() {
    return physicalPortReference;
  }

  public void setPhysicalPortReference(NRPPhysicalPortReference physicalPortReference) {
    this.physicalPortReference = physicalPortReference;
  }

  public LogicalTerminationPoint lpList(List<LayerProtocol> lpList) {
    this.lpList = lpList;
    return this;
  }

  public LogicalTerminationPoint addLpListItem(LayerProtocol lpListItem) {
    this.lpList.add(lpListItem);
    return this;
  }

   /**
   * Get lpList
   * @return lpList
  **/
  @JsonProperty("lpList")
  @ApiModelProperty(value = "")
  public List<LayerProtocol> getLpList() {
    return lpList;
  }

  public void setLpList(List<LayerProtocol> lpList) {
    this.lpList = lpList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalTerminationPoint logicalTerminationPoint = (LogicalTerminationPoint) o;
    return Objects.equals(this.id, logicalTerminationPoint.id) &&
        Objects.equals(this.adminState, logicalTerminationPoint.adminState) &&
        Objects.equals(this.physicalPortReference, logicalTerminationPoint.physicalPortReference) &&
        Objects.equals(this.lpList, logicalTerminationPoint.lpList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adminState, physicalPortReference, lpList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalTerminationPoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
    sb.append("    physicalPortReference: ").append(toIndentedString(physicalPortReference)).append("\n");
    sb.append("    lpList: ").append(toIndentedString(lpList)).append("\n");
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

