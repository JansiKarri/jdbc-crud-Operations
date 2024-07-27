package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletion {
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
			conn = DriverManager.getConnection(Url, Username, Password);
			String sql = "delete from ram1 where id = ?";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter 1id");
			pmst.setInt(1, sc.nextInt());
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("error");
			}
			sc.close();
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
