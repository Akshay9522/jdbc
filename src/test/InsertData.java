package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertData {

	public static void main(String[] args) {
		try {
			String sql = "insert into user(lastName,firstName,Address,City,Salary)"
					+ "values('Doiphode','ram','It','beed',70000)";
					// load the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// establish the connection 
					Connection con =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp",               
					"root", "root");
					// create the sql statement
					Statement statement = con.createStatement();
					// submit the sql statement to database..
					//statement.executeUpdate(sql);
					statement.execute(sql);
					System.out.println("Insertion successfully...");
					// close the resources. 
					con.close(); 
					statement.close();

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
