package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.onosproject.mefnrpapi.api.model.FcPort;
import org.onosproject.mefnrpapi.api.model.NRPCeFcSpec;



/**
 * Models potential for forwarding between two or more LTPs at a particular specific layerProtocol.
 **/

/**
 * Models potential for forwarding between two or more LTPs at a particular specific layerProtocol.
 */
@ApiModel(description = "Models potential for forwarding between two or more LTPs at a particular specific layerProtocol.")

public class ForwardingConstruct   {
  @JsonProperty("id")
  private String id = null;

  /**
   * Administrative state of Forwarding Construct
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

  @JsonProperty("fcPortList")
  private List<FcPort> fcPortList = new ArrayList<FcPort>();

  @JsonProperty("nrpCeFcSpec")
  private NRPCeFcSpec nrpCeFcSpec = null;

  public ForwardingConstruct id(String id) {
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

  public ForwardingConstruct adminState(AdminStateEnum adminState) {
    this.adminState = adminState;
    return this;
  }

   /**
   * Administrative state of Forwarding Construct
   * @return adminState
  **/
  @JsonProperty("adminState")
  @ApiModelProperty(value = "Administrative state of Forwarding Construct")
  public AdminStateEnum getAdminState() {
    return adminState;
  }

  public void setAdminState(AdminStateEnum adminState) {
    this.adminState = adminState;
  }

  public ForwardingConstruct fcPortList(List<FcPort> fcPortList) {
    this.fcPortList = fcPortList;
    return this;
  }

  public ForwardingConstruct addFcPortListItem(FcPort fcPortListItem) {
    this.fcPortList.add(fcPortListItem);
    return this;
  }

   /**
   * Get fcPortList
   * @return fcPortList
  **/
  @JsonProperty("fcPortList")
  @ApiModelProperty(value = "")
  public List<FcPort> getFcPortList() {
    return fcPortList;
  }

  public void setFcPortList(List<FcPort> fcPortList) {
    this.fcPortList = fcPortList;
  }

  public ForwardingConstruct nrpCeFcSpec(NRPCeFcSpec nrpCeFcSpec) {
    this.nrpCeFcSpec = nrpCeFcSpec;
    return this;
  }

   /**
   * Get nrpCeFcSpec
   * @return nrpCeFcSpec
  **/
  @JsonProperty("nrpCeFcSpec")
  @ApiModelProperty(value = "")
  public NRPCeFcSpec getNrpCeFcSpec() {
    return nrpCeFcSpec;
  }

  public void setNrpCeFcSpec(NRPCeFcSpec nrpCeFcSpec) {
    this.nrpCeFcSpec = nrpCeFcSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardingConstruct forwardingConstruct = (ForwardingConstruct) o;
    return Objects.equals(this.id, forwardingConstruct.id) &&
        Objects.equals(this.adminState, forwardingConstruct.adminState) &&
        Objects.equals(this.fcPortList, forwardingConstruct.fcPortList) &&
        Objects.equals(this.nrpCeFcSpec, forwardingConstruct.nrpCeFcSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adminState, fcPortList, nrpCeFcSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardingConstruct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
    sb.append("    fcPortList: ").append(toIndentedString(fcPortList)).append("\n");
    sb.append("    nrpCeFcSpec: ").append(toIndentedString(nrpCeFcSpec)).append("\n");
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

