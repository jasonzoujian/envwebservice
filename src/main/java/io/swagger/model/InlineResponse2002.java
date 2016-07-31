package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Station;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T02:13:27.447Z")

public class InlineResponse2002   {
  
  private Integer status = null;
  private String online = null;

  /**
   * 0成功/非0失败
   **/
  public InlineResponse2002 status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "0成功/非0失败")
  @JsonProperty("Status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * yes是在线，no是不在线
   **/
  public InlineResponse2002 online(String online) {
    this.online = online;
    return this;
  }

  
  @ApiModelProperty(value = "yes是在线，no是不在线")
  @JsonProperty("Online")
  public String getOnline() {
    return online;
  }
  public void setOnline(String online) {
    this.online = online;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(status, inlineResponse2002.status) &&
        Objects.equals(online, inlineResponse2002.online);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, online);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
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

