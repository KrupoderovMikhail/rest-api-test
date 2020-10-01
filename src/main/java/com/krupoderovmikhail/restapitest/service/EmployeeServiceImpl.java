package com.krupoderovmikhail.restapitest.service;

import com.krupoderovmikhail.restapitest.exception.DataNotFoundException;
import com.krupoderovmikhail.restapitest.exception.EmployeeNotFoundException;
import com.krupoderovmikhail.restapitest.model.Employee;
import com.krupoderovmikhail.restapitest.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Krupoderov Mikhail
 */
@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = employeeRepository.findAll();

        if (employees.isEmpty()) {
            throw new DataNotFoundException();
        }
        log.info("IN getAll - {} employees found", employees.size());

        return employees;
    }

    @Override
    public Employee findById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
        log.info("IN findById - employee: {} found by id :{}", employee, id);

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee createdEmployee = employeeRepository.save(employee);
        log.info("IN createUser - employee: {} successfully created", createdEmployee);

        return createdEmployee;
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
        log.info("IN delete - employee with id: {} successfully deleted", id);
    }
}
