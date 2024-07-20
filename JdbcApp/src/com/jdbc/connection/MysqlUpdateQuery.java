package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MysqlUpdateQuery {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root@123");
		Statement st = con.createStatement();
		int res=st.executeUpdate("update emp set sal=3001 where id=3");
		System.out.println(res+"record updated");
		
		con.close();
		

	}

}
