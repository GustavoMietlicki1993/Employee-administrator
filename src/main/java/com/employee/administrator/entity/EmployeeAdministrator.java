package com.employee.administrator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_ADMINISTRATOR")
public class EmployeeAdministrator {
	
	@Id
	@Column(name = "EMPLOYEE_ADMINISTRATOR_ID")
	private Integer employeeAdmionistratorId;
}
