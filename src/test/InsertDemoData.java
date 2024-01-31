package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemoData {

	public static void main(String[] args) {
		try {
			String sql = "insert into user(lastName,firstName,Address,City,Salary)"
					+ "values('Shinde','Akshay','Janegaon','beed',70000)";
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp", "root", "root");
			// create statement
			Statement statement = connection.createStatement();
			// execute query
			statement.execute(sql);
			connection.close();
			statement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
