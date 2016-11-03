package com.vasilchenko.mvc.service;

import com.vasilchenko.java.dao.EmployeeDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@ContextConfiguration(locations = "classpath:test-hibernate-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

	@Autowired
	EmployeeDAO employeeDAO;

	@Transactional
	@Test
	@Rollback(true)
	public void testGetEmployee() throws Exception {
		System.out.println(employeeDAO.getAllEmployee());
	}

//	@Test
//	public void testGetEmployeeByName() throws Exception {
//
//	}
//
//	@Test
//	public void testGetWaiters() throws Exception {
//
//	}
}