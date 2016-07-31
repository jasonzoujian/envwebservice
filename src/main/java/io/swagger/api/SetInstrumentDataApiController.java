package io.swagger.api;

import io.swagger.model.InstrumentSetInput;
import io.swagger.model.InlineResponse2004;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T07:45:05.522Z")

@Controller
public class SetInstrumentDataApiController implements SetInstrumentDataApi {

    public ResponseEntity<InlineResponse2004> setInstrumentDataPost(@ApiParam(value = "" ,required=true ) @RequestBody InstrumentSetInput instrumentSetInput) {
        // do some magic!
        System.out.println(instrumentSetInput.toString());
        
        InlineResponse2004 stub = new InlineResponse2004();
        stub.status(0);
        
        return new ResponseEntity<InlineResponse2004>(stub, HttpStatus.OK);
    }

}
