package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import mavenapp.JdbcUtil;

public class JDBCConnectionUtil {
	
	private JDBCConnectionUtil connectionUtil;
	private static Connection con ;

	private JDBCConnectionUtil() {
		
	}
	
	static {
		try {
			//step 1 : load and register driver-----auto loading
			//sept 2;
			
			con = DriverManager.getConnection(JdbcUtil.URL,JdbcUtil.USERNAME,JdbcUtil.PASSWORD);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection() {
	//assgn to check
		
		return con;
	}

}
