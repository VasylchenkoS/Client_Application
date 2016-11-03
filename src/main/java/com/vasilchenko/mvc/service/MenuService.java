package com.vasilchenko.mvc.service;


import com.vasilchenko.java.dao.MenuDAO;
import com.vasilchenko.java.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MenuService {

	@Autowired
	private MenuDAO menuDAO;

	public List<Menu> getAllMenu(){
		return menuDAO.getAllMenu();
	}
}
