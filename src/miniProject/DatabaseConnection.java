package miniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseConnection {
	static Connection con = null;

	public static Connection connectionCreate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create table PS(EmpName varchar(20),EmplastName varchar(20),age int,salary int);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp", "root", "root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
	public static void closeCon() {
		
		try {
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
