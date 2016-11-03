package com.vasilchenko.mvc.service;


import com.vasilchenko.java.dao.DishDAO;
import com.vasilchenko.java.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DishService {

	@Autowired
	private DishDAO dishDAO;

	@Transactional
	public Dish getDishByName(String dishName){
		return dishDAO.findByName(dishName);
	}
}
