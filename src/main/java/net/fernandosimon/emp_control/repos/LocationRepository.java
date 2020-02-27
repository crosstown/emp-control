package net.fernandosimon.emp_control.repos;

import net.fernandosimon.emp_control.domain.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:27
 */
public interface LocationRepository extends CrudRepository<Location, Long> {
    Optional<Location> findByDescription (String description);

}
