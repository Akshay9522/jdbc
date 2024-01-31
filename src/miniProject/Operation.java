package miniProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Operation {
	private String query;
	Data data;
	void insertEmpDetails() {
		boolean flag = true;
		Connection con=DatabaseConnection.connectionCreate();
		data = new Data();
		while(flag) {
			data.insertData();
			query = "insert into PS(EmpName,EmplastName,age,salary)values(?,?,?,?)";
			try {
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, data.getName());
				pstmt.setString(2, data.getLastName());
				pstmt.setInt(3, data.getAge());
				pstmt.setInt(4, data.getSal());
				pstmt.execute(); 
				pstmt.close();
				Scanner sc = new Scanner(System.in);
				System.out.println("Do you want to Enter more Employee data please type Y/N");
				String input = sc.next();
				if(input.equalsIgnoreCase("Y")) {
					flag=true;
				}
				else if(input.equalsIgnoreCase("N")) {
					flag=false;
				}else {
					System.out.println("Wrong input entered");
				}
					

			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}		
		
	}
	void retriveEmpDetails() {
		Connection con=DatabaseConnection.connectionCreate();
		data = new Data();
		boolean flag = true;
		while(flag) {
		data.getInfo();
		query = "select * from PS where EmpName = ? ";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, data.getName());
			ResultSet rst = pstmt.executeQuery();
			while(rst.next()) {
				System.out.println("employee Name: "+rst.getString(1));
				System.out.println("Last Name: "+rst.getString(2));
				System.out.println("employee Salary: "+rst.getInt(4));

			}
			pstmt.close();
			Scanner sc = new Scanner(System.in);
			System.out.println("Do you want to  more Employee details please type Y/N");
			String input = sc.next();
			if(input.equalsIgnoreCase("Y")) {
				flag=true;
			}
			else if(input.equalsIgnoreCase("N")) {
				flag=false;
			}else {
				System.out.println("Wrong input entered");
			}
				

		} catch (SQLException e) {
			e.printStackTrace();
		}		
			
		}
		
	}
}
