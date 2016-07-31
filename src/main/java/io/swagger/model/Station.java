package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-30T16:17:49.902Z")

public class Station   {
  
  private String stationName = null;
  private String stationNo = null;
  private String IP = null;

  /**
   **/
  public Station stationName(String stationName) {
    this.stationName = stationName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("StationName")
  public String getStationName() {
    return stationName;
  }
  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  /**
   **/
  public Station stationNo(String stationNo) {
    this.stationNo = stationNo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("StationNo")
  public String getStationNo() {
    return stationNo;
  }
  public void setStationNo(String stationNo) {
    this.stationNo = stationNo;
  }

  /**
   **/
  public Station IP(String IP) {
    this.IP = IP;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IP")
  public String getIP() {
    return IP;
  }
  public void setIP(String IP) {
    this.IP = IP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Station station = (Station) o;
    return Objects.equals(stationName, station.stationName) &&
        Objects.equals(stationNo, station.stationNo) &&
        Objects.equals(IP, station.IP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stationName, stationNo, IP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Station {\n");
    
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
    sb.append("    stationNo: ").append(toIndentedString(stationNo)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

