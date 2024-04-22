package com.tcs.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_TBL")

/*@IdClass(EmployeePKId.class)*/
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EmbeddedId
    private EmployeePKId employeePKId;
    private String name;
    private String email;
    private String phone;
    
    public Employee() {
    	
    }
    
    
	public Employee(EmployeePKId employeePKId, String name, String email, String phone) {
		super();
		this.employeePKId = employeePKId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


	public EmployeePKId getEmployeePKId() {
		return employeePKId;
	}
	public void setEmployeePKId(EmployeePKId employeePKId) {
		this.employeePKId = employeePKId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    
    
    
}
