package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class my_creation {
    
		public static String driver="com.mysql.cj.jdbc.Driver";
		public static String username="root";
		public static String password="Simha@123";
		public static String url="jdbc:mysql://localhost:3306/";
		public static Connection conn;
		public static PreparedStatement pmst;
		public static void main(String args[]) throws SQLException
		{
			Scanner sc=new Scanner(System.in);
			try {
				Class.forName(driver);
				
				conn = DriverManager.getConnection(url, username, password);
				System.out.println("enter database name");
				String sql="create database "+sc.next();
				pmst=conn.prepareStatement(sql);
				int i=pmst.executeUpdate();
				if(i>0)
				{
					System.out.println("database created");
				}
				else
				{
					System.out.println("error occured");
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
    	
    }

