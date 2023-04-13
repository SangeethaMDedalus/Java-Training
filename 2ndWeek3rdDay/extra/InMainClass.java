package com.extra;


class Employee {
	int empid;
	String empName = "Arun";
	final String dept ="IT";

	//public Employee(int id) {
		//this("Welcome");
		//System.out.println("Employee Class");
		//System.out.println(id);
	//}
	public Employee(String str) {
		System.out.println("Employee Class OverLoading");
		System.out.println(str);
	}
	public Employee(int empid) {
		this("Welcome");
		this.empid=empid;
		System.out.println("From Emp Constr" + empid);
	}
	public String getDetails() {
		return empid+ " -- " + empName;
	}
	
}

class Manager extends Employee {
	String dept ="IT";
	public Manager() {
		super(5); // Used to invoke the base class constructor
		System.out.println("Manager Class");
		System.out.println(empid + "**" + empName);
	}
	public String getDetails() {  // Overridding
		return super.getDetails()+ "--" + dept;
	}
	

}

class Salary {

}

public class InMainClass {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		//instance of
	}
}