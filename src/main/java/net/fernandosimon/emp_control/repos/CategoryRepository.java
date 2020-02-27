package net.fernandosimon.emp_control.repos;

import net.fernandosimon.emp_control.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:28
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
