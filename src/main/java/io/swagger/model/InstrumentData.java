package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T05:39:44.563Z")

public class InstrumentData   {
  
  private String instruNo = null;
  private String tag = null;
  private String unit = null;
  private Integer valueType = null;
  private Double valueF = null;
  private Integer valueI = null;
  private String date = null;
  private Integer hour = null;

  /**
   * 仪器编号
   **/
  public InstrumentData instruNo(String instruNo) {
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
   * 测量值的名称
   **/
  public InstrumentData tag(String tag) {
    this.tag = tag;
    return this;
  }

  
  @ApiModelProperty(value = "测量值的名称")
  @JsonProperty("Tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   * 单位
   **/
  public InstrumentData unit(String unit) {
    this.unit = unit;
    return this;
  }

  
  @ApiModelProperty(value = "单位")
  @JsonProperty("Unit")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   * 0:浮点 ValueF; 1:整形 ValueI; 2:字符串;
   **/
  public InstrumentData valueType(Integer valueType) {
    this.valueType = valueType;
    return this;
  }

  
  @ApiModelProperty(value = "0:浮点 ValueF; 1:整形 ValueI; 2:字符串;")
  @JsonProperty("ValueType")
  public Integer getValueType() {
    return valueType;
  }
  public void setValueType(Integer valueType) {
    this.valueType = valueType;
  }

  /**
   * 浮点值
   **/
  public InstrumentData valueF(Double valueF) {
    this.valueF = valueF;
    return this;
  }

  
  @ApiModelProperty(value = "浮点值")
  @JsonProperty("ValueF")
  public Double getValueF() {
    return valueF;
  }
  public void setValueF(Double valueF) {
    this.valueF = valueF;
  }

  /**
   * 整数字
   **/
  public InstrumentData valueI(Integer valueI) {
    this.valueI = valueI;
    return this;
  }

  
  @ApiModelProperty(value = "整数字")
  @JsonProperty("ValueI")
  public Integer getValueI() {
    return valueI;
  }
  public void setValueI(Integer valueI) {
    this.valueI = valueI;
  }

  /**
   * 日期
   **/
  public InstrumentData date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "日期")
  @JsonProperty("Date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * 小时
   **/
  public InstrumentData hour(Integer hour) {
    this.hour = hour;
    return this;
  }

  
  @ApiModelProperty(value = "小时")
  @JsonProperty("Hour")
  public Integer getHour() {
    return hour;
  }
  public void setHour(Integer hour) {
    this.hour = hour;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentData instrumentData = (InstrumentData) o;
    return Objects.equals(instruNo, instrumentData.instruNo) &&
        Objects.equals(tag, instrumentData.tag) &&
        Objects.equals(unit, instrumentData.unit) &&
        Objects.equals(valueType, instrumentData.valueType) &&
        Objects.equals(valueF, instrumentData.valueF) &&
        Objects.equals(valueI, instrumentData.valueI) &&
        Objects.equals(date, instrumentData.date) &&
        Objects.equals(hour, instrumentData.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruNo, tag, unit, valueType, valueF, valueI, date, hour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentData {\n");
    
    sb.append("    instruNo: ").append(toIndentedString(instruNo)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    valueF: ").append(toIndentedString(valueF)).append("\n");
    sb.append("    valueI: ").append(toIndentedString(valueI)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

