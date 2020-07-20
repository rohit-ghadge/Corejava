package m;
import java.util.*;
public class d
{
	public static void main(String str[])
	{
	   HashSet<String>hs=new HashSet<>();
        hs.add("Rohit");
        hs.add("Akshay");
        hs.add("Shree");
        hs.remove("Akshay");

       Iterator <String> itr= hs.iterator();
       while( itr.hasNext())
       System.out.println(itr.next());
       
       
    
    
    		Map<String,String> gfg = new HashMap<String,String>(); 
    	
    		gfg.put("GFG", "geeksforgeeks.org"); 
    		gfg.put("Practice", "practice.geeksforgeeks.org"); 
    		gfg.put("Code", "code.geeksforgeeks.org"); 
    		gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
    		
    		for (Map.Entry<String,String> entry : gfg.entrySet()) 
    			
    			System.out.println("Key = " + entry.getKey() + 
    							", Value = " + entry.getValue()); 
    
}

