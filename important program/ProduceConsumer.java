package m;
import java.util.*;

class Producer implements Runnable
{
	List<Integer>SharedList=null;
	final int MAX_SIZE=5;
	private int i=0;
	public Producer(List<Integer>SharedList)
	{
		super();
		this.SharedList=SharedList;
	}

	public void produce (int i) throws InterruptedException
	{
		synchronized(SharedList)
		{
			while(SharedList.size()==MAX_SIZE)
			{
				System.out.println(" sharedlist is is full .....wating for the consumer to consume ");
				SharedList.wait();
				
			}
		}
		synchronized(SharedList)
		{
			System.out.println("produce produced elements "+i);
			SharedList.add(i);
			Thread.sleep(500);
			SharedList.notify();
		}
		
	}
	
	
	@Override
	public void run()
	{
		while(true)
		{
			try 
			{
				produce(i++);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable
{
	List<Integer>SharedList=null;
	
	public Consumer(List<Integer>SharedList)
	{
		super();
		this.SharedList=SharedList;
	}

	public void consume () throws InterruptedException
	{
		synchronized(SharedList)
		{
			while(SharedList.isEmpty())
			{
				System.out.println(" sharedlist is is Empty .....wating for the producer to produce ");
				SharedList.wait();
			}
		}
		synchronized(SharedList)
		{
			Thread.sleep(500);
			System.out.println("consume the elements "+SharedList.remove(0));
			SharedList.notify();
		}
		
	}

	@Override
	public void run()
	{
		while(true)
		{
			try 
			{
				consume();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	
    }
}

public class ProduceConsumer
{
	public static void main(String str[])
	{
		List<Integer>SharedList=new ArrayList<Integer>();
		Thread thread1 =new Thread (new Producer(SharedList));
		Thread thread2 =new Thread (new Consumer(SharedList));
		thread1.start();
		thread2.start();
	}
}

