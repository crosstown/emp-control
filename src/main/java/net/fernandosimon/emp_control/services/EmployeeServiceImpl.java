package net.fernandosimon.emp_control.services;

import lombok.extern.slf4j.Slf4j;
import net.fernandosimon.emp_control.domain.Category;
import net.fernandosimon.emp_control.domain.Employee;
import net.fernandosimon.emp_control.exceptions.CategoryIdException;
import net.fernandosimon.emp_control.exceptions.MissingNameException;
import net.fernandosimon.emp_control.repos.CategoryRepository;
import net.fernandosimon.emp_control.repos.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author F.S.(Crosstown)
 * @date 11/21/17
 * @time 4:23 PM
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;
  //  private final CategoryRepository categoryRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Set<Employee> getEmployees() {

        Set<Employee> employeeList = new HashSet<>();

        employeeRepository.findAll().iterator().forEachRemaining(employeeList::add);
//        List sortedList = new ArrayList(employeeList);
//        Collections.sort(sortedList, new SortByLastName());

//        employeeList = new HashSet<>(sortedList);
        return employeeList;
    }

    @Override
    public Employee findById(Long l) {

        Optional<Employee> employeeOptional = employeeRepository.findById(l);

        if (!employeeOptional.isPresent()) {
            throw new RuntimeException("Employee not found!!");
        }

        return employeeOptional.get();
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {

        if ((employee.getFirstName() == null) || (employee.getLastName() == null)) {
            throw new MissingNameException("First and Last names must be present");
        }

        try {
            Employee savedEmployee = employeeRepository.save(employee);
//        log.debug("Saved EmployeeId:" + savedEmployee.getId());
            return savedEmployee;
        } catch (Exception e) {
            throw new CategoryIdException("Employee must have a category already in the database");
        }
    }

    @Override
    public void deleteById(Long id) {

        employeeRepository.deleteById(id);

    }

    @Override
    public List<Employee> getAllEmployeeByCategory(Long id) {
        Iterable<Employee> employees = this.employeeRepository.findAll();
        List<Employee> employeeList = new ArrayList<>();
        employees.forEach(employee -> {
            if (employee.getCategory().getId() == id)
                employeeList.add(employee);
            });
    return employeeList;

}}
