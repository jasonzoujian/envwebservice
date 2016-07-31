package io.swagger.api;

import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-30T16:17:49.902Z")

@Api(value = "GetAllStationInfo", description = "the GetAllStationInfo API")
public interface GetAllStationInfoApi {

    @ApiOperation(value = "获取所有站点信息", notes = "获取所有站点信息 ", response = InlineResponse200.class, tags={ "Stations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "所有站点信息", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse200.class) })
    @RequestMapping(value = "/GetAllStationInfo",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getAllStationInfoGet();

}
