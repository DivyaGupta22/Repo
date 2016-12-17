package com.divya.oracle;

public class EmployeeData {

	public static void main(String args[]){
		Employee obj1 = new Employee() ;
		obj1.Name="Divya";
		obj1.Empno=11;
		obj1.setDesign("IT");
		obj1.setSalary(60000);
	    obj1.displayEmp();
	    
	    Employee obj2 = new Employee("Gungun");
	    obj2.Empno=12;
	    obj2.Designation="HR";
	    obj2.Salary=65000;
	    obj2.displayEmp();
	    
	    Employee obj3=new Employee("Rohit");
	    obj3.Empno=13;
	    obj3.setDesign("Mgr");
	    obj3.setSalary(80000);
	    obj3.displayEmp();
	    }

}
