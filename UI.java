package com.divya.oracle;

public class UI extends Training {
	
	 String courseType;
	
	public UI  ()
	{ super ();
	courseType = "UI"; 
	
	}
	
	@Overriding 
	public void courseContent(){
		courseContent= "Java,JS,CSS,Anugular JS,MongoDB";
		System.out.println("For course ID:"+ courseId +" and Course type : "+courseType +" These are QA Course  Contents: "+courseContent );
	}
	
	@Overriding
	public void Recording(){
		recording= "Java_Medha.wmv,JS.Kumer.wmv,CSS.Kumar.wmv,Anugular JS_Kumar.wmv,MongoDB_Kumar.wmv";
		System.out.println("For course ID:"+ courseId +" and Course type : "+courseType +" These are  QA  Recordings: "+recording );
	}
}
