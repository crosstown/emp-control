package net.fernandosimon.emp_control.repos;

import net.fernandosimon.emp_control.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author developer
 * @date 2020-01-11
 * @time 22:21
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional findById(Long employeeId);

    List<Employee> findAll();

    Page<Employee> findAll(Pageable pageable);
}
