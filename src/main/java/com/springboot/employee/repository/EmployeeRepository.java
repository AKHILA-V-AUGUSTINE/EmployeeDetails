package com.springboot.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employee.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	EmployeeEntity findByEmpEmail(String email);
	
	List<EmployeeEntity> findByEmpNameContaining(String empname); 

}