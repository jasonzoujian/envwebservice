package io.swagger.api;

import io.swagger.model.InlineResponse2001;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T02:13:27.447Z")

@Api(value = "GetAllInstruInfo", description = "the GetAllInstruInfo API")
public interface GetAllInstruInfoApi {

    @ApiOperation(value = "GetAllInstruInfo", notes = "获取一个站点的所有仪器信息 ", response = InlineResponse2001.class, tags={ "Instrument", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "该站点的所有仪器信息", response = InlineResponse2001.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2001.class) })
    @RequestMapping(value = "/GetAllInstruInfo",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> getAllInstruInfoGet(@ApiParam(value = "站台的编号", required = true) @RequestParam(value = "stationNo", required = true) String stationNo);

}
