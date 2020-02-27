package net.fernandosimon.emp_control.repos;

import net.fernandosimon.emp_control.domain.BU;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:26
 */
public interface BURepository extends CrudRepository<BU, Long> {

    Optional<BU> findByDescription(String description);
}
