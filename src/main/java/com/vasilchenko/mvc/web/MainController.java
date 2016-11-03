package com.vasilchenko.mvc.web;


import com.vasilchenko.java.model.Dish;
import com.vasilchenko.mvc.service.DishService;
import com.vasilchenko.mvc.service.EmployeeService;
import com.vasilchenko.mvc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private DishService dishService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getAllEmployees(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("main");
		modelAndView.addObject("employees" , employeeService.getWaiters());
		modelAndView.addObject("menus" , menuService.getAllMenu());
		return modelAndView;
	}

	@RequestMapping(value = "/search_dish", method = RequestMethod.GET)
	public String findDishByName(@RequestParam("dishFindName") String dishFindName, Model model) {
		if (dishFindName != null) {
			Dish dish = dishService.getDishByName(dishFindName);
			if (dish != null) {
				model.addAttribute("dish", dish);
				return "dish";
			}
		}
		return "error-pages/ErrorPage404";
	}
}
