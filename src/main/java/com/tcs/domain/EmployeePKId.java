package com.tcs.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.EqualsAndHashCode;


@Embeddable
@EqualsAndHashCode
public class EmployeePKId implements Serializable {
	  @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "employee_id")
	    private Integer employeeId;

	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "dept_id")
	    private Integer deptId;
	    
	    public EmployeePKId() {
	    	
	    }
	    
	    

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public Integer getDeptId() {
			return deptId;
		}

		public void setDeptId(Integer deptId) {
			this.deptId = deptId;
		}



		public EmployeePKId(Integer employeeId, Integer deptId) {
			super();
			this.employeeId = employeeId;
			this.deptId = deptId;
		}
	    
	    
}
