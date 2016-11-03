package com.vasilchenko.mvc.web;


import com.vasilchenko.java.model.Dish;
import com.vasilchenko.mvc.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@Autowired
	private DishService dishService;

	@RequestMapping(value = "/dish/{dishName}", method = RequestMethod.GET)
	public ModelAndView showDishInformationPage(@PathVariable("dishName") String dishName) {
		Dish dish = dishService.getDishByName(dishName);
		ModelAndView model = new ModelAndView("dish");
		model.addObject("dish", dish);
		return model;
	}


}
