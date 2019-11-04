package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.KaoQing;
import com.hqyj.entity.Teacher;

@Repository
public interface KaoQingTMapper {
	
    List<KaoQing> findPersonkq(String tonp);

}
