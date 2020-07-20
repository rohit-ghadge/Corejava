package ppp;
import java.util.*;
class Student 
{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	
	public String toString()
	{
		return rollno + " "+ name + " " + age;
	}
}
class RollComparator implements Comparator
{
  
	@Override
	public int compare(Object o1, Object o2) 
	{
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		return s1.name.compareTo(s2.name);  
	}
}  
public class m 
{
	
	public static void main(String []args)
	{
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al,new RollComparator());  
		for(Student st:al)
		{    
			System.out.println(st);
		}  
	}  
		 
	
}