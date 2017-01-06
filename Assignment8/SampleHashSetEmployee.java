package collection.Assignment8;

import java.util.HashSet;
import java.util.Set;

public class SampleHashSetEmployee {
 
	public void Test()
	{    SampleEmployee obj1=new SampleEmployee(11,"Geeta");
	SampleEmployee obj2=new SampleEmployee(12,"Meera");
	SampleEmployee obj3=new SampleEmployee(11,"Geeta");
	
		Set<SampleEmployee> se = new HashSet<SampleEmployee>();
		se.add(obj1);
		se.add(obj2);
		se.add(obj3);
		
		if (obj1.equals(obj3)){
			System.out.println("both are equal");
		}
		else{ System.out.println("both are not equal");
		}
		
		for(SampleEmployee str:se){
			System.out.println("Employee ID: "+str.empID+" Name: "+str.name +" HashCode: "+str.hashCode());
		}
		
		
	}
	public static void main(String[] args) {
		SampleHashSetEmployee obb=new SampleHashSetEmployee();
		obb.Test();

	}

}
