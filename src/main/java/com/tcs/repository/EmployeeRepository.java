package com.tcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.domain.Employee;
import com.tcs.domain.EmployeePKId;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKId> {
}
