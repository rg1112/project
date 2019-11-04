package com.hqyj.entity;

public class PassWord {
private Object oldpwd;
private Object newpwd;
private String name;
public Object getOldpwd() {
	return oldpwd;
}
public void setOldpwd(Object oldpwd) {
	this.oldpwd = oldpwd;
}
public Object getNewpwd() {
	return newpwd;
}
public void setNewpwd(Object newpwd) {
	this.newpwd = newpwd;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "PassWord [oldpwd=" + oldpwd + ", newpwd=" + newpwd + ", name=" + name + "]";
}


}
