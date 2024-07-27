package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class getall {
	public static final String Driver = "com.mysql.cj.jdbc.Driver";
	public static final String Username = "root";
	public static final String Password = "Simha@123";
	public static final String Url = "jdbc:mysql://localhost:3306/ram";
	public static Connection conn;
	public static PreparedStatement pmst;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url,Username,Password);
			System.out.println("Enter table name");
			String sql = "select * from "+sc.next();
			pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
			System.out.println("id is:"+ rs.getInt("id")+", "+ 
					"name is:"+rs.getString("name")+" ,"+
					"age is:"+rs.getInt("age"));
			}
			pmst.close();
			sc.close();
			conn.close();       

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

