package com.example.accessingdata.service.location;

import com.example.accessingdata.domain.Beacon;
import com.example.accessingdata.domain.Location;
import com.example.accessingdata.domain.Position;
import com.example.accessingdata.repository.beacon.BeaconRepository;
import com.example.accessingdata.repository.location.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    BeaconRepository beaconRepository;

    @Override
    public Position getUserPosition() {
        List<Location> locations = locationRepository.getThreeUniqueLocation();
        List<Beacon> beacons = beaconRepository.getAllBeacons();
        return new Position(34.23f, 43.33f);
    }

    @Override
    public void updateLocations(List<Location> locations) {
        locationRepository.saveAll(locations);
    }
}
