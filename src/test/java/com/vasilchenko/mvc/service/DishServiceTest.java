package com.vasilchenko.mvc.service;

import com.vasilchenko.java.dao.DishDAO;
import com.vasilchenko.java.model.Dish;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:test-hibernate-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(true)
public class DishServiceTest {

	@Autowired DishService dishservice;
	@Autowired DishDAO dishDAO;


	@Test
	public void testGetDishByName() throws Exception {
		Dish dish = new Dish();
		String testName = "testName";
		dish.setName(testName);
		dishDAO.addNewDish(dish);
		Assert.assertEquals(dish, dishservice.getDishByName(testName));
	}
}