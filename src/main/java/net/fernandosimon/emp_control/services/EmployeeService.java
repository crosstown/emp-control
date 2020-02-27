package net.fernandosimon.emp_control.services;


import net.fernandosimon.emp_control.domain.Category;
import net.fernandosimon.emp_control.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;

/**
 * @author F.S.(Crosstown)
 * @date 11/21/17
 * @time 4:13 PM
 */
public interface EmployeeService {

    Page<Employee> findAll (Pageable pageable);

    Set<Employee> getEmployees();

    Employee findById(Long id);

    Employee saveEmployee(Employee employee);

    void deleteById(Long id);

    List<Employee> getAllEmployeeByCategory(Long id);
}
