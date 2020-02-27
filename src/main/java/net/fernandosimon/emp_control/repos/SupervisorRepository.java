package net.fernandosimon.emp_control.repos;

import net.fernandosimon.emp_control.domain.Supervisor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:27
 */
public interface SupervisorRepository extends CrudRepository<Supervisor, Long> {

    Optional<Supervisor> findByLastName(String lastName);

}
