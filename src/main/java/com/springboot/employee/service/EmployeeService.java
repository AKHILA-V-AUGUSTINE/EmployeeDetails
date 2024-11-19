package com.springboot.employee.service;

import java.util.List;

import com.springboot.employee.entity.EmployeeEntity;

public interface EmployeeService {

	void saveUser(EmployeeEntity employeeEntity);

	List<EmployeeEntity> getAll();

	EmployeeEntity getById(Integer empId);

	

	void deleteEmployee(EmployeeEntity employeeEntity);

	List<EmployeeEntity> searchEmployees(String query);

	List<EmployeeEntity> getAllSortedBy(String columnName, String order);

}
