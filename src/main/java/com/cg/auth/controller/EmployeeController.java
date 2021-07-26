package com.cg.auth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.auth.Repo.EmployeeRepository;
import com.cg.auth.exceptions.EmployeeException;
import com.cg.auth.pojo.Employee;



@RequestMapping("/api/emp")
@RestController
public class EmployeeController {
@Autowired
private EmployeeRepository empRepo;
	@PostMapping("/add")
	public  Employee addEmployee(@RequestBody Employee emp){
		empRepo.addEmployee(emp);
		return emp;	
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() throws EmployeeException{
		List<Employee> employee= new ArrayList<>();
		employee=empRepo.getAllEmployees();
		return employee;	
	}

	
}
