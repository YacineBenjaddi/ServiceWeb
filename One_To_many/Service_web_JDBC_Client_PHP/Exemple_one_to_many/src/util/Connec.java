package util;

import java.sql.*;

public class Connec {
	
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isihibernate2","root","");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	

}
