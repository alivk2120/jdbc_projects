package com.pms.entity;

public class Sale {
private int sid;
private String date;
private Product pro;
private int quantity;
private double revenue;
public Sale(int sid, String date, Product pro, int quantity, double revenue) {
	super();
	this.sid = sid;
	this.date = date;
	this.pro = pro;
	this.quantity = quantity;
	this.revenue = revenue;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Product getPro() {
	return pro;
}
public void setPro(Product pro) {
	this.pro = pro;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getRevenue() {
	return revenue;
}
public void setRevenue(double revenue) {
	this.revenue = revenue;
}

}
