package com.pms.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.pms.entity.Product;
import com.pms.entity.Supplier;

public class ProductDaoImpl implements ProductDao{
  Connection con=null;
  PreparedStatement pstmt;
  public ProductDaoImpl() throws SQLException{
	  con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","root");
	  
  }
@Override
public boolean addProduct(Product pro) {
	// TODO Auto-generated method stub
	try {
		pstmt=(PreparedStatement) con.prepareStatement("insert into product values(?,?,?,?,?,?)");
		pstmt.setInt(1, pro.getSku());
		pstmt.setString(2, pro.getName());
		pstmt.setString(3, pro.getInfo());
		pstmt.setInt(4, pro.getSup().getSupid());
		pstmt.setInt(5, pro.getQuantity());
		pstmt.setDouble(6, pro.getPrice());
		pstmt.executeUpdate();
		}
	catch(Exception e) {
		System.out.println(e);
	}
	return false;
}

@Override
public int updateProduct(int sku, double price) {
	// TODO Auto-generated method stub
	try {
		pstmt=(PreparedStatement) con.prepareStatement("update product set price=? where sku=?");
		pstmt.setDouble(1, price);
		pstmt.setInt(2, sku);
		pstmt.executeUpdate();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return 0;
}
@Override
public int getProductBySku(int sku) {
	// TODO Auto-generated method stub
	try {
		pstmt=(PreparedStatement) con.prepareStatement("select * from product where sku=?");
		pstmt.setInt(1, sku);
		 ResultSet rs=pstmt.executeQuery();
         while(rs.next()) {
             System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getInt(5)+rs.getDouble(6));
         }
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return 0;
}
@Override
public int sortProductBySku() {
	// TODO Auto-generated method stub
	try {
		pstmt=(PreparedStatement) con.prepareStatement("select * from product order by sku");
		ResultSet rs=pstmt.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getInt(5)+rs.getDouble(6));
        }
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return 0;
}
@Override
public int getProduct() {
	// TODO Auto-generated method stub
	try {
		pstmt=(PreparedStatement) con.prepareStatement("select * from product");
		ResultSet rs=pstmt.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getInt(5)+rs.getDouble(6));
        }
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return 0;
}
}
