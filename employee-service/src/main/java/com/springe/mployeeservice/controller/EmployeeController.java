package com.springe.mployeeservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springe.mployeeservice.model.Employee;
import com.springe.mployeeservice.repository.EmployeeRepository;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	public static final Logger LOGGER
	
    =LoggerFactory.getLogger(EmployeeController.class);

@Autowired	
private EmployeeRepository repository;

@PostMapping("/add")
public Employee add(@RequestBody Employee employee) {
	LOGGER.info("Employee add", employee);
	return repository.addDepartment(employee);
}

@GetMapping("/findAll")
public List<Employee> findAll(){
	LOGGER.info("Employee find: {}");
	return repository.findAll();
}

@GetMapping("/{id}")
public Employee findById(@PathVariable Long id) {
	LOGGER.info("Employee add: id={}",id);
	return repository.findByID(id);
}

@GetMapping("/department/{departmentId}")
 public List<Employee> findByDepartment(@PathVariable ("departmentId") Long departmentId ){
	return repository.findByDepartment(departmentId);
	 
 }
}
