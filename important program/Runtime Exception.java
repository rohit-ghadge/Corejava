package ppp;
import java.util.*;

class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	{
		super(msg);
	}
}

public class fun
{
	public static void main(String str[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age \n");
		int age=sc.nextInt();
		if(age>60)
		{
			throw new TooOldException("age must be less than 60");
		}
		else if(age<18)
		{
			throw new TooYoungException(" you are too young to marry ");
		}
		else
		{
			System.out.println(" welcome to shadi.com ");
		}
	}
}