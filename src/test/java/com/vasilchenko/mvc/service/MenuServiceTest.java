package com.vasilchenko.mvc.service;

import com.vasilchenko.java.dao.MenuDAO;
import com.vasilchenko.java.model.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:test-hibernate-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuServiceTest {

	@Autowired
	private MenuDAO menuDAO;

	@Transactional
	@Test
	@Rollback(true)
	public void testGetAllMenu() throws Exception {
		for (Menu menu : menuDAO.getAllMenu()) {
			System.out.println(menu + "/n");
		}
	}
}