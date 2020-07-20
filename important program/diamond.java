package ppp;
//      *
//    *   *
import java.util.*;

public class m 
{
	public static void main(String []args)
	{
		System.out.println("Enter the number");
		Scanner sc=new  Scanner(System.in);
		int Lines=sc.nextInt();
		int mid=(Lines+1)/2;
		for(int urow=1;urow<=mid;urow++)//upper row
		{
			for(int space=urow;space<=(mid-1);space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=(urow*2-1);star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int lrow=1;lrow<=mid-1;lrow++)
		{
			for(int space=1;space<=lrow;space++)
			{
				System.out.printf(" ");
			}
			for(int star=1; star<=2*(mid-lrow)-1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
