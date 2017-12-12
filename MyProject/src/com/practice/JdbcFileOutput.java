package com.practice;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcFileOutput {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/becem156_db", "root", "root");
				PreparedStatement pstmt = con.prepareStatement("select * from files");
				ResultSet rs = pstmt.executeQuery();) {
			while(rs.next()) {
				Blob blob = rs.getBlob(2);
				InputStream in = blob.getBinaryStream();
				int i;
				while((i = in.read())!=-1) {
					System.out.print((char)i);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
