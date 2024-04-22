package com.tcs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.domain.Employee;
import com.tcs.domain.EmployeePKId;
import com.tcs.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/")
	public Employee save(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}
	@GetMapping("/{employeeId}/{deptId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId, @PathVariable Integer deptId) {
	    Optional<Employee> optionalEmployee = repository.findById(new EmployeePKId(employeeId, deptId));
	    return optionalEmployee.orElseThrow(() -> new RuntimeException("Employee not found")); // Or handle the absence of employee as needed
	}


	    @DeleteMapping("/{employeeId}/{deptId}")
	    public void deleteEmployeeById(@PathVariable Integer employeeId, @PathVariable Integer deptId) {
	        repository.deleteById(new EmployeePKId(employeeId, deptId));
	    }

}
