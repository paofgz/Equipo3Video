package com.itesm.azul.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

public class EmployeeId {

    private String role;
    private String employee_id;

    public EmployeeId() {}

    public EmployeeId(String role, String employee_id) {
        this.role = role;
        this.employee_id = employee_id;
    }

    @DynamoDBHashKey(attributeName = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @DynamoDBRangeKey(attributeName = "employee_id")
    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
