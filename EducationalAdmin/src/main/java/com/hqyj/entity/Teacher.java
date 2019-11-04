package com.hqyj.entity;

import java.util.List;

public class Teacher {
    private Integer tid;
    private String tname;
    private String ton;
    private String tsex;
    private Object tpwd;
    public Object getTpwd() {
		return tpwd;
	}
	public void setTpwd(Object tpwd) {
		this.tpwd = tpwd;
	}
	private Integer tcourse; 
    private Role role;
    private List<KaoQing> kao;
    private Integer rid;
    private Course course;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTon() {
		return ton;
	}
	public void setTon(String ton) {
		this.ton = ton;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	
	public Integer getTcourse() {
		return tcourse;
	}
	public void setTcourse(Integer tcourse) {
		this.tcourse = tcourse;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<KaoQing> getKao() {
		return kao;
	}
	public void setKao(List<KaoQing> kao) {
		this.kao = kao;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", ton=" + ton + ", tsex=" + tsex + ", tpwd=" + tpwd
				+ ", tcourse=" + tcourse + ", role=" + role + ", kao=" + kao + "]";
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
    
}