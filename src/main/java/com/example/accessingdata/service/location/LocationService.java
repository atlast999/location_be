package com.example.accessingdata.service.location;

import com.example.accessingdata.domain.Location;
import com.example.accessingdata.domain.Position;

import java.util.List;

public interface LocationService {
    Position getUserPosition();
    void updateLocations(List<Location> locations);
}
