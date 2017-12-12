package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1st step
			Object obj = Class.forName("com.mysql.jdbc.Driver").newInstance();
			Driver ref = (Driver)obj;
			DriverManager.registerDriver(ref);

			// 2nd step
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_db","root","root");

			// 3rd step
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from movies");
			
			// 4th step
			while(rs.next()){
				System.out.println("No:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Rate:"+rs.getInt(3));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
