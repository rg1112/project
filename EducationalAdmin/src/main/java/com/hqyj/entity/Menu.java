package com.hqyj.entity;

import java.util.List;

public class Menu {
	private int mid;
	private String mname;
	private String mpath;
	private List<Role> roles;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpath() {
		return mpath;
	}
	public void setMpath(String mpath) {
		this.mpath = mpath;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", mpath=" + mpath + ", roles=" + roles + "]";
	}
	
}
