package io.swagger.api;

import io.swagger.model.InstrumentNo;
import io.swagger.model.InlineResponse2002;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T07:45:05.522Z")

@Api(value = "ConnectInstrument", description = "the ConnectInstrument API")
public interface ConnectInstrumentApi {

    @ApiOperation(value = "ConnectInstrument", notes = "作用是启动中心端从子站查询参数实时数据，APP必须先调用此接口，才可以开始查看仪器的运行数据.", response = InlineResponse2002.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "result of the connection", response = InlineResponse2002.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2002.class) })
    @RequestMapping(value = "/ConnectInstrument",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> connectInstrumentPost(@ApiParam(value = "" ,required=true ) @RequestBody InstrumentNo instrumentConnInput);

}
