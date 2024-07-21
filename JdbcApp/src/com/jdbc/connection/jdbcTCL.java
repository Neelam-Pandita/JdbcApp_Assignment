package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcTCL {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root@123");
		con.setAutoCommit(false);
		try {
			Statement st =con.createStatement();
			Statement st1 =con.createStatement();
			st.executeUpdate("update emp set sal = sal-600 where id=3");
			st1.executeUpdate("update emp set sal=sal+600 where id=2");
			con.commit();
		}
		
		catch(Exception e) {
			e.printStackTrace();
			con.rollback();
			
		}
		con.close();
	}

}
