package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Menu;

@Repository
public interface MenuMapper {
	public List<Menu> findMenuAll();
}
