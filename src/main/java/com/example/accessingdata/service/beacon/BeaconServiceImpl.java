package com.example.accessingdata.service.beacon;

import com.example.accessingdata.domain.Beacon;
import com.example.accessingdata.repository.beacon.BeaconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeaconServiceImpl implements BeaconService{

    @Autowired
    BeaconRepository beaconRepository;

    @Override
    public List<Beacon> getAllBeacons() {
        return beaconRepository.getAllBeacons();
    }

    @Override
    public void registerBeacons(List<Beacon> beacons) {
        beaconRepository.saveAll(beacons);
    }
}
