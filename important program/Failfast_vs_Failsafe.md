### Fail-fast :-

* Fail-fast Iterators throws ConcurrentModificationException when one Thread is iterating over collection object and
 other thread structurally modify Collection either by adding, removing or modifying objects on underlying collection.
-----------------------------------------------------------------------------------------------------------------------
package m;

import java.util.ArrayList;
import java.util.Iterator;

public class Test 
{
	public static void main(String[] args) 
	{
		//Creating an ArrayList of integers
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Adding elements to list
		
		list.add(1452);
		
		list.add(6854);
		
		list.add(8741);
		
		list.add(6542);
		
		list.add(3845);
		
		//Getting an Iterator from list
		
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext())
		{
			Integer integer = (Integer) it.next();
			
			list.add(8457);      //This will throw ConcurrentModificationException
		}
	}	
}
  * ArrayList, Vector, HashMap.
----------------------------------------------------------------------------------------------------------------------
### Fail-Safe Iterators In Java :

* Fail-Safe iterators don’t throw any exceptions if the collection is modified while iterating over it. 
* Because, they iterate on the clone of the collection not on the actual collection.
* So, any structural modifications done on the actual collection goes unnoticed by these iterators.
* But, these iterators have some drawbacks. 
* One of them is that it is not always guaranteed that you will get up-to-date data while iterating.
* Because any modifications to collection after the iterator has been created is not updated in the iterator.
* One more disadvantage of these iterators is that there will be additional overhead of creating the copy of the
* collection in terms of both time and memory.

package m;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
 
public class Test 
{
    public static void main(String[] args) 
    {
        //Creating a ConcurrentHashMap
         
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
         
        //Adding elements to map
         
        map.put("ONE", 1);
         
        map.put("TWO", 2);
 
        map.put("THREE", 3);
         
        map.put("FOUR", 4);
         
        //Getting an Iterator from map
         
        Iterator<String> it = map.keySet().iterator();
         
        while (it.hasNext())
        {
            String key = (String) it.next();
            map.put("FIVE", 5);
            System.out.println(key+" : "+map.get(key));
             
                 //This will not be reflected in the Iterator
        }
    }
}
Ex : Iterator returned by ConcurrentHashMap.
---------------------------------------------------------------------------------------------------------------------
