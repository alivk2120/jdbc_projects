package com.pms.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.pms.entity.Sale;

public class SalesDaoImpl implements SalesDao{
	Connection con=null;
	  PreparedStatement pstmt;
	  public SalesDaoImpl() throws SQLException{
		  con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","root");
		  
	  }

	@Override
	public boolean addSales(Sale s) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("insert into sale values(?,?,?,?,?)");
			pstmt.setInt(1, s.getSid());
			pstmt.setString(2, s.getDate());
			pstmt.setInt(3, s.getPro().getSku());
			pstmt.setInt(4, s.getQuantity());
			pstmt.setDouble(5, s.getRevenue());
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("row added");
			}
			else {
				System.out.println("not added");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public int getSales() {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from sale");
			ResultSet rs=pstmt.executeQuery();
	         while(rs.next()) {
	             System.out.println(rs.getInt(1)+rs.getString(2)+rs.getLong(3)+rs.getString(4)+rs.getString(5));
	         }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public int updateSales(int sid, double revenue) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("update sale set revenue=? where sid=?");
			pstmt.setDouble(1, revenue);
			pstmt.setInt(2, sid);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("updated successfully");
			}
			else {
				System.out.println("not updated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public int searchSalesById(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from sale where sid=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
	         while(rs.next()) {
	             System.out.println(rs.getInt(1)+rs.getString(2)+rs.getLong(3)+rs.getString(4)+rs.getString(5));
	         }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public int deleteSalesById(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("delete from sale where sid=?");
			pstmt.setInt(1, id);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not deleted");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
  
}
