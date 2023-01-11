package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class SingletonConnection {
	private static Connection connection;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/CATE_PROD","root","");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
 public static Connection getconnection() {
	 return connection;
 }

public static void setConnection(Connection connection) {
	SingletonConnection.connection = connection;
}
}
