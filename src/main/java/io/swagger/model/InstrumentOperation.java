package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T09:15:31.282Z")

public class InstrumentOperation   {
  
  private String instruNo = null;
  private String tag = null;
  private String value = null;
  private DateTime opeTime = null;
  private String operator = null;

  /**
   * 仪器编号
   **/
  public InstrumentOperation instruNo(String instruNo) {
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
   * 设置的变量
   **/
  public InstrumentOperation tag(String tag) {
    this.tag = tag;
    return this;
  }

  
  @ApiModelProperty(value = "设置的变量")
  @JsonProperty("Tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * 设置的值
   **/
  public InstrumentOperation value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "设置的值")
  @JsonProperty("Value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  public InstrumentOperation opeTime(DateTime opeTime) {
    this.opeTime = opeTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("OpeTime")
  public DateTime getOpeTime() {
    return opeTime;
  }
  public void setOpeTime(DateTime opeTime) {
    this.opeTime = opeTime;
  }

  /**
   **/
  public InstrumentOperation operator(String operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Operator")
  public String getOperator() {
    return operator;
  }
  public void setOperator(String operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentOperation instrumentOperation = (InstrumentOperation) o;
    return Objects.equals(instruNo, instrumentOperation.instruNo) &&
        Objects.equals(tag, instrumentOperation.tag) &&
        Objects.equals(value, instrumentOperation.value) &&
        Objects.equals(opeTime, instrumentOperation.opeTime) &&
        Objects.equals(operator, instrumentOperation.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruNo, tag, value, opeTime, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentOperation {\n");
    
    sb.append("    instruNo: ").append(toIndentedString(instruNo)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    opeTime: ").append(toIndentedString(opeTime)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

