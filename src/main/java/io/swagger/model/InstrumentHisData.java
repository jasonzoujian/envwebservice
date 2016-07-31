package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T09:15:31.282Z")

public class InstrumentHisData   {
  
  private String instruNo = null;
  private DateTime time = null;
  private List<InstrumentHisDataValues> values = new ArrayList<InstrumentHisDataValues>();

  /**
   * 仪器编号
   **/
  public InstrumentHisData instruNo(String instruNo) {
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
   **/
  public InstrumentHisData time(DateTime time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Time")
  public DateTime getTime() {
    return time;
  }
  public void setTime(DateTime time) {
    this.time = time;
  }

  /**
   **/
  public InstrumentHisData values(List<InstrumentHisDataValues> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Values")
  public List<InstrumentHisDataValues> getValues() {
    return values;
  }
  public void setValues(List<InstrumentHisDataValues> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentHisData instrumentHisData = (InstrumentHisData) o;
    return Objects.equals(instruNo, instrumentHisData.instruNo) &&
        Objects.equals(time, instrumentHisData.time) &&
        Objects.equals(values, instrumentHisData.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruNo, time, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentHisData {\n");
    
    sb.append("    instruNo: ").append(toIndentedString(instruNo)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

