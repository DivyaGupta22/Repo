package collection.Assignment8;

import java.util.LinkedHashSet;
import java.util.Set;

public class SampleLinkedHashSet {
	
	public void getLinkedHashset(){
	LinkedHashSet<String> lh=new LinkedHashSet<String>();
	lh.add("one");
	lh.add("1");
	lh.add("hii");
	lh.add("Divya");
	lh.add("neha");
	
	System.out.println("Size of LinkedHashSet: "+lh.size());
	for(String str:lh){
		System.out.println("elements: "+str +"  HashCode: "+ str.hashCode());
	}
	

	}
	public static void main(String[] args) {
		SampleLinkedHashSet obj=new SampleLinkedHashSet();
		obj.getLinkedHashset();
		// TODO Auto-generated method stub

	}

}
