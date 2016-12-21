package com.divya.oracle;

public class Training {
	
 Number courseId;
  String recording;
  String courseContent;
 
public  Training(){
	courseId =101;
		}


public void courseContent() {
	courseContent="Java,Python,JS,CSS,Anugular JS,Relly,SOAP UI,Testing Fundamental,MongoDB,SDLC";
	System.out.println("For course ID:"+ courseId +" These are  training  courses content: "+courseContent);
}
public void Recording() {
	recording = "Java_Medha.wmv,Python.Medha.wmv,JS.Kumer.wmv,CSS.Kumar.wmv,Anugular JS_Kumar.wmv,Relly_Medha.wmv,SOAP UI_Medha.wmv,Testing Fundamental_Medha.wmv,MongoDB_Kumar.wmv,SDLC_Medha.wmv";
		System.out.println("For course ID:"+ courseId +" These are  training Recordings: "+recording );
}
 





}
