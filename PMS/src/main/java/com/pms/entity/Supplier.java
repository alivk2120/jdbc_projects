package com.pms.entity;

public class Supplier {
private int supid;
private String supname;
private long supphone;
private String supemail;
private String supaddress;
public Supplier(int supid, String supname, long supphone, String supemail, String supaddress) {
	super();
	this.supid = supid;
	this.supname = supname;
	this.supphone = supphone;
	this.supemail = supemail;
	this.supaddress = supaddress;
}
public int getSupid() {
	return supid;
}
public void setSupid(int supid) {
	this.supid = supid;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}
public long getSupphone() {
	return supphone;
}
public void setSupphone(long supphone) {
	this.supphone = supphone;
}
public String getSupemail() {
	return supemail;
}
public void setSupemail(String supemail) {
	this.supemail = supemail;
}
public String getSupaddress() {
	return supaddress;
}
public void setSupaddress(String supaddress) {
	this.supaddress = supaddress;
}

}
