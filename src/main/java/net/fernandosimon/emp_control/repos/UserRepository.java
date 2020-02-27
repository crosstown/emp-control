package net.fernandosimon.emp_control.repos;

import org.springframework.data.repository.CrudRepository;
import net.fernandosimon.emp_control.domain.User;

/**
 * @author developer
 * @date 2020-02-19
 * @time 21:38
 */
public interface UserRepository extends CrudRepository<User, Long> {
}

