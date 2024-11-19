package com.springboot.employee.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer empId;
	private String empName;
	private String empEmail;
	private String empDept;
	private String empSal;
	private String empPhno;

	public EmployeeEntity() {

	}

	public EmployeeEntity(Integer empId, String empName, String empEmail, String empDept, String empSal,
			String empPhno) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empDept = empDept;
		this.empSal = empSal;
		this.empPhno = empPhno;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public String getEmpPhno() {
		return empPhno;
	}

	public void setEmpPhno(String empPhno) {
		this.empPhno = empPhno;
	}

}
