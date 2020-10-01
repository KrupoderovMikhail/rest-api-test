package com.krupoderovmikhail.restapitest.service;

import com.krupoderovmikhail.restapitest.model.Employee;

import java.util.List;

/**
 * @author Krupoderov Mikhail
 */
public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(Long id);

    public Employee save(Employee employee);

    public void delete(Long id);
}
