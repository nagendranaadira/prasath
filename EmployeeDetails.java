package org.string;

public class EmployeeDetails {
	public EmployeeDetails() {
		System.out.println("Employee Name is prasath");
		
	}
public EmployeeDetails(int empid) {
	System.out.println("Employee id is:"+empid);
	
}
public EmployeeDetails(String empname) {
	System.out.println("Employee name is:"+empname);
}
public static void main(String[] args) {
	EmployeeDetails e=new EmployeeDetails();
}
}
