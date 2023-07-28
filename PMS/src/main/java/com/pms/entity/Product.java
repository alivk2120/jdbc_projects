package com.pms.entity;

public class Product {
private int sku;
private String name;
private String info;
private Supplier sup;
private int quantity;
private double price;
public Product(int sku, String name, String info, Supplier sup, int quantity, double price) {
	super();
	this.sku = sku;
	this.name = name;
	this.info = info;
	this.sup = sup;
	this.quantity = quantity;
	this.price = price;
}
public int getSku() {
	return sku;
}
public void setSku(int sku) {
	this.sku = sku;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public Supplier getSup() {
	return sup;
}
public void setSup(Supplier sup) {
	this.sup = sup;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
