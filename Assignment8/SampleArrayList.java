package collection.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class SampleArrayList {

	public void getArrayList(){
		List<String> al=new ArrayList<String>();
		al.add("one");
		al.add("Two");
		al.add("Three");
		al.add(1,"abc");
		al.add("one");
		al.add(null);
		al.add(3, null);
		al.remove(1);
		al.remove(null);
		al.remove("one");
	System.out.println(al.isEmpty());
	System.out.println(al.contains("one"));
	
	List<String> al2=new ArrayList<String>();
	al2.add("cat");
	al2.add("Dog");
	al2.add("Three");
	
	al.addAll(al2);
	
	al2.addAll(1,al);
	
			
		for(int i=0;i<al.size();i++){
			System.out.println("1st Array List having:  "+ al.get(i));
		}
		
		System.out.println("--------------");
		
	 for(String str:al2){
		 
		 System.out.println("2nd Array List having: "+ str);
	 }
		
	}
	public static void main(String[] args) {
		SampleArrayList obj=new SampleArrayList();
		obj.getArrayList();
 
	}

}
