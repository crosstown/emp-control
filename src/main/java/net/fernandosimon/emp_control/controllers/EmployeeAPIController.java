package net.fernandosimon.emp_control.controllers;

import net.fernandosimon.emp_control.domain.Employee;
import net.fernandosimon.emp_control.services.EmployeeService;
import net.fernandosimon.emp_control.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


/**
 * @author developer
 * @date 2020-01-11
 * @time 18:27
 */


@RestController
@RequestMapping("api/employees")
public class EmployeeAPIController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;


    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @RequestMapping(value = "/listPageable", method = RequestMethod.GET)
    public Page<Employee> getEmployeesPageables (Pageable pageable) {
        return employeeService.findAll(pageable);
    }

    @PostMapping("/new")
    public ResponseEntity<?> createNewEmployee (@RequestBody Employee employee, BindingResult result) {

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationErrorService(result);
        if(errorMap != null) return errorMap;

        Employee employee1 = employeeService.saveEmployee(employee);

        return new ResponseEntity<>(employee1, HttpStatus.CREATED);

    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getEmployeeById (@PathVariable Long employeeId) {

        Employee employee = employeeService.findById(employeeId);
        return  new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable Long employeeId) {
        employeeService.deleteById(employeeId);

        return new ResponseEntity<String>("Employee with Id: " + employeeId + " was Deleted!", HttpStatus.OK);
    }



}
