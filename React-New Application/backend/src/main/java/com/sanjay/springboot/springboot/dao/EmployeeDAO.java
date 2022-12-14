package com.sanjay.springboot.springboot.dao;

import java.util.List;

import com.sanjay.springboot.springboot.modal.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	

}
