package serialisation;

import java.io.Serializable;

public class Student implements Serializable {
	//int age ;
	//transient int age;
	static int age;
	String name;
	 public Student(int age, String name) {  
		  this.age = age;  
		  this.name = name;  
		 }  
	 
	
	

}
