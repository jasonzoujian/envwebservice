package io.swagger.api;

import io.swagger.model.InlineResponse2006;

import io.swagger.annotations.*;
import io.swagger.model.Constant;
import io.swagger.model.InstrumentOperation;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.joda.time.DateTime;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T10:06:22.699Z")

@Controller
public class GetInstrumentOperationApiController implements GetInstrumentOperationApi {

    public ResponseEntity<InlineResponse2006> getInstrumentOperationGet(@ApiParam(value = "仪器编号", required = true) @RequestParam(value = "struNo", required = true) String struNo,
        @ApiParam(value = "", required = true) @RequestParam(value = "startTime", required = true) String startTime,
        @ApiParam(value = "未赋值，则取当前时间") @RequestParam(value = "endTime", required = false) String endTime) {
        // do some magic!
        if(null == endTime) {
            DateTime currentTime = new DateTime();
            endTime = currentTime.toString(Constant.dataFormat);
        } 
        System.out.println(String.format("getInstrumentOperation: %s from %s to %s", struNo, startTime, endTime));
        
        InstrumentOperation oper1 = new InstrumentOperation();
        oper1.instruNo(struNo);
        oper1.tag("ssdd");
        oper1.value("123");
        oper1.opeTime(new DateTime());
        oper1.operator("renxifeng");
        InstrumentOperation oper2 = new InstrumentOperation();
        oper2.instruNo(struNo);
        oper2.tag("zzjj");
        oper2.value("43");
        oper2.opeTime(new DateTime());
        oper2.operator("zoujian");
        List<InstrumentOperation> stubResult = new ArrayList<InstrumentOperation>();
        stubResult.add(oper1);
        stubResult.add(oper2);
        
        InlineResponse2006 stub = new InlineResponse2006();
        stub.status(0);
        stub.result(stubResult);
        return new ResponseEntity<InlineResponse2006>(stub, HttpStatus.OK);
    }

}
