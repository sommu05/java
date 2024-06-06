package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo  {

	public static void main(String[] args) throws IndexOutOfBoundsException {

		 
		HashSet myset = new HashSet();  //Created object for the child class (Here HashSet is a default child class) Set is a Parent class
//		Set myset1 = new HashSet();     // Child object can hold in the Parent class variable 

		
		// If want to store Homogeneous data
        // HashSet<String> myset = new HashSet<String>();

		
		//Add elements in HashSet
		myset.add(100);
		myset.add(true);
		myset.add("Welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);    //[null, 100, Welcome, true]
		
		
		//Remove elements in HashSet	
		myset.remove("Welcome");
		System.out.println("Elements after removing : " + myset); //[null, 100, true]
		
		//Inserting elements  - Not possible    (can only add element in the HashSet)
		
		
		
		//Access Specific element  - Not possible 
		//Workaround is available - converting this Hashset into the ArrayList and we can access the specific elements 
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al.get(0));  //null
		System.out.println(al.get(1));  //100
		System.out.println(al.get(2));  //true
		try {
		System.out.println(al.get(3));     //because no value in index 3
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	    	 
		
		//Reading all the elemnts in the Hashset:
		//Using normal forloop - not possible    --because no index
		
		//ForeachLoop
		for(Object x:myset) {
			System.out.println(x);
		}
			
		//Iterator 
		Iterator it = myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Size of HashSet
		System.out.println(myset.size());   //3
		
		
		//Clearing all the elements in the HashSet
		myset.clear();
		System.out.println("After clearing the HashSet:" + myset );  // []
		System.out.println(myset.isEmpty());
		
		
		
	}
	
	

}
