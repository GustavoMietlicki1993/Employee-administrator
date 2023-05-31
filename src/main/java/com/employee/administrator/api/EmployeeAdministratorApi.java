package com.employee.administrator.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "api/employee-administrator")
public interface EmployeeAdministratorApi {
	
	@GetMapping(value="/")
	public ResponseEntity<?> getEmployee();
}
