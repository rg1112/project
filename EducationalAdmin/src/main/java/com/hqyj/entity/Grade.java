package com.hqyj.entity;

public class Grade {
	private int gid;
	private int grade;
	
	public int getGid() {
		return gid;
	}


	public void setGid(int gid) {
		this.gid = gid;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", grade=" + grade + "]";
	}

}
