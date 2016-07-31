package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T09:15:31.282Z")

public class InstrumentNo   {
  
  private String struNo = null;

  /**
   * 仪器编号
   **/
  public InstrumentNo struNo(String struNo) {
    this.struNo = struNo;
    return this;
  }

  
  @ApiModelProperty(value = "仪器编号")
  @JsonProperty("StruNo")
  public String getStruNo() {
    return struNo;
  }
  public void setStruNo(String struNo) {
    this.struNo = struNo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentNo instrumentNo = (InstrumentNo) o;
    return Objects.equals(struNo, instrumentNo.struNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(struNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentNo {\n");
    
    sb.append("    struNo: ").append(toIndentedString(struNo)).append("\n");
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

