package com.vasilchenko.mvc.service;

import com.vasilchenko.java.components.Position;
import com.vasilchenko.java.dao.EmployeeDAO;
import com.vasilchenko.java.model.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@ContextConfiguration(locations = "classpath:test-hibernate-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(true)
public class EmployeeServiceTest {

	@Autowired EmployeeService employeeService;
	@Autowired EmployeeDAO employeeDAO;

	@Test
	public void testGetWaiters() throws Exception {
		List<Employee> allWaiters = employeeService.getWaiters();
		List<Employee> result = employeeDAO.getAllEmployee().stream()
				.filter(employee -> employee.getPosition() == Position.WAITER)
				.collect(Collectors.toList());
		Assert.assertEquals(result, allWaiters);
	}
}