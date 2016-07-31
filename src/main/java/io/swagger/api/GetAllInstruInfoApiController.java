package io.swagger.api;

import io.swagger.model.InlineResponse2001;

import io.swagger.annotations.*;
import io.swagger.model.Instrument;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T02:13:27.447Z")

@Controller
public class GetAllInstruInfoApiController implements GetAllInstruInfoApi {

    public ResponseEntity<InlineResponse2001> getAllInstruInfoGet(@ApiParam(value = "站台的编号", required = true) @RequestParam(value = "stationNo", required = true) String stationNo) {
        // do some magic!
        System.out.printf("get All Instrument Info of %s Station\n", stationNo);
        
        Instrument instru1 = new Instrument();
        instru1.instruNo("001_01");
        instru1.model("PM2.5");
        instru1.online("yes");
        Instrument instru2 = new Instrument();
        instru2.instruNo("001_02");
        instru2.model("CO");
        instru2.online("no");
        Instrument instru3 = new Instrument();
        instru3.instruNo("001_03");
        instru3.model("SO2");
        instru3.online("no");
        
        List<Instrument> stubResult = new ArrayList<Instrument>();
        stubResult.add(instru1);
        stubResult.add(instru2);
        stubResult.add(instru3);
        
        
        InlineResponse2001 stub = new InlineResponse2001();
        stub.status(0);
        stub.result(stubResult);
        
        
        return new ResponseEntity<InlineResponse2001>(stub, HttpStatus.OK);
    }

}
