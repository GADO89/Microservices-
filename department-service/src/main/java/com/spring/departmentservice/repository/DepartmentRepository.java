package com.spring.departmentservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.Department;
import model.Employee;

@Repository
public class DepartmentRepository {


	
	private  List<Department> departments
	          = new ArrayList<Department>();

	public Department addDepartment(Department department) {
		departments.add(department);
		return department;}
	
	public Department findByID(Long id) {
		return departments.stream()
				.filter(department -> department.getId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<Department> findAll() {
		return departments;
	}
}
