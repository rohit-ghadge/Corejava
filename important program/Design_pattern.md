### singleton design pattern:-


* The singleton pattern is used to limit creation of a class to only one object.
  This is beneficial when one (and only one) object is needed to coordinate actions across the system. 
  There are several examples of where only a single instance of a class should exist,
  including caches, thread pools, and registrie
--------------------------------------------------------------------------------------------------------------------
class Student
{
	public static Student s; // inside static only static we use
	int a=100;
	private Student(){} //so we cant create object of the class.
	
	public static Student getInstance() // we cant create object so by using class name we call method.
	{
		if(s==null)
		{
             s=new Student();
		}
        return s;
		
	}
}
class Test
{
	public static void main(String shh[])
	{
		  Student obj1=Student.getInstance(); //both are pointing so same object.
		  Student obj2=Student.getInstance();
		  System.out.println(obj1.a+" "+obj2.a);
	}
}
-----------------------------------------------------------------------------------------------------------------------
### Factory Design Pattern :-

 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to
  return one of the sub-class object. This pattern take out the responsibility of instantiation of a class from client
  program to the factory class.

* user decide at runtime which type of object he want.

* For example, you have 2 different Databases in your application. Say MySQL and Oracle and you want to work with
  both but you would decide at runtime which database you want to work with. In this scenario, you go with a Factory
  Pattern by providing the name of the database you want to work with, as an input parameter. 
----------------------------------------------------------------------------------------------------------------------
package m;

 abstract class Vehicle 
 {
   public abstract int getWheel();
  
   public String toString() 
   {
     return "Wheel: " + this.getWheel();
   }
 }

class Car extends Vehicle 
{
  int wheel;
  
  Car(int wheel)
  {
    this.wheel = wheel;
  }

  @Override
  public int getWheel() 
  {
    return this.wheel;
  }
}

class Bike extends Vehicle 
{
  int wheel;
  
  Bike(int wheel)
  {
    this.wheel = wheel;
  }
  
  @Override
  public int getWheel() 
  {
    return this.wheel;
  }
}

class VehicleFactory 
{
  public static Vehicle getInstance(String type, int wheel) 
  {
    if(type == "car") 
    {
      return new Car(wheel);
    } else if(type == "bike")
    {
      return new Bike(wheel);
    }
    
    return null;
  }
}

public class Test 
{

  public static void main(String[] args) 
  {
    Vehicle car = VehicleFactory.getInstance("car", 4);
    System.out.println(car);
    
    Vehicle bike = VehicleFactory.getInstance("bike", 2);
    System.out.println(bike);
  }

}

----------------------------------------------------------------------------------------------------------------------
###-

