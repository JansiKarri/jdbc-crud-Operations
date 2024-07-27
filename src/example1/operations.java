////package example1;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.util.Scanner;
//
//public class operations {
//	public static final String Driver = "com.mysql.cj.jdbc.Driver";
//	public static final String Username = "root";
//	public static final String Password = "Simha@123";
//	public static Connection conn;
//	public static PreparedStatement pmst;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int ch;
//		do {
//			display();
//			System.out.println("Enter choice");
//			ch = Integer.parseInt(sc.nextLine());
//
//			switch (ch) {
//			case 1:
//				createdatabase();
//				break;
//			case 2:
//				createtable();
//				break;
//			case 3:
//				insertion();
//				break;
//			case 4:
//				deletion();
//				break;
//			case 5:
//				getall();
//				break;
//			case 6:
//				getbyid();
//				break;
//			case 7:
//				droptable();
//				break;
//			case 8:
//				dropdatabase();
//				break;
//			case 9:
//				System.exit(0);
//				break;
//			default:
//				System.out.println("Invalid Choice");
//			}
//
//		} while (ch > 0);
//	}
//
//	private static void dropdatabase() {
//		String url = "jdbc:mysql://localhost:3306/";
//		Scanner sc = new Scanner(System.in);
//		try {
//			Class.forName(Driver);
//			conn = DriverManager.getConnection(url, Username, Password);
//			System.out.println("Enter Database Name");
//			String sql ="drop database "+sc.next();
//			pmst = conn.prepareStatement(sql);
//			int i = pmst.executeUpdate();
//			if(i==0) {
//				System.out.println("database dropped");
//			}
//			else {
//				System.out.println("Error");
//			}
//	//	pmst.close();
//	//sc.close();
//		//conn.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//	}
//
//	private static void droptable() {
//		System.out.println("jhkfd");
//
//	}
//
//	private static void getbyid() {
//		
//		
//		 String Url = "jdbc:mysql://localhost:3306/ram";
//			//public static Connection conn;
//			//public static PreparedStatement pmst;
//			//public static void main(String[] args) {
//				Scanner sc = new Scanner(System.in);
//				try {
//					Class.forName(Driver);
//					conn = DriverManager.getConnection(Url,Username,Password);
//					
//					String sql = "select * from ram1 where age = ?";
//					pmst = conn.prepareStatement(sql);
//					System.out.println("Enter age");
//					pmst.setInt(1, sc.nextInt());
//					ResultSet rs = pmst.executeQuery();
//					while (rs.next()) {
//					System.out.println("id is:"+ rs.getInt("id")+","+
//							"name is:"+rs.getString("name")+","+
//							"age is:"+rs.getInt("age"));
//					}
//					pmst.close();
//					sc.close();
//					conn.close();       
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//
//		}
//
//
//	}
//
//	private static void getall() {
//		System.out.println("jhkw");
//
//	}
//
//	private static void deletion() {
//		System.out.println("jhkq");
//
//	}
//
//	private static void insertion() {
//		System.out.println("jhkkl");
//	}
//
//	private static void createtable() {
//		System.out.println("jhkdf");
//
//	}
//
//	private static void createdatabase() {
//		String url = "jdbc:mysql://localhost:3306/";
//		Scanner sc = new Scanner(System.in);
//		try {
//			Class.forName(Driver);
//			conn = DriverManager.getConnection(url, Username, Password);
//			System.out.println("Enter Database Name");
//			String sql ="create database "+sc.next();
//			pmst = conn.prepareStatement(sql);
//			int i = pmst.executeUpdate();
//			if(i>0) {
//				System.out.println("database created");
//			}
//			else {
//				System.out.println("Error");
//			}
////			pmst.close();
////			sc.close();
////			conn.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	private static void display() {
//		System.out.println("Operations");
//		System.out.println("\t1 .create database");
//		System.out.println("\t2 .create table");
//		System.out.println("\t3 .insertion of data");
//		System.out.println("\t4 .deletion of data");
//		System.out.println("\t5 .fetch all records");
//		System.out.println("\t6 .get record by id");
//		System.out.println("\t7 .deletion of table");
//		System.out.println("\t8 .deletion of database");
//		System.out.println("\t9 .Terminate process");
//
//	}
//
//}

package example1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class operations {

	public static final String Driver = "com.mysql.cj.jdbc.Driver";
	public static final String Username = "root";
	public static final String Password = "Simha@123";
	public static Connection conn;
	public static PreparedStatement pmst;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			display();
			System.out.println("Enter choice");
			ch = Integer.parseInt(sc.nextLine());

			switch (ch) {
			case 1:
				createdatabase();
				break;
			case 2:
				createtable();
				break;
			case 3:
				insertion();
				break;
			case 4:
				deletion();
				break;
			case 5:
				getall();
				break;
			case 6:
				getbyid();
				break;
			case 7:
				droptable();
				break;
			case 8:
				dropdatabase();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}

		} while (ch > 0);
	}

	private static void dropdatabase() {
		String url = "jdbc:mysql://localhost:3306/";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Database Name");
			String sql ="drop database "+sc.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i==0) {
				System.out.println("database dropped");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	

	private static void droptable() {
		String url = "jdbc:mysql://localhost:3306/ram";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Table Name");
			String sql ="drop table "+sc.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i==0) {
				System.out.println("table dropped");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	
	private static void getbyid() {
		String url = "jdbc:mysql://localhost:3306/ram";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Table Name"); //java
			String sql ="select * from "+sc.next()+" where id=?";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter  id");
			pmst.setInt(1, sc.nextInt());
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
			System.out.println("id: "+ rs.getInt("id")+ 
					" name: "+rs.getString("name")+
					" age: "+rs.getString("email"));
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void getall() {
		String url = "jdbc:mysql://localhost:3306/ram";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Table Name"); //java
			String sql ="select * from "+sc.next();
			pmst = conn.prepareStatement(sql);
			
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
			System.out.println("id: "+ rs.getInt("id")+ 
					" name: "+rs.getString("name")+
					" age: "+rs.getString("email"));
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void deletion() {
		String url = "jdbc:mysql://localhost:3306/ram";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Table Name"); //jaffa
			String sql ="delete from "+sc.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("table deleted");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	private static void insertion() {
		String url = "jdbc:mysql://localhost:3306/ram";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Table Name"); //java
			String sql ="insert into "+sc.next()+" values(?,?,?)";
			pmst = conn.prepareStatement(sql);
			System.out.println("Enter  id");
			pmst.setInt(1, sc.nextInt());
			System.out.println("Enter  name");
			pmst.setString(2, sc.next());
			System.out.println("Enter email");
			pmst.setString(3, sc.next());
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("data inserted in ");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	private static void createtable() {
		String url = "jdbc:mysql://localhost:3306/ram";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Table Name");
			String sql ="create table "+sc.next()+"(id int,name varchar(20),salary varchar(20))";
			pmst = conn.prepareStatement(sql);
			
			int i = pmst.executeUpdate();
			if(i==0) {
				System.out.println("table created");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createdatabase() {
		String url = "jdbc:mysql://localhost:3306/";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, Username, Password);
			System.out.println("Enter Database Name");
			String sql ="create database "+sc.next();
			pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("database created");
			}
			else {
				System.out.println("Error");
			}
//			pmst.close();
//			sc.close();
//			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void display() {
		System.out.println("Operations");
		System.out.println("\t1 .create database");
		System.out.println("\t2 .create table");
		System.out.println("\t3 .insertion of data");
		System.out.println("\t4 .deletion of data");
		System.out.println("\t5 .fetch all records");
		System.out.println("\t6 .get record by id");
		System.out.println("\t7 .deletion of table");
		System.out.println("\t8 .deletion of database");
		System.out.println("\t9 .Terminate process");


}

}
