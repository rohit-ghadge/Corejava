### linked list :-
package practice;

class SinglyLinkedList
{
	class Node
	{
	    int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
//------------------------------------------------------------------------------------
	public Node head=null;

	boolean isListEmpty()
	{
		return(this.head==null);
	}

	void addAtLast(int data)
	{
		Node newnode=new Node(data);
		if(isListEmpty())
		{
		  this.head=newnode;
		} 
		else
		{	
			
			Node trav=this.head;
			while(trav.next!=null)
			{
				
				trav=trav.next;
			}
			trav.next=newnode;

		}
	}
	
	void display()
	{
		Node trav1=this.head;
		if(isListEmpty())
		{
			System.out.println("list is empty");
		}
		else
		{
			while(trav1!=null)
			{
				System.out.println(trav1.data);
	
				trav1=trav1.next;
			}
		}
	}
}
		
class Practice
{
	public static void main(String ss[])
	{
      SinglyLinkedList l=new SinglyLinkedList();
      l.addAtLast(10);
      l.addAtLast(11);
      l.addAtLast(12);
      l.display();
	}
}
