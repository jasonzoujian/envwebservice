package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Station;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-30T16:17:49.902Z")

@Controller
public class GetAllStationInfoApiController implements GetAllStationInfoApi {

    public ResponseEntity<InlineResponse200> getAllStationInfoGet() {
        // do some magic!        
        Station station1 = new Station();
        station1.stationName("chaoyang");
        station1.stationNo("001");
        station1.IP("12.12.12.111");
        Station station2 = new Station();
        station2.stationName("haiding");
        station2.stationNo("002");
        station2.IP("12.12.12.112");
        List<Station> stations = new ArrayList<Station>();
        stations.add(station1);
        stations.add(station2);
        
        InlineResponse200 stub = new InlineResponse200();
        stub.status(0);
        stub.result(stations);

        return new ResponseEntity<InlineResponse200>(stub, HttpStatus.OK);
    }

}
