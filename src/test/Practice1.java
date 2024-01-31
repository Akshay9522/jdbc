package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Practice1 {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp", "root", "root");
			//Create Statement 
			Statement stmt = con.createStatement();
			//Execute qure
			ResultSet rst = stmt.executeQuery("select * from employee");
			while(rst.next()) {
				System.out.println("Id  "+rst.getInt(1));
				System.out.println("name  "+rst.getString(2));
				System.out.println("pswd  "+rst.getString(3));

			}
			con.close();
			stmt.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
