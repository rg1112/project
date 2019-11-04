package com.hqyj.entity;

import java.sql.Date;
import java.util.List;

public class KaoQing {
	private int tkid;
	private int tid;
	private Date ttime;
	private String tkcontebt;
	private List<Teacher> te;
	private List<Stu> stu;
	public int getTkid() {
		return tkid;
	}
	public void setTkid(int tkid) {
		this.tkid = tkid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
	public List<Teacher> getTe() {
		return te;
	}
	public void setTe(List<Teacher> te) {
		this.te = te;
	}
	public List<Stu> getStu() {
		return stu;
	}
	public void setStu(List<Stu> stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "KaoQing [tkid=" + tkid + ", tid=" + tid + ", ttime=" + ttime + ", tkcontebt=" + tkcontebt + ", te=" + te
				+ ", stu=" + stu + "]";
	}
	
}
