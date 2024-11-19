package com.springboot.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.employee.entity.EmployeeEntity;
import com.springboot.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional
	public void saveUser(EmployeeEntity employeeEntity) {
		if (employeeEntity.getEmpId() == null) {

			employeeRepository.save(employeeEntity);
		} else {
			EmployeeEntity employeeUpdate = employeeRepository.findById(employeeEntity.getEmpId()).get();

			employeeUpdate.setEmpName(employeeEntity.getEmpName());

			employeeUpdate.setEmpEmail(employeeEntity.getEmpEmail());
			employeeUpdate.setEmpDept(employeeEntity.getEmpDept());
			employeeUpdate.setEmpSal(employeeEntity.getEmpSal());

			employeeUpdate.setEmpPhno(employeeEntity.getEmpPhno());
			employeeRepository.save(employeeUpdate);
		}
	}


	
	public EmployeeEntity getById(Integer empId) {
		return employeeRepository.findById(empId).get();
	}

	
	public void deleteEmployee(EmployeeEntity employeeEntity) {
		employeeRepository.delete(employeeEntity);
	}

	
	public List<EmployeeEntity> searchEmployees(String employeename) {

		return employeeRepository.findByEmpNameContaining(employeename);
	}

	
	public List<EmployeeEntity> getAllSortedBy(String columnName, String order) {
		Sort.Direction sortDirection = "asc".equalsIgnoreCase(order) ? Sort.Direction.ASC : Sort.Direction.DESC;
		return employeeRepository.findAll(Sort.by(sortDirection, columnName));
	}
	
	@Override
	public List<EmployeeEntity> getAll() {
		return employeeRepository.findAll();
	}

}
