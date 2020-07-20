Object class in Java :-

     -The Object class is the parent class of all the classes in java by default. In other words, it is the topmost    		 class of java.
	-Total 11 methods in the object class.(6 final and 5 non-final).
-----------------------------------------------------------------------------------------------------------------------
     Final methos(6):-
  		    -six final method in object class.among them 5 are used in multithreding to achive concurancy feature 
  			of the oopes. 
		    -application code dealing with multiple threads accessing one/more shared resources at any given time
		    -their are 5 methos wait(3) and notify and notify all.
			-this methods must be use in under the synchronised block.or it will throw exception.

              1:-wait methods(3):-
			-It tells the calling thread to give up the lock and go to sleep until some other thread enters the 			 same monitor and calls notify().

		    4:notify mthod:-
			-It wakes up one single thread that called wait() on the same object.
		
		    5:-notify all method:-
			-it wakes up all the threads that called wait() on the same object. The highest priority thread will 				 run first in most of the situation.

		    6:-	getClass() - Returns the runtime class of an object.
		
		   
-----------------------------------------------------------------------------------------------------------------------
       N0n-Final methos:-(5 method):-
			1:-public String toString() - Returns a string representation of the object.
                
 			2:-protected void finalize method :-
			-finalize() is called before Garbage collector.
			-its last chance for any object to perform cleanup activity.
			-releasing any system resources held, closing connection if open etc.

			3:-public int	hashCode() - Return type is int for every object hashcode is diffrant.
			
			4:-public boolean	equals() - Indicates whether some other object is "equal to" this one.

				ex:-public static void main(String[] args) 
				{
					String str1 = new String("Rohit");
					String str2 = new String("Rohit");

					if (str1.equals(str2))
					{ 
					System.out.println("Equal "); 
					} 
					else 
					{ 
					System.out.println("Not Equal "); 
					} 
				}
			5:- protected Object clone method:-

      		 		cloneList = StudentList.clone();

				:-The most effective and efficient way of copying objects.
----------------------------------------------------------------------------------------------------------------------
