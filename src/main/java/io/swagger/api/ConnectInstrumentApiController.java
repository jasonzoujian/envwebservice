package io.swagger.api;

import io.swagger.model.InstrumentNo;
import io.swagger.model.InlineResponse2002;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T07:45:05.522Z")

@Controller
public class ConnectInstrumentApiController implements ConnectInstrumentApi {

    public ResponseEntity<InlineResponse2002> connectInstrumentPost(@ApiParam(value = "" ,required=true ) @RequestBody InstrumentNo instrumentNo) {
        // do some magic!
        System.out.printf("Start to connect %s Instrument\n", instrumentNo.getStruNo());
        
        InlineResponse2002 stub = new InlineResponse2002();
        stub.setStatus(0);
        stub.online("yes");
        
        return new ResponseEntity<InlineResponse2002>(stub, HttpStatus.OK);
    }

}
