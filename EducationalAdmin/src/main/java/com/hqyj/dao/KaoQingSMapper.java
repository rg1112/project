package com.hqyj.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.KaoQing;
import com.hqyj.entity.Teacher;

@Repository
public interface KaoQingSMapper {
	
    List<KaoQing> findPersonkqStu(String tonp);
    List<KaoQing> findStudentKqAll();
    int addStudentKq(KaoQing kao);
    KaoQing findStudentByIdKq(int id);
    int updateStudentKq(KaoQing kao);
    int deleteStudentKq(int id);

}
