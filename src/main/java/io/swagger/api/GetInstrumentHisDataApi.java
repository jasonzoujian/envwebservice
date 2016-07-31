package io.swagger.api;

import io.swagger.model.InlineResponse2005;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T10:06:22.699Z")

@Api(value = "GetInstrumentHisData", description = "the GetInstrumentHisData API")
public interface GetInstrumentHisDataApi {

    @ApiOperation(value = "GetInstrumentHisData", notes = "查询仪器历史参数信息", response = InlineResponse2005.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "result of query", response = InlineResponse2005.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2005.class) })
    @RequestMapping(value = "/GetInstrumentHisData",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2005> getInstrumentHisDataGet(@ApiParam(value = "仪器编号", required = true) @RequestParam(value = "struNo", required = true) String struNo,@ApiParam(value = "", required = true) @RequestParam(value = "startTime", required = true) String startTime,@ApiParam(value = "未赋值，则取当前时间") @RequestParam(value = "endTime", required = false) String endTime);

}
