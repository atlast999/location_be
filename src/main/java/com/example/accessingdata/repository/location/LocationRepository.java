package com.example.accessingdata.repository.location;

import com.example.accessingdata.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {

    @Query(value = "select * from locations", nativeQuery = true)
    List<Location> getThreeUniqueLocation();
}
