package com.krupoderovmikhail.restapitest.repository;

import com.krupoderovmikhail.restapitest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Krupoderov Mikhail
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
