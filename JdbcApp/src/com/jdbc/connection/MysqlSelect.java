package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MysqlSelect {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root@123");
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
			int i=rs.getInt("id");
			String n =rs.getString("name");
			int s= rs.getInt("sal");
			System.out.println(i+" "+n+" "+s); 
		}
		
				
		
		

	}

}
