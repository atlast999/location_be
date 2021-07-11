package com.example.accessingdata.repository.beacon;

import com.example.accessingdata.domain.Beacon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeaconRepository extends JpaRepository<Beacon, String> {
    @Query(value = "SELECT * FROM beacons", nativeQuery = true)
    List<Beacon> getAllBeacons();
}
