package miniProject;

import java.util.Scanner;

public class Data {
	private String Name;
	private String LastName;
	private int sal;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	void insertData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee first Name");
		setName(sc.next());
		System.out.println("Enter Employee last Name");
		setLastName(sc.next());
		System.out.println("Enter salary of "+Name +" " +LastName);
		setSal(sc.nextInt());
		System.out.println("Enter age of "+Name +" " +LastName);
		setAge(sc.nextInt());
	}
	void getInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee first Name");
		setName(sc.next());
	}
}
