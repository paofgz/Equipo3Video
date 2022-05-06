package com.itesm.azul.services;


import com.itesm.azul.dto.EmployeeDTO;
import com.itesm.azul.models.Employee;
import com.itesm.azul.models.EmployeeId;
import com.itesm.azul.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    //SAVE
    public void createEmployee(final EmployeeDTO employee){
        Employee e = new Employee();
        e.setRole(employee.getRole());
        e.setEmployee_id(employee.getEmployee_id());
        e.setName(employee.getName());
        e.setLast_name(employee.getLast_name());
        e.setEmail(employee.getEmail());
        employeeRepository.save(e);
    }

    //READ BY ID
    public Employee getOne(EmployeeId employeeId) {

        return employeeRepository.findById(employeeId).get();
    }

    //READ BY employee_id
    public boolean existsId(EmployeeId employeeId) {
        return employeeRepository.existsById(employeeId);
    }

    //READ ALL
    public Iterable<Employee> all() {return employeeRepository.findAll();}

    //UPDATE
    public Employee update(EmployeeDTO dto){
        EmployeeId eid = new EmployeeId(dto.getRole(), dto.getEmployee_id());
        Employee e = employeeRepository.findById(eid).get();
        e.setName(dto.getName());
        e.setLast_name(dto.getLast_name());
        e.setEmail(dto.getEmail());
        return employeeRepository.save(e);
    }

    //DELETE
    public void delete(EmployeeId employeeId) {employeeRepository.deleteById(employeeId);}





}
