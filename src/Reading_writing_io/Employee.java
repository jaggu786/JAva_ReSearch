package Reading_writing_io;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;


public class Employee implements Serializable  
{

  
 // the process of   storing 	 object contents into a file is called 
// serialization: is writing process,it  should implement serializable interface
		
// instance variables 
private int id;
private String name;
private float  sal;
private Date doj;
public Employee(int id, String name, float sal, Date doj) 
{
	
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.doj = doj;
}

void display()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(sal);
	System.out.println(doj);
	
	
}
static Employee getdata()
{
Scanner sc =new Scanner(System.in);
System.out.println(" Enter EmpId :");
int id= sc.nextInt();
System.out.println("enter name ");
String name=sc.next();
System.out.println(" enter salary");
Float sal=sc.nextFloat();
Date d= new  Date();
Employee e = new Employee(id, name, sal, d);
return e;



	
	
	
	
	
}


	  
	  
	  
		
		
		
		
		
		

}


