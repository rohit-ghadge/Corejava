package m;

final class Student
{
	 final int rollnumber;
	
	public Student(int rollnumber)
	{
		this.rollnumber=rollnumber;
	}
	public Student modify(int rollnumber)
	{
		if(this.rollnumber==rollnumber)
		{
			return this;
		}
		else
		{
			return new Student(rollnumber);
	    }
	}
  
}
class Test
 {
	 public static void main(String sx[])
	 {
          Student s1 =new Student(10);
          Student s2=s1.modify(100);        
          Student s3 =s1.modify(10);
          
          System.out.println(s1==s2);
          System.out.println(s1==s3);

     } 
}
----------------------------------------------------------------------------------------------------------------------
