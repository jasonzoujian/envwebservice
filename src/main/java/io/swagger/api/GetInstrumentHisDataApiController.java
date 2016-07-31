package io.swagger.api;

import io.swagger.model.InlineResponse2005;

import io.swagger.annotations.*;
import io.swagger.model.InstrumentHisData;
import io.swagger.model.InstrumentHisDataValues;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.joda.time.DateTime;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-31T10:06:22.699Z")

@Controller
public class GetInstrumentHisDataApiController implements GetInstrumentHisDataApi {

    public ResponseEntity<InlineResponse2005> getInstrumentHisDataGet(@ApiParam(value = "仪器编号", required = true) @RequestParam(value = "struNo", required = true) String struNo,
        @ApiParam(value = "", required = true) @RequestParam(value = "startTime", required = true) String startTime,
        @ApiParam(value = "未赋值，则取当前时间") @RequestParam(value = "endTime", required = false) String endTime) {
        // do some magic!
       if(null == endTime) {
            DateTime currentTime = new DateTime();
            endTime = currentTime.toString();
        } 
        System.out.println(String.format("getInstrumentHistoryData: %s from %s to %s", struNo, startTime, endTime));
        
        InstrumentHisData hisData1 = new InstrumentHisData();
        hisData1.instruNo(struNo);
        hisData1.time(new DateTime());
        InstrumentHisDataValues hisDataValue1 = new InstrumentHisDataValues();
        hisDataValue1.tag("zzjj");
        hisDataValue1.value("3213");
        InstrumentHisDataValues hisDataValue2 = new InstrumentHisDataValues();
        hisDataValue2.tag("rxf");
        hisDataValue2.value("4513");
        List<InstrumentHisDataValues> hisData1Values = new ArrayList<InstrumentHisDataValues>();
        hisData1Values.add(hisDataValue1);
        hisData1Values.add(hisDataValue2);
        hisData1.values(hisData1Values);
        InstrumentHisData hisData2 = new InstrumentHisData();
        hisData2.instruNo(struNo);
        hisData2.time(new DateTime());
        InstrumentHisDataValues hisDataValue3 = new InstrumentHisDataValues();
        hisDataValue3.tag("zzjj");
        hisDataValue3.value("313");
        InstrumentHisDataValues hisDataValue4 = new InstrumentHisDataValues();
        hisDataValue4.tag("rxf");
        hisDataValue4.value("813");
        List<InstrumentHisDataValues> hisData2Values = new ArrayList<InstrumentHisDataValues>();
        hisData2Values.add(hisDataValue3);
        hisData2Values.add(hisDataValue4);
        hisData2.values(hisData1Values);
        
        List<InstrumentHisData> stuResult = new ArrayList<InstrumentHisData>();
        stuResult.add(hisData1);
        stuResult.add(hisData2);
        
        InlineResponse2005 stub = new InlineResponse2005();
        stub.status(0);
        stub.result(stuResult);
        
        return new ResponseEntity<InlineResponse2005>(stub, HttpStatus.OK);
    }

}
