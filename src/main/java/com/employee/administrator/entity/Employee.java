package com.employee.administrator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
}
