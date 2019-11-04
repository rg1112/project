package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.TKaoqing;


public interface TKaoqingService {
	public List<TKaoqing> findTkaoqingAll();
	public int updateTkaoqingBytkid(TKaoqing tk);
	public List<TKaoqing> selectkq(int tkid);
	public List<TKaoqing> selectkqt(int tkid);
	public int addTkaoqing(TKaoqing tk);
	public int delectTkaoq(int tkid);
}
