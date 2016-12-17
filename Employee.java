package com.divya.oracle;

public class Employee {
public String Name ;
public Number Empno;
public String Designation;
public Number Salary;

public Employee() { 
	System.out.println("This is the  employee's details");
}

public Employee(String empname) {
	Name= empname;	
	
}
public void setDesign(String empdesign){
	Designation=empdesign;
}

public void setSalary(Number empsalary){
	Salary=empsalary;
}
public void displayEmp(){
	System.out.println("Name :" +Name);
	System.out.println("Employee No. :"+Empno);
	System.out.println("Designation :"+Designation);
	System.out.println("Salary:"+Salary);
	
}
}
