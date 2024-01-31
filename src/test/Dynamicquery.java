package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Dynamicquery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp", "root", "root");
			PreparedStatement stmt = con.prepareStatement("insert into employee(username,password)values(?,?)");
			stmt.setString(1, "Admin");
			stmt.setString(2, "Admin");
			stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();		}
	}

}
