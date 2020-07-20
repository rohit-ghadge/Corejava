final, finally and finalize in Java
----------------------------------------------------------------------------------------------------------------------
final keyword in java:-

  - The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final  		can be:

    1:-variable
    2:-method
    3:-class
----------------------------------------------------------------------------------------------------------------------
1:-final variable:-
	:-final variables are nothing but constants. We cannot change the value of a final variable once it is   	  		 initialized.
     :-it shoud be initilisied at the time of the declare.
	: A final variable that is not initialized at the time of declaration is known as blank final variable.
	:-It can be initialized only in constructor.

2:-final methods:-
	:-A final method cannot be overridden.

3:-final class- 
     :-We cannot extend a final class.
----------------------------------------------------------------------------------------------------------------------
Q-:Can we declare a constructor final?
	 - No, because constructor is never inherited.
----------------------------------------------------------------------------------------------------------------------
Q-: when we use final and static combinaly:-

    final indicates that the value of the variable won't change - in other words, a variable whose value can't be    	 modified after it is declared.

    Use public final static String when you want to create a String that:

    belongs to the class (static: no instance necessary to use it), and that
    won't change (final), for instance when you want to define a String constant that will be available to all   	  	 instances of the class, and to other objects using the class.

		package saturday;

		 class student
		{
			public  static String MY_CONSTANT = "SomeValue";
			public String str1;
		}
		public class project1 
		{
		   public static void main(String str[])
		   {
			   student s1=new student();
			   student s2=new student();
				s1.MY_CONSTANT="rohit";
			   s1.str1="Ram";
			   System.out.println("value is " + student.MY_CONSTANT); 	
			   System.out.println("value is " + s2.str1);
			   System.out.println("value is " + s2.MY_CONSTANT);


		   }
		}

-----------------------------------------------------------------------------------------------------------------------

finaly:-
      -it is reserved keyword in java.
	 -The finally keyword is used in association with a try/catch block 
	  -guarantees that a section of code inside the finaly block is executed in both the condition if exception is 
		handled or not handled.
----------------------------------------------------------------------------------------------------------------------   finalize method :-
               -it is the non-final method of the object class.
			-finalize() is called before Garbage collector.
			-its last chance for any object to perform cleanup activity.
			-releasing any system resources held, closing connection if open etc.

	The task of garbage collector thread is to sweep out abandoned objects from the heap memory.
 	Abandoned objects or dead objects are those objects which does not have live references. 
	Garbage collector thread before sweeping out an abandoned object, it calls finalize() method of that object.
	 After finalize() method is executed, object is destroyed from the memory.
	 That means clean up operations which you have kept in the finalize() method are executed before an object is
 	destroyed from the memory.
----------------------------------------------------------------------------------------------------------------------
class Student
{
	int Rollnumber;
	String name;
	public Student(int Rollnumber, String name)
	{
		this.Rollnumber=Rollnumber;
		this.name=name;
	}
	void fun()
	{
		System.out.println(this.Rollnumber+" "+this.name);
	}
	@Override
	public void finalize() throws Throwable
	{
		System.out.println("inside the finlize method");
	}
}
class practice 
{ 
	public static void main(String ss[])
	{
		Student s =new Student(100,"Rohit");
		s.fun();
		//s=null;     //s now point to null 
        System.gc();
	}
} 
-------------------------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------------------------
