package org.onosproject.mefnrpapi.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ONF - One or more text labels for the unmodelled physical port associated with the LTP. In many cases there is no associated physical port.
 **/

/**
 * ONF - One or more text labels for the unmodelled physical port associated with the LTP. In many cases there is no associated physical port.
 */
@ApiModel(description = "ONF - One or more text labels for the unmodelled physical port associated with the LTP. In many cases there is no associated physical port.")

public class NRPPhysicalPortReference   {
  @JsonProperty("CLLI")
  private String CLLI = null;

  @JsonProperty("Vendor")
  private String vendor = null;

  @JsonProperty("Hostname")
  private String hostname = null;

  @JsonProperty("Shelf")
  private String shelf = null;

  @JsonProperty("Slot")
  private String slot = null;

  @JsonProperty("Subslot")
  private String subslot = null;

  @JsonProperty("Port")
  private String port = null;

  @JsonProperty("Rack")
  private String rack = null;

  @JsonProperty("RemoteUnit")
  private String remoteUnit = null;

  @JsonProperty("RemoteUnitSlot")
  private String remoteUnitSlot = null;

  @JsonProperty("RemoteUnitPort")
  private String remoteUnitPort = null;

  public NRPPhysicalPortReference CLLI(String CLLI) {
    this.CLLI = CLLI;
    return this;
  }

   /**
   * Get CLLI
   * @return CLLI
  **/
  @JsonProperty("CLLI")
  @ApiModelProperty(value = "")
  public String getCLLI() {
    return CLLI;
  }

  public void setCLLI(String CLLI) {
    this.CLLI = CLLI;
  }

  public NRPPhysicalPortReference vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @JsonProperty("Vendor")
  @ApiModelProperty(value = "")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public NRPPhysicalPortReference hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @JsonProperty("Hostname")
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public NRPPhysicalPortReference shelf(String shelf) {
    this.shelf = shelf;
    return this;
  }

   /**
   * Get shelf
   * @return shelf
  **/
  @JsonProperty("Shelf")
  @ApiModelProperty(value = "")
  public String getShelf() {
    return shelf;
  }

  public void setShelf(String shelf) {
    this.shelf = shelf;
  }

  public NRPPhysicalPortReference slot(String slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/
  @JsonProperty("Slot")
  @ApiModelProperty(value = "")
  public String getSlot() {
    return slot;
  }

  public void setSlot(String slot) {
    this.slot = slot;
  }

  public NRPPhysicalPortReference subslot(String subslot) {
    this.subslot = subslot;
    return this;
  }

   /**
   * Get subslot
   * @return subslot
  **/
  @JsonProperty("Subslot")
  @ApiModelProperty(value = "")
  public String getSubslot() {
    return subslot;
  }

  public void setSubslot(String subslot) {
    this.subslot = subslot;
  }

  public NRPPhysicalPortReference port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @JsonProperty("Port")
  @ApiModelProperty(value = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public NRPPhysicalPortReference rack(String rack) {
    this.rack = rack;
    return this;
  }

   /**
   * Get rack
   * @return rack
  **/
  @JsonProperty("Rack")
  @ApiModelProperty(value = "")
  public String getRack() {
    return rack;
  }

  public void setRack(String rack) {
    this.rack = rack;
  }

  public NRPPhysicalPortReference remoteUnit(String remoteUnit) {
    this.remoteUnit = remoteUnit;
    return this;
  }

   /**
   * Get remoteUnit
   * @return remoteUnit
  **/
  @JsonProperty("RemoteUnit")
  @ApiModelProperty(value = "")
  public String getRemoteUnit() {
    return remoteUnit;
  }

  public void setRemoteUnit(String remoteUnit) {
    this.remoteUnit = remoteUnit;
  }

  public NRPPhysicalPortReference remoteUnitSlot(String remoteUnitSlot) {
    this.remoteUnitSlot = remoteUnitSlot;
    return this;
  }

   /**
   * Get remoteUnitSlot
   * @return remoteUnitSlot
  **/
  @JsonProperty("RemoteUnitSlot")
  @ApiModelProperty(value = "")
  public String getRemoteUnitSlot() {
    return remoteUnitSlot;
  }

  public void setRemoteUnitSlot(String remoteUnitSlot) {
    this.remoteUnitSlot = remoteUnitSlot;
  }

  public NRPPhysicalPortReference remoteUnitPort(String remoteUnitPort) {
    this.remoteUnitPort = remoteUnitPort;
    return this;
  }

   /**
   * Get remoteUnitPort
   * @return remoteUnitPort
  **/
  @JsonProperty("RemoteUnitPort")
  @ApiModelProperty(value = "")
  public String getRemoteUnitPort() {
    return remoteUnitPort;
  }

  public void setRemoteUnitPort(String remoteUnitPort) {
    this.remoteUnitPort = remoteUnitPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NRPPhysicalPortReference nRPPhysicalPortReference = (NRPPhysicalPortReference) o;
    return Objects.equals(this.CLLI, nRPPhysicalPortReference.CLLI) &&
        Objects.equals(this.vendor, nRPPhysicalPortReference.vendor) &&
        Objects.equals(this.hostname, nRPPhysicalPortReference.hostname) &&
        Objects.equals(this.shelf, nRPPhysicalPortReference.shelf) &&
        Objects.equals(this.slot, nRPPhysicalPortReference.slot) &&
        Objects.equals(this.subslot, nRPPhysicalPortReference.subslot) &&
        Objects.equals(this.port, nRPPhysicalPortReference.port) &&
        Objects.equals(this.rack, nRPPhysicalPortReference.rack) &&
        Objects.equals(this.remoteUnit, nRPPhysicalPortReference.remoteUnit) &&
        Objects.equals(this.remoteUnitSlot, nRPPhysicalPortReference.remoteUnitSlot) &&
        Objects.equals(this.remoteUnitPort, nRPPhysicalPortReference.remoteUnitPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CLLI, vendor, hostname, shelf, slot, subslot, port, rack, remoteUnit, remoteUnitSlot, remoteUnitPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRPPhysicalPortReference {\n");
    
    sb.append("    CLLI: ").append(toIndentedString(CLLI)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    shelf: ").append(toIndentedString(shelf)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    subslot: ").append(toIndentedString(subslot)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
    sb.append("    remoteUnit: ").append(toIndentedString(remoteUnit)).append("\n");
    sb.append("    remoteUnitSlot: ").append(toIndentedString(remoteUnitSlot)).append("\n");
    sb.append("    remoteUnitPort: ").append(toIndentedString(remoteUnitPort)).append("\n");
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

