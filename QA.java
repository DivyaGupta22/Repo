package com.divya.oracle;

public class QA extends Training{
	
	 String courseType;
	
	public QA ()
	{ super ();
	courseType = "QA"; 
	
	}
	
	@Overriding 
	public void courseContent(){
		courseContent= "Java,Python,Relly,SOAP UI,Testing Fundamental,SDLC" ;
		System.out.println("For course ID:"+ courseId +" and Course type : "+courseType +" These are QA Course  Contents: "+courseContent );
	}
	
	@Overriding
	public void Recording(){
		recording= "Java_Medha.wmv,Python.Medha.wmv,Relly_Medha.wmv,SOAP UI_Medha.wmv,Testing Fundamental_Medha.wmv,SDLC_Medha.wmv";
		System.out.println("For course ID:"+ courseId +" and Course type : "+courseType +" These are  QA  Recordings: "+recording );
	}
	

	
}
