package JDBCDem.JDBCConnect;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
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
        	String sql="insert into employee values(24,'virat','delhi')";
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
}
