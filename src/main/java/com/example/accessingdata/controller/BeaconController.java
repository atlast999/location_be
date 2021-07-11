package com.example.accessingdata.controller;

import com.example.accessingdata.domain.Beacon;
import com.example.accessingdata.domain.http.BaseResponse;
import com.example.accessingdata.service.beacon.BeaconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeaconController {

	@Autowired
    BeaconService beaconService;

    @GetMapping("/api/beacons")
    public BaseResponse<List<Beacon>> getAllBeacons() {
        return BaseResponse.successWithData(beaconService.getAllBeacons());
    }

    @PostMapping("/api/beacons")
    public BaseResponse<?> registerBeacons(@RequestBody List<Beacon> beacons) {
        beaconService.registerBeacons(beacons);
        return BaseResponse.successWithNoData();
    }
}
