package com.itesm.azul.repositories;

import com.itesm.azul.models.Employee;
import com.itesm.azul.models.EmployeeId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface EmployeeRepository extends
        CrudRepository<Employee, EmployeeId> {
}
