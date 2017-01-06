package collection.Assignment8;


import java.util.Set;
import java.util.TreeSet;

public class SampletreeSet {
	public void getTreeSet(){
		
		Set<String> ts=new TreeSet<String>();
		ts.add("Divya");
		ts.add("Rohit");
		ts.add("Neha");
		ts.add("Anamika");
		ts.add("Mala");
		//ts.add(null);  Tree can't take null value
		
		
		for(String str:ts){
			System.out.println(str);
		}
		
		
		
	}

	public static void main(String[] args) {
		SampletreeSet obj=new SampletreeSet();
		obj.getTreeSet();
 
	}

}
