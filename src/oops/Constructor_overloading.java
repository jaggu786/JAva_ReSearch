package oops;

public class Constructor_overloading
{
	public static void main(String[] args)
{
 	
		
		
// System.out.println(" ......default constructor ..... ");
		
	
System.out.println("  assign default values to all objects ");
System.out.println(" tester skills ");
 
System.out.println(".......................");
Software tester =new Software(); 

tester.interview_skills();
System.out.println(" java developer  skills ");
System.out.println(".......................");


Software javadeveloper= new Software();
javadeveloper.interview_skills();

System.out.println(" ....................");
System.out.println(" by using parametrized constructor ");
System.out.println(" we can assign values to each object ");
 
Software tester1 =new Software(" manual","appium"); 
tester1.interview_skills();

Software javadeveloper1= new Software("microservices","jsp");
javadeveloper1.interview_skills();
 
		
}
	
		 
	
		
		
		
		
		
		
		
	   	
		 
		
		
		    

}

