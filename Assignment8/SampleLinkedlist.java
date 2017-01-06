package collection.Assignment8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedlist {

	public void getLinkedList(){
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("hi");
		ll.add("hello");
		ll.add("bye");
		
		Iterator<String> itr= ll.iterator();
		while(itr.hasNext()){
			System.out.println("elements of 1st Linked list: "+itr.next());
		}
		
		
		LinkedList<String> ll2 =new LinkedList<String>();
		ll2.add("see u");
		ll2.addAll(ll);
	
		
		for(String str:ll2){
			System.out.println("elements of 2nd Linked list: "+str);
			
		}
		System.out.println("index of : "+ll2.indexOf("hi"));
		System.out.println(ll2.peek()); //returns the first element of list ,returns null if list is empty
		 System.out.println(ll2.peekFirst()); //returns the first element of list ,returns null if list is empty
		 System.out.println(ll2.peekLast());	//returns the Last element of list,returns null if list is empty
		
		System.out.println(ll2.pop()); // remove & return head element of list, throws exception if list is empty
		System.out.println(ll2.poll()); //remove and return head element of list, return null if list is empty
		ll2.push("one more");  // inserts the element at the front of this list.
		ll2.push("hiiii");
		System.out.println(ll2.peekFirst());

		 for(String str:ll2){
				System.out.println("elements of 2nd Linked list: "+str);
				
			}
		 
		
		
	}
	public static void main(String[] args) {
		SampleLinkedlist obj=new SampleLinkedlist();
		obj.getLinkedList();

	}

}
