package io.swagger.api;

import io.swagger.model.InstrumentSetInput;
import io.swagger.model.InlineResponse2004;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T07:45:05.522Z")

@Api(value = "SetInstrumentData", description = "the SetInstrumentData API")
public interface SetInstrumentDataApi {

    @ApiOperation(value = "Set Instrument Data", notes = "设置仪器参数", response = InlineResponse2004.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "result of the action", response = InlineResponse2004.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2004.class) })
    @RequestMapping(value = "/SetInstrumentData",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2004> setInstrumentDataPost(@ApiParam(value = "" ,required=true ) @RequestBody InstrumentSetInput instrumentSetInput);

}
