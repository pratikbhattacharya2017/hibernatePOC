import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionTest {
	
	public static void main(String[] args) {
		
		String JdbcURL="jdbc:mysql://localhost:3306/test3";
		String userName="root";
		String password="";
		try{
			
			System.out.println("Connecting to db");
			Connection myConn=DriverManager.getConnection(JdbcURL,userName,password);
			System.out.println("connection established sucessfully");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
