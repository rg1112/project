package com.hqyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.TKaoqingMapper;
import com.hqyj.entity.TKaoqing;

import com.hqyj.service.TKaoqingService;
@Service
public class TKaoqingServiceImpl implements TKaoqingService{

	@Autowired
	private TKaoqingMapper tkm;

	@Override
	public List<TKaoqing> findTkaoqingAll() {
		List<TKaoqing> tk = tkm.findTkaoqingAll();
		return tk;
	}

	@Override
	public int updateTkaoqingBytkid(TKaoqing tk) {
		int num = tkm.updateTkaoqingBytkid(tk);
		return num;
	}

	@Override
	public List<TKaoqing> selectkq(int tkid) {
		List<TKaoqing> kq = tkm.selectkq(tkid);
		return kq;
	}

	@Override
	public int addTkaoqing(TKaoqing tk) {
		int add = tkm.addTkaoqing(tk);
		return add;
	}

	@Override
	public List<TKaoqing> selectkqt(int tkid) {
		// TODO Auto-generated method stub
		List<TKaoqing> kq = tkm.selectkqt(tkid);
		return kq;
	}

	@Override
	public int delectTkaoq(int tkid) {
		int delectTkaoq = tkm.delectTkaoq(tkid);
		return delectTkaoq;
		
	}

	
	
	
	
	
	
	
}
