package io.swagger.api;

import io.swagger.model.InstrumentNo;
import io.swagger.model.InlineResponse2004;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T09:15:31.282Z")

@Controller
public class DisconnectInstrumentApiController implements DisconnectInstrumentApi {

    public ResponseEntity<InlineResponse2004> disconnectInstrumentPost(@ApiParam(value = "" ,required=true ) @RequestBody InstrumentNo instrumentNo) {
        // do some magic!
        System.out.printf("Start to disconnect %s Instrument\n", instrumentNo.getStruNo());
        
        InlineResponse2004 stub = new InlineResponse2004();
        stub.setStatus(0);
        
        return new ResponseEntity<InlineResponse2004>(stub, HttpStatus.OK);
    }

}
