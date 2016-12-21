package com.divya.oracle;

public class CountObj {
	public static int count=0;
	
	CountObj(){ 
	 count++;	
	}
	
	public static int getObjectCount(){
		return count;
	}
	
	
	
}


