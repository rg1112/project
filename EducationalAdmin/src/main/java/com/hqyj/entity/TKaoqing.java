package com.hqyj.entity;


import java.sql.Date;
import java.util.List;



public class TKaoqing {
	private int tkid;
	private int tid;
	private Date ttime;
	private String dateString;
	private String tkcontebt;
	private List<Teacher> teacher;
	
	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public int getTkid() {
		return tkid;
	}
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public void setTkid(int tkid) {
		this.tkid = tkid;
	}
	public Date getTtime() {
		return ttime;
	}
	public void setTtime(Date ttime) {
		this.ttime = ttime;
	}
	public String getTkcontebt() {
		return tkcontebt;
	}
	public void setTkcontebt(String tkcontebt) {
		this.tkcontebt = tkcontebt;
	}
	
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "TKaoqing [tkid=" + tkid + ", ttime=" + ttime + ", tkcontebt=" + tkcontebt + ", teacher=" + teacher
				+ "]";
	}
	
	

}
