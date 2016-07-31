package io.swagger.api;

import io.swagger.model.InlineResponse2003;

import io.swagger.annotations.*;
import io.swagger.model.InstrumentData;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T05:39:44.563Z")

@Controller
public class GetInstrumentDataApiController implements GetInstrumentDataApi {

    public ResponseEntity<InlineResponse2003> getInstrumentDataGet(@ApiParam(value = "仪器编号", required = true) @RequestParam(value = "instruNo", required = true) String instruNo) {
        // do some magic!
        System.out.printf("get Data of %s Instrument\n", instruNo);
        
        InstrumentData data1 = new InstrumentData();
        data1.instruNo(instruNo);
        data1.tag("tag1");
        data1.unit("g/m3");
        data1.valueType(0);
        data1.valueF(0.11);
        InstrumentData data2 = new InstrumentData();
        data2.instruNo(instruNo);
        data2.tag("tag2");
        data2.unit("mg/m3");
        data2.valueType(1);
        data2.valueI(124);
        
        List<InstrumentData> stubDatas = new ArrayList<InstrumentData>();
        stubDatas.add(data1);
        stubDatas.add(data2);
        
        InlineResponse2003 stub = new InlineResponse2003();
        stub.status(0);
        stub.result(stubDatas);
        
        return new ResponseEntity<InlineResponse2003>(stub, HttpStatus.OK);
    }

}
