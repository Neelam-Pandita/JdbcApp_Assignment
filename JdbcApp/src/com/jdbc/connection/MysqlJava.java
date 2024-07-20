package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

 
public class MysqlJava {

	public static void main(String[] args) throws Exception {
		//Driver driver=new Driver();
		//DriverManager.registerDriver(driver);
		
		//Register driver with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// creating connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root@123");
		
		//creating statement/truck
		Statement st = con.createStatement();
		
		//add query into truck and send it for execution
		int res=st.executeUpdate("insert into emp values(6,'Kathy',2000)");
		System.out.println("record added "+res);
		
		con.close();

	}

}
