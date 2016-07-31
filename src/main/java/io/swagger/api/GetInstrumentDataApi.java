package io.swagger.api;

import io.swagger.model.InlineResponse2003;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T05:39:44.563Z")

@Api(value = "GetInstrumentData", description = "the GetInstrumentData API")
public interface GetInstrumentDataApi {

    @ApiOperation(value = "Get Instrument Data", notes = "查询仪器数据实时值", response = InlineResponse2003.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "仪器型号，仪器内数据的名称、单位、值", response = InlineResponse2003.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2003.class) })
    @RequestMapping(value = "/GetInstrumentData",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2003> getInstrumentDataGet(@ApiParam(value = "仪器编号", required = true) @RequestParam(value = "instruNo", required = true) String instruNo);

}
