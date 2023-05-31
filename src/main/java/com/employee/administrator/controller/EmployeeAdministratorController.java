package com.employee.administrator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.employee.administrator.api.EmployeeAdministratorApi;

@Controller
public class EmployeeAdministratorController implements EmployeeAdministratorApi {

	@Override
	public ResponseEntity<?> getEmployee() {
		return null;
	}

}
