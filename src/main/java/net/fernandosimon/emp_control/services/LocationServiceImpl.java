package net.fernandosimon.emp_control.services;


import lombok.extern.slf4j.Slf4j;
import net.fernandosimon.emp_control.domain.Location;
import net.fernandosimon.emp_control.repos.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author F.S.(Crosstown)
 * @date 11/24/2017
 * @time 1:23 AM
 */
@Slf4j
@Service
public class LocationServiceImpl implements LocationService {

    LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> allLocations() {
        List<Location> all =  new ArrayList<>();
        locationRepository.findAll().iterator().forEachRemaining(all::add);

        return all;
    }
}
