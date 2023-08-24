package org.string;

public class Employ {
	public static void main(String[] args) {
		 Employee e=new  Employee();
		 //set
		 e.setEmpId(101);
		 e.setEmpName("prasath");
		 e.setEmpId1("prasath@gmail.com");
		 //get 
		 int empId = e.getEmpId();
		 System.out.println(empId);
		 String empName = e.getEmpName();
		 System.out.println(empName);
		 int emailId = e.getEmailId();
		 System.out.println(emailId);
	}
        

}

