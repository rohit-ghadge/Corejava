package pp;
import java.util.*;
class Student implements Comparable<Student>
{
	String name;
	int rollNo;
	String department;

	public Student(String name, int rollNo, String department)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}

	@Override
	public int hashCode()
	{
		return rollNo;
	}

	@Override
	public boolean equals(Object obj)
	{
		Student student = (Student) obj;
		return (rollNo == student.rollNo);
	}

	@Override
	public String toString()
	{
		return rollNo+", "+name+", "+department;
	}

	@Override
	public int compareTo(Student str)
	{
		return this.name.compareTo(str.name);
	}
};
public class Ad 
{
		public static void main(String []args)
		{
			
			Set<Student> set = new HashSet<Student>();
			
			set.add(new Student("Avinash", 121, "Civil"));
			set.add(new Student("Rohit", 101, "Physics"));
			set.add(new Student("Rohit", 101, "Physics"));
			set.add(new Student("Baban", 151, "mechnical"));
			set.add(new Student("Chetan", 200, "Cs"));
			
			List<Student>student=new ArrayList<Student>(set);
			 	
			Collections.sort(student);
			for(Student x:student)
			{
				System.out.println(x);
			}
		}
		
}

