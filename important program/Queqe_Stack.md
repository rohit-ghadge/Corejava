### Queqe:-

* FIFO (First In First Out);

* Queue interface in Java collections has two implementation: LinkedList and PriorityQueue, these two classes
  implements Queue interface.

* Queue q1 = new LinkedList();
  Queue q2 = new PriorityQueue();
-----------------------------------------------------------------------------------------------------------------------
### Linked list :-
	package practice;
	import java.util.LinkedList;

	public class Practice 
	{
	   public static void main(String[] args) 
	   {
		 LinkedList<String> PQ =new LinkedList<>();
		 PQ.add("first");
		 PQ.add("second");
		 PQ.add("third");
		 PQ.add("four");
		 while(PQ.size()!=0)
		 System.out.println(PQ.remove());
	   }
	}
----------------------------------------------------------------------------------------------------------------------
### PriorityQueue Interface in Java Collections :-

* In the last tutorial, we have seen how a Queue serves the requests based on FIFO(First in First out). 
  Now the question is: What if we want to serve the request based on the priority rather than FIFO? 
  In a practical scenario this type of solution would be preferred as it is more dynamic and efficient in nature.
  This can be done with the help of PriorityQueue, which serves the request based on the priority that we set using
  Comparator.

	package practice;
	import java.util.Comparator;
	import java.util.PriorityQueue;

	class MaxLength implements Comparator<String>
	{
	    @Override
		public int compare(String s1,String s2)
		{
			return (s1.length()-s2.length());
		}
		
	}
	public class Practice 
	{
	   public static void main(String[] args) 
	   {
		 PriorityQueue<String> PQ =new PriorityQueue<>(15,new MaxLength());
		 PQ.add("largeee");
		 PQ.add("Small");
		 PQ.add("extra large");
		 PQ.add("Medium");
		 while(PQ.size()!=0)
		 System.out.println(PQ.remove());
	   }
	}	
------------------------------------------------------------------------------------------------------------------------

