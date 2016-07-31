package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T02:13:27.447Z")

public class Instrument   {
  
  private String instruNo = null;
  private String model = null;
  private String online = null;

  /**
   * 仪器编号
   **/
  public Instrument instruNo(String instruNo) {
    this.instruNo = instruNo;
    return this;
  }

  
  @ApiModelProperty(value = "仪器编号")
  @JsonProperty("InstruNo")
  public String getInstruNo() {
    return instruNo;
  }
  public void setInstruNo(String instruNo) {
    this.instruNo = instruNo;
  }

  /**
   * 仪器型号
   **/
  public Instrument model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "仪器型号")
  @JsonProperty("Model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * yes是在线，no是不在线
   **/
  public Instrument online(String online) {
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
    Instrument instrument = (Instrument) o;
    return Objects.equals(instruNo, instrument.instruNo) &&
        Objects.equals(model, instrument.model) &&
        Objects.equals(online, instrument.online);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruNo, model, online);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instrument {\n");
    
    sb.append("    instruNo: ").append(toIndentedString(instruNo)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

