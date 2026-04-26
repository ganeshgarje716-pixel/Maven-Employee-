package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
	
	
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	
	private static final String username="root";
	
	private static final String password="garje@716Garje";
	
	
	
	public static Connection createConnection() {
		
		Connection con=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con = DriverManager.getConnection(url, username, password);
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}

}
