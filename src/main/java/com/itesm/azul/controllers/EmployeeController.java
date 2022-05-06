package com.itesm.azul.controllers;


import com.itesm.azul.dto.EmployeeDTO;
import com.itesm.azul.models.Employee;
import com.itesm.azul.models.EmployeeId;
import com.itesm.azul.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    //CREATE EMPLOYEE
    @PostMapping("/save")
    public EmployeeDTO save(@RequestBody EmployeeDTO employeeDTO) throws Exception{
        employeeService.createEmployee(employeeDTO);
        return employeeDTO;
    }

    //GET ONE BY employee_id
    @GetMapping("/{role}/{employee_id}")
    public ResponseEntity<Employee> getOne(@PathVariable("role") String role, @PathVariable("employee_id") String employee_id) {
        if (!employeeService.existsId(new EmployeeId(role, employee_id))) {
            return new ResponseEntity("No existe el empleado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(employeeService.getOne(new EmployeeId(role, employee_id)));
    }

    //GET ALL
    @GetMapping("all")
    public ResponseEntity<Iterable<Employee>> getAll() {return ResponseEntity.ok(employeeService.all());}

    //UPDATE A TUPLE
    @PutMapping("/update")
    public ResponseEntity<Employee> update(@RequestBody EmployeeDTO employeeDTO){
        if(!employeeService.existsId(new EmployeeId(employeeDTO.getRole(), employeeDTO.getEmployee_id())))
        {
            return new ResponseEntity("no existe, no se puede actualizar", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(employeeService.update(employeeDTO));
    }

    //Delete a tuple
    @DeleteMapping("delete/{role}/{employee_id}")
    public ResponseEntity<Employee> delete(@PathVariable("role") String role, @PathVariable("employee_id") String employee_id){
        EmployeeId employeeId = new EmployeeId(role, employee_id);
        if(!employeeService.existsId(employeeId)){
            return new ResponseEntity("no existe, no se puede eliminar", HttpStatus.NOT_FOUND);
        }
        employeeService.delete(employeeId);
        return new ResponseEntity("empleado eliminado", HttpStatus.OK);
    }

}
