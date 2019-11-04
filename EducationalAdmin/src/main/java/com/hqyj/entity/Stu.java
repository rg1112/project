package com.hqyj.entity;

import java.util.List;

public class Stu {
    private Integer sid;
    private String sno;
    private String sname;
    private String sex;
    private Object spwd;
    private Role role;
    private List<Grade> grade;
    private List<Course> course;
    private Banji banji;
    private Teacher teacher;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Object getSpwd() {
		return spwd;
	}
	public void setSpwd(Object spwd) {
		this.spwd = spwd;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Grade> getGrade() {
		return grade;
	}
	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public Banji getBanji() {
		return banji;
	}
	public void setBanji(Banji banji) {
		this.banji = banji;
	}
	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sno=" + sno + ", sname=" + sname + ", sex=" + sex + ", spwd=" + spwd + ", role="
				+ role + ", grade=" + grade + ", course=" + course + ", banji=" + banji + "]";
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
    
}