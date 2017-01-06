package collection.Assignment8;

import java.util.List;
import java.util.Vector;

public class Samplevector {
	
	public void getVector(){
	Vector<String> ve= new Vector<String>(3,2);   //by default capacity is 10 and increase  by getting double
	System.out.println("Size of vector: "+ ve.size());
	System.out.println("capecity of Vector: "+ve.capacity());
	
	
	ve.add("one");
	ve.add("two");

	
	
	
	
	
	ve.add("four");
	System.out.println("Size of vector: "+ ve.size());
	System.out.println("capecity of Vector: "+ve.capacity());
	
	System.out.println("clone of vector: "+ve.clone());
	
	
	
	for(String str:ve){
		System.out.println("elements in vector: "+str);
	}
	
	}
	
	

		

	public static void main(String[] args) {
		Samplevector obj=new Samplevector();
		obj.getVector();

	}

}
