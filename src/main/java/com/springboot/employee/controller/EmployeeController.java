package com.springboot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.employee.entity.EmployeeEntity;
import com.springboot.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public ModelAndView viewEmployees(Model model) {
		ModelAndView mav = new ModelAndView("EmployeeView");
		List<EmployeeEntity> employeeView = employeeService.getAll();
		mav.addObject("employees", employeeView);
		return mav;
	}

	@GetMapping("/addEmployees")
	public ModelAndView getAddEmployees() {
		ModelAndView mav = new ModelAndView("AddEmployee");

		return mav;
	}

	@PostMapping("/save-user")
	public String saveEmployees(@ModelAttribute("employeeEntity") EmployeeEntity employeeEntity) {
		employeeService.saveUser(employeeEntity);
		return "redirect:/";
	}

	@GetMapping("/employee-update/{id}")
	public ModelAndView getEmployee(@PathVariable("id") Integer empId) {
		ModelAndView mav = new ModelAndView("EditEmployee");
		EmployeeEntity employeeEntity = employeeService.getById(empId);
		mav.addObject("emp", employeeEntity);
		return mav;
	}

	@GetMapping("/employee-delete/{id}")
	public String deleteEmployee(@PathVariable("id") Integer userId) {
		EmployeeEntity deleteEmployee = employeeService.getById(userId);
		employeeService.deleteEmployee(deleteEmployee);
		return "redirect:/";
	}

	@GetMapping("/search-employees")
	public ModelAndView searchById(@RequestParam("id") Integer empId) {
		ModelAndView mav = new ModelAndView("SearchResult");
		EmployeeEntity employee = employeeService.getById(empId);
        mav.addObject("employee", employee);
		return mav;
	}

}
