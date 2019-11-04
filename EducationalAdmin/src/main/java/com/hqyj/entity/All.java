package com.hqyj.entity;

public class All {
	private int sid;

	private String sno;

	private String sname;

	private String sex;

	private String spwd;
	private Role role;
	
	private Banji banji;
	private int bsid;
	

	private String bname;
	private String bno;
	
	private int bid;
	private int cid;
	private String cname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Banji getBanji() {
		return banji;
	}
	public void setBanji(Banji banji) {
		this.banji = banji;
	}
	public int getBsid() {
		return bsid;
	}
	public void setBsid(int bsid) {
		this.bsid = bsid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "All [sid=" + sid + ", sno=" + sno + ", sname=" + sname + ", sex=" + sex + ", spwd=" + spwd + ", role="
				+ role + ", banji=" + banji + ", bsid=" + bsid + ", bname=" + bname + ", bno=" + bno + ", bid=" + bid
				+ ", cid=" + cid + ", cname=" + cname + "]";
	}
	
}
