package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertion {
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
			String sql = "insert into ram1(id,name,age) values (?,?,?)";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter  id");
			pmst.setInt(1, sc.nextInt());
			System.out.println("Enter name");
			pmst.setString(2, sc.next());
			System.out.println("Enter age");
			pmst.setString(3, sc.next());
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("Inserted Successfully");
			}
			else {
				System.out.println("error occured");
			}
			sc.close();
			conn.close();
			pmst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
