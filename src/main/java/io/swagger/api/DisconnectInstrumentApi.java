package io.swagger.api;

import io.swagger.model.InstrumentNo;
import io.swagger.model.InlineResponse2004;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T09:15:31.282Z")

@Api(value = "DisconnectInstrument", description = "the DisconnectInstrument API")
public interface DisconnectInstrumentApi {

    @ApiOperation(value = "DisconnectInstrument", notes = "如果APP连接仪器后连续5分钟没有调用接口2查询仪器实时值接口，则WebService会自动断开仪器连接。如果APP继续需要查看该仪器数据，则需要调用接口1重新连接该仪器。", response = InlineResponse2004.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "result of the disconnection", response = InlineResponse2004.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2004.class) })
    @RequestMapping(value = "/DisconnectInstrument",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2004> disconnectInstrumentPost(@ApiParam(value = "" ,required=true ) @RequestBody InstrumentNo instrumentNo);

}
