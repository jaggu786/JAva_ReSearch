package oops.Inheritance;

class Person 
{
	   private String name;
	   private Person spouse = null;
	   public Person(String name) { 
		   
	      this.name = name;
	   }
	   public void setSpouse(Person spouse)
	   {
	      this.spouse = spouse;
	   }
	   public Person getSpouse() 
	   { return spouse; 
	   
	   }
	   public String getName() 
	   { return name; 
	   
	   }
	   
	}
class Employee extends Person 
{
	   private String position;
	   private double salary;
	   public Employee(String name) 
	   {
	      super(name);
	      salary = 0;
	      position = null;
	   }
	   public void setPosition(String position) 
	   {
	      this.position = position;
	   }
	   public String getName() 
	   {
	      return super.getName() + ": " + position;
	   }
	   public double getSalary() { return salary; }
	 
	   
	   public void setSalary(double amt) 
	   {
	      salary = amt;
	   } 
	   
	   
	}
class Generalization
{
	public static void main(String[] args) 
	{
		Employee e= new Employee(" jagadeesh");
       
        e.setPosition("TestEngineer");
        e.getName();
		e.setSalary(40000);
		e.getSalary();
		
	
		Object o = null;
		o.notify();
		 
		
		
		
	}
	
}