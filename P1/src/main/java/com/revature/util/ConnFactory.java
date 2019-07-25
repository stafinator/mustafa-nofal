package com.revature.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	//singleton factory
		private static ConnFactory cf = new ConnFactory();
		//constructor
		private ConnFactory() {
			super();
		}
		public static synchronized ConnFactory getInstance() {
			if (cf == null) {
				cf = new ConnFactory();
			}
			return cf;
		}
		public Connection getConnection() {
			Connection conn = null;
			Properties prop = new Properties();
			
			
			
			try(InputStream is=this.getClass().getResourceAsStream("/database.properties"))
			{
				prop.load(is);
				
				
				Class.forName(prop.getProperty("driver"));
				conn = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"), prop.getProperty("password"));
				
				
				
				
				System.out.println("validated");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("file not found");
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("file not found");

				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("sql exception not connected");
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("class not found not connected");
				e.printStackTrace();
			}
			
			return conn;
		}
}
