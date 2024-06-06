package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		//HashMap hm = new HashMap();   //Created object for the child class (Here HashMap is a default child class) Map is a Parent class
		//Map map = new HashMap();      // Child object can hold in the Parent class variable Map
		
	    HashMap <Integer,String> hm = new HashMap<Integer,String>();  
	    //if your data is very specific like all the keys are integers all the values are string then you can explicitly specify the integer and string
	    //I'm going with definition, because I'm going to use Integer and Strings only
		
		//Adding pairs:   - put method
		
		hm.put(101,"John");
		hm.put(102,"Ashok");
		hm.put(103,"Cena");
		hm.put(104,"Don");
		hm.put(101,"Enam");
		
		System.out.println(hm);  //{101=Enam, 102=Ashok, 103=Cena, 104=Don} 
		//As the key was duplicated and with different values for the duplicate key
		//So here 101 John the old value is replaced by Enam, So 101 Enam is printed
	
		
		//Size of HashMap
		int size = hm.size();         //Here I know it will return int value, So data type i mentioned int 
		System.out.println("How many pairs are available: " + size);
		
		
		//Remove pair - We have to specify the key , Based on key the pair will be removed
		
		hm.remove(103);     //103 is the key of the pair
		System.out.println("After removing pair" + hm);   //{101=Enam, 102=Ashok, 104=Don}
		
		
		//Retirve/Access the values of the key
	
		String values = hm.get(102);     //Here I know it will return String value, So data type i mentioned String   
		System.out.println(values);   //Ashok
		
		
		//Access all the keys from HashMap 
        System.out.println(hm.keySet());   // [101, 102, 104]
        
        //Access all the Values from HashMap   
        System.out.println(hm.values());   //  [Enam, Ashok, Don]
        
        
       //Access all the keys and values from HashMap 
        Set<Entry<Integer, String>> key_values = hm.entrySet();     
        //This is the return type of entrySet, If you keep the cursor it shows Set<Entry<Integer, String>>, So you put it as return type 
        //or else Sop(hm.entrySet()), Just I'm assigning into a variable and printing, In future if we want to do any operation in this variable we can  
        System.out.println(key_values);    //  [101=Enam, 102=Ashok, 104=Don]
        
        	
        
       //Read all the keys and values through Foreach loop With keyset method and get method 
        
        for ( int x :hm.keySet()) {
        	System.out.println(x + " " + hm.get(x));    //Printing both the keys and values
        	
        }
        
        //Using iterator for HashMap
        
        //we cannot call iterator method directly from hm 
        //So on the entrySet we can apply iterator in HashMap, because EntrySet returns all the keys and values
        
        
        Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();   //This is the return type of iterator, If you keep the cursor it shows  
        //System.out.println(it.next());     //101=Enam
        
        while(it.hasNext()) {
        Entry <Integer,String> entry = it.next();
        System.out.println(entry.getKey() + " " + entry.getValue());        //entry object has getKey and getValue methods 
        }
        //101 Enam
        //102 Ashok
        //104 Don
        
        
        
        //I'm putting simply same output
        while(it.hasNext()) {
            System.out.println(it.next()); 
            }
        //101 Enam
        //102 Ashok
        //104 Don
        
        
        //clear all from hashmap
         hm.clear();
         System.out.println("The Hashmap is empty: " + hm.isEmpty()); //true
	}

}
