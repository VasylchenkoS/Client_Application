package com.vasilchenko.mvc.service;


import com.vasilchenko.java.dao.EmployeeDAO;
import com.vasilchenko.java.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public List<Employee> getEmployee(){
		return employeeDAO.getAllEmployee();
	}

	public Employee getEmployeeByName(String employeeName) {
		return employeeDAO.getEmployeeBySurname(employeeName);
	}

	public List<Employee> getWaiters() {
		return employeeDAO.getAllWaiters();
	}

}
