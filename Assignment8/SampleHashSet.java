package collection.Assignment8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SampleHashSet {
 
	public void getHashset(){
		Set<String> se = new HashSet<String>();
		se.add("hi");
		se.add("1");
		se.add("one");
		se.add("2");
		se.add("3");
		se.add("Three");
		se.add("1");
		se.add(null);
		
		
		System.out.println("Size of Hashset: "+se.size());

		Iterator<String> itr =se.iterator();
				while(itr.hasNext()){
					System.out.println("elements in Hash set: "+itr.next());
				}
		
	}

	public static void main(String[] args) {
		SampleHashSet obj=new SampleHashSet();
		obj.getHashset();

	}

}
