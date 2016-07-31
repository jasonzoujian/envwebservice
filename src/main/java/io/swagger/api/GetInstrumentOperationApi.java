package io.swagger.api;

import io.swagger.model.InlineResponse2006;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T10:06:22.699Z")

@Api(value = "GetInstrumentOperation", description = "the GetInstrumentOperation API")
public interface GetInstrumentOperationApi {

    @ApiOperation(value = "GetInstrumentOperation", notes = "查询某个仪器某个时间段的所有操作记录", response = InlineResponse2006.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "result of the action", response = InlineResponse2006.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2006.class) })
    @RequestMapping(value = "/GetInstrumentOperation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2006> getInstrumentOperationGet(@ApiParam(value = "仪器编号", required = true) @RequestParam(value = "struNo", required = true) String struNo,@ApiParam(value = "", required = true) @RequestParam(value = "startTime", required = true) String startTime,@ApiParam(value = "未赋值，则取当前时间") @RequestParam(value = "endTime", required = false) String endTime);

}
