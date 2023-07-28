package com.sms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.sms.entity.Student;

public class StudentDaoImpl implements StudentDao{
	Connection con=null;
	PreparedStatement pstmt;
	public StudentDaoImpl() throws SQLException{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","root");
		if(con!=null) {
			System.out.println("Connected successfully");
		}
		else {
			System.out.println("Not connected");
		}
	}

	@Override
	public int addStudent(Student st) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			pstmt=(PreparedStatement) con.prepareStatement("insert into student values(?,?,?,?,?)");
			pstmt.setInt(1, st.getId());
			pstmt.setString(2, st.getName());
			pstmt.setInt(3, st.getAge());
			pstmt.setString(4, st.getEmail());
			pstmt.setString(5, st.getAddress());
			i=pstmt.executeUpdate();
			System.out.println("Row added");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}

	@Override
	public int getStudent() {
		// TODO Auto-generated method stub
		try {
            pstmt=(PreparedStatement) con.prepareStatement("select * from student");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getString(5));
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
		return 0;
	}

	
	@Override
	public int updateStudentById(int id, String name) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("update student set name=? where id=?");
			pstmt.setString(1,name);
			pstmt.setInt(2, id);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Updated successfully");
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
	public int deleteStudentById(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("delete from student where id=?");
			pstmt.setInt(1, id);
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Deleted successfully");
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

	@Override
	public int getStudentById(int id) {
		// TODO Auto-generated method stub
		try {
			pstmt=(PreparedStatement) con.prepareStatement("select * from student where id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getString(5));
            }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

}
