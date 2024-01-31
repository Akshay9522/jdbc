package miniProject;

import java.util.Scanner;

public class SQLHome {
	static Operation operation;

	public static void main(String[] args) {
		boolean menu = true;
		while (menu) {
			System.out.println("Welcome To PS Control and Switch Gear");
			Scanner sc = new Scanner(System.in);
			System.out.println("press 1 for insert employee data \npress 2 for employee info \npress 3 for exit");
			String input = String.valueOf(sc.nextInt());
			operation = new Operation();
			switch (input) {
			case "1":
				operation.insertEmpDetails();
				break;
			case "2":
				operation.retriveEmpDetails();
				break;
			case "3":
				DatabaseConnection.closeCon();
				menu = false;
				break;

			}
			System.out.println("Thank You visit Again!!!!!");
			DatabaseConnection.closeCon();
		}

	}

}
