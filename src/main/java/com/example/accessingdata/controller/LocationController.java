package com.example.accessingdata.controller;

import com.example.accessingdata.domain.Location;
import com.example.accessingdata.domain.Position;
import com.example.accessingdata.domain.http.BaseResponse;
import com.example.accessingdata.service.location.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("/api/position")
    public BaseResponse<Position> getUserPosition() {
        return BaseResponse.successWithData(locationService.getUserPosition());
    }

    @PostMapping("/api/locations")
    public BaseResponse<?> updateLocations(@RequestBody List<Location> beacons) {
        locationService.updateLocations(beacons);
        return BaseResponse.successWithNoData();
    }
}
