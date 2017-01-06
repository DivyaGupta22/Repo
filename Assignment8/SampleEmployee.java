package collection.Assignment8;

public class SampleEmployee {
	 int empID;
	String  name;
	
SampleEmployee(int empID,String name){
	this.empID=empID;
	this.name=name;	
}

public int hashCode(){
	return  empID*2;
	
}



public boolean equals(Object ob){
	boolean isEqual=false;
	if(ob instanceof SampleEmployee && ((SampleEmployee)ob).empID==this.empID && ((SampleEmployee)ob).name==this.name){
		isEqual=true;
		
	}
	return isEqual;
	
}

}
