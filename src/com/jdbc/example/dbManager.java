package com.jdbc.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class dbManager {
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/naziat?useSSL=false&useUnicode=yes&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	private String uid = "naziatapp";
	private String passwd = "naziatapp";

		public void selectRecord() {
			
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, uid, passwd);
				Statement stmt = con.createStatement();
				ResultSet result =  stmt.executeQuery("select * from abc");
				
				while(result.next()) {
					System.out.println("Id: " + result.getInt(1));
					System.out.println("name: " + result.getString(2));
					System.out.println("Address: " + result.getString(3));
					System.out.println("--------------------------------");
					
					con.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
		
	public boolean manupulateRecord(String query) {
		
			boolean flag = false;
			
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, uid, passwd);
				Statement stmt = con.createStatement();
				flag =  stmt.executeUpdate(query) > 0 ? true : false;
				
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			return flag;
			
		}
		
	
}
