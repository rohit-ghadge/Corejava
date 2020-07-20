### 1. Fibonacci series
------------------------------------------------------------------------------------------------------------------------
System.out.println("how many number do you want to print");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
-----------------------------------------------------------------------------------------------------------------------
### 2

. A prime number:-
do {
			System.out.println("Enter the number");
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			int count=0;
			for(int i=1;i<number;i++)
			{
				if(number%i==0)
				{
					count++;
				}
			}	
			System.out.println(count);
	
			if(count>2)
			{
				System.out.println("number is Not a prime number");
			}
			else
			{
				System.out.println("number is a prime number");
			}
			System.out.println("press 1 for repeat");
         
		}
		while(true);
-----------------------------------------------------------------------------------------------------------------------
### Palindrome:-(String)

		String str="nitin";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("string is Palindrome");
		}
		else
		{
			System.out.println("String is NOT a palindrome");
			
		}
----------------------------------------------------------------------------------------------------------------------
### Palindrome(number):-

          int number=123;
		int Rem,Rev=0;
		while(number>0)
		{
			Rem=number%10;        //  Rem=3   Rev=3       number=12
			Rev=(Rev*10)+Rem;     //  Rem=2   Rev=30+2=32 number=1
			number=number/10;     //  Rem=0   Rev=320+1   number=0
		}
		System.out.println(Rev);
----------------------------------------------------------------------------------------------------------------------
### Armstring number:-

		int number=153;
		int Rem,Rev=0;
		while(number>0)
		{
			Rem=number%10;        
			Rev=(Rem*Rem*Rem)+Rev;    
			number=number/10;     
		}
		System.out.println(Rev);
-----------------------------------------------------------------------------------------------------------------------
### factorial number :-
		int fact=1;
		for(int i=1;i<=6;i++)
		{
			fact=i*fact;
			System.out.println(fact);
		}
-----------------------------------------------------------------------------------------------------------------------
### Remove duplicates from an array:-
        
		int arr[]= {11,12,11,13};
		int j;
		for(int i=0;i<arr.length;i++)
		{
			for( j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(arr[i]);
			}
		}
-----------------------------------------------------------------------------------------------------------------------
### print the duplicate elements of the array :-

       int arr[]= {11,12,11,13};
		int j;
		for(int i=0;i<arr.length;i++)
		{
			for( j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
		}
---------------------------------------------------------------------------------------------------------------------
### 
