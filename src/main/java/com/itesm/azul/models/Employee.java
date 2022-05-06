package com.itesm.azul.models;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;
@DynamoDBTable(tableName = "Employee")
public class Employee {
    @Id
    private EmployeeId employeeId;

    private String name;
    private String last_name;
    private String email;

    public Employee(){}

    public Employee(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    @DynamoDBHashKey(attributeName = "role")
    public String getRole() {
        return employeeId != null ? employeeId.getRole() : null;
    }

    public void setRole(String role) {
        if (employeeId == null) {
            employeeId = new EmployeeId();
        }
        employeeId.setRole(role);
    }


    @DynamoDBRangeKey(attributeName = "employee_id")
    public String getEmployee_id() {
        return employeeId != null ? employeeId.getEmployee_id() : null;
    }

    public void setEmployee_id(String employee_id) {
        if (employeeId == null) {
            employeeId = new EmployeeId();
        }
        employeeId.setEmployee_id(employee_id);
    }

    @DynamoDBAttribute
    public String getName() {return name;}

    @DynamoDBAttribute
    public String getLast_name() {return last_name;}

    @DynamoDBAttribute
    public String getEmail() {return email;}


    public void setName(String name) { this.name = name;}

    public void setLast_name(String last_name) {this.last_name = last_name;}

    public void setEmail(String email) {this.email = email;}



}
