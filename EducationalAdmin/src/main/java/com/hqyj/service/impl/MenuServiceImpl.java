package com.hqyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.MenuMapper;
import com.hqyj.entity.Menu;
import com.hqyj.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	private MenuMapper mm;
	@Override
	public List<Menu> findMenuAll() {
		List<Menu> menus = mm.findMenuAll();
		return menus;
	}

}
