package com.krupoderovmikhail.restapitest.controller;

import com.krupoderovmikhail.restapitest.model.Employee;
import com.krupoderovmikhail.restapitest.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Krupoderov Mikhail
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeService.findById(employeeId);

        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee employee) {
        Employee createdEmployee = employeeService.save(employee);

        return ResponseEntity.ok().body(createdEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeService.findById(employeeId);
        employeeService.delete(employeeId);

        return ResponseEntity.ok().body(employee);
    }
}
