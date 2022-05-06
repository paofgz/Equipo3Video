package com.itesm.azul.dto;

public class EmployeeDTO {

    private String role;
    private String employee_id;
    private String name;
    private String last_name;
    private String email;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employeeId) {
        this.employee_id = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
