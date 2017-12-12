package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcFileInput {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/becem156_db", "root", "root");
				PreparedStatement pstmt = con.prepareStatement("insert into files values(?,?)");) {
			pstmt.setInt(1, 1);
			pstmt.setBlob(2, new FileInputStream(new File("D:/Test.txt")));
			int i = pstmt.executeUpdate();
			if(i==1) 
				System.out.println("inserted");
			else
				System.out.println("not inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
