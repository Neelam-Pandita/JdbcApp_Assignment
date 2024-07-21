package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;

public class JdbcPrepareStatement {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root@123");
		//PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
		PreparedStatement ps = con.prepareStatement("update emp set sal=20 where id=(?)");
		ps.setInt(1, 3);
		//ps.setInt(1, 8);
		//ps.setString(2, "Rhea");
		//ps.setInt(3, 5000);
		int res=ps.executeUpdate();
		System.out.println(res+"inserted by prepare statement");
		con.close();

	}

}
