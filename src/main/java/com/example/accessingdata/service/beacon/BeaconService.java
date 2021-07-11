package com.example.accessingdata.service.beacon;

import com.example.accessingdata.domain.Beacon;

import java.util.List;

public interface BeaconService {
    List<Beacon> getAllBeacons();
    void registerBeacons(List<Beacon> beacons);
}
