package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InstrumentOperation;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T09:15:31.282Z")

public class InlineResponse2006   {
  
  private Integer status = null;
  private List<InstrumentOperation> result = new ArrayList<InstrumentOperation>();

  /**
   * 0成功/非0失败
   **/
  public InlineResponse2006 status(Integer status) {
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
   **/
  public InlineResponse2006 result(List<InstrumentOperation> result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Result")
  public List<InstrumentOperation> getResult() {
    return result;
  }
  public void setResult(List<InstrumentOperation> result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(status, inlineResponse2006.status) &&
        Objects.equals(result, inlineResponse2006.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

