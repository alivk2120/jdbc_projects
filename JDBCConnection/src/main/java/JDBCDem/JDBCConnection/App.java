package JDBCDem.JDBCConnection;
import java.sql.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	void addData() {
		try {
         	Class.forName("com.mysql.jdbc.Driver");
         	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","root");
         	if(con!=null) {
         		System.out.println("Successfully connected "+con);
         	}
         	else {
         		System.out.println("not connected");
         	}
		  Statement stmt=con.createStatement();
    	  String sql="insert into employee values(27,'salman','france')";
    	int i=stmt.executeUpdate(sql);
    	if(i>0) {
    		System.out.println("Row inserted");
    	}
    	else {
    		System.out.println("not inserted");
    	}
	}
		catch(Exception e) {
         	System.out.println("e");
         }
	}
	void updateData() {
		try {
         	Class.forName("com.mysql.jdbc.Driver");
         	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","root");
         	if(con!=null) {
         		System.out.println("Successfully connected "+con);
         	}
         	else {
         		System.out.println("not connected");
         	}
		  Statement stmt=con.createStatement();
    	  String sql="update employee set employee_name='elonmusk' where employee_id=23";
    	int i=stmt.executeUpdate(sql);
    	if(i>0) {
    		System.out.println("Row updated");
    	}
    	else {
    		System.out.println("not updated");
    	}
	}
		catch(Exception e) {
         	System.out.println("e");
         }
	}
	void deleteData() {
		try {
         	Class.forName("com.mysql.jdbc.Driver");
         	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","root");
         	if(con!=null) {
         		System.out.println("Successfully connected "+con);
         	}
         	else {
         		System.out.println("not connected");
         	}
		  Statement stmt=con.createStatement();
    	  String sql="delete from employee where employee_id=22";
    	int i=stmt.executeUpdate(sql);
    	if(i>0) {
    		System.out.println("Row deleted");
    	}
    	else {
    		System.out.println("not deleted");
    	}
	}
		catch(Exception e) {
         	System.out.println("e");
         }
	}
	
	
    public static void main( String[] args ) throws ClassNotFoundException

    {
    	Scanner s =new Scanner(System.in);
         	System.out.println("Enter your choice");
         	int ch=s.nextInt();
         	App a=new App();
         	switch(ch)
         	{
         	case 1:
         	       a.addData();
         	       break;
         	case 2:
         	       a.updateData();
         	       break;
         	case 3:
         	       a.deleteData();
         	       break;
         	default: System.out.println("Invalid choice");
         	       }
         	
         	
        
         	
    }
    	 
}

