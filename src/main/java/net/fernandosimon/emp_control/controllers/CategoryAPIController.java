package net.fernandosimon.emp_control.controllers;

import net.fernandosimon.emp_control.domain.Employee;
import net.fernandosimon.emp_control.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author developer
 * @date 2020-01-12
 * @time 14:30
 */
@RestController
@RequestMapping("api/categories")
public class CategoryAPIController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{catId}")
    public Iterable<Employee> getAllEmployeesByCategory (@PathVariable Long catId) {
        return employeeService.getAllEmployeeByCategory(catId);
    }
}

