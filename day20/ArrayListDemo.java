package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

   //Declaration of Array list variable
		
		ArrayList mylist = new ArrayList();  //Created object for the child class (Here ArrayList is a default child class) List is a Parent class 	
	//	List mylist1 = new ArrayList();  //Child class object can hold in the parent class variable
		
		
	//adding data into ArrayList
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(10.500f);
		mylist.add(155666698l);
		mylist.add('A');
		mylist.add(true);
		mylist.add("come");
		mylist.add("come");
		mylist.add(null);
		mylist.add(null);
	
		
    //Size of arrayList
		System.out.println("The size of arrayList is: " + mylist.size());
    		
	//Printing the arrayList
		System.out.println("The elements in the arrayList are: " + mylist);
		System.out.println(mylist);
		
		System.out.println("The element in 2nd index is: " + mylist.get(2));  //priniting ArrayList with the index position using get() method
		
	//Remove elements from arrayList
		mylist.remove(8);
		System.out.println("The elements in the arrayList are: " + mylist);
		
		
	//Adding elements inbetween the Arraylist	
		
		mylist.add(2, "java");
		System.out.println("The elements in the arrayList are: " + mylist);
		
		
	 //Modify elements in the ArrayList  (Change/Modify/Replace)
		
		mylist.set(2, "Java_Selenium");
		System.out.println("The elements in the arrayList are: " + mylist);
		
	
	 //Access Specific element from the arryList
		
		System.out.println("The element in 2nd index is: " + mylist.get(2)); //Java_Selenium
		//this get method will return the specific object from the arrayList
		
	//Reading all the elements from the arrayList
		
		//using noraml forloop
			
		for(int i=0;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
		
		//using enhanced forloop
		for (Object x: mylist) {
			System.out.println(x);
		}
		
		//using iterator method
		
		Iterator it =  mylist.iterator();
		
	/*	while(it.hasNext()) {
			System.out.println("Iterator " + it.next());
		}
		*/
		
		//Without loop, if we call next method
				System.out.println(it.next()); //100 -- it will just return the first value in the array list 
	

		//Checking arrayList empty of not
				
		System.out.println("My list is empty:" + mylist.isEmpty());
		
		
		//Remove all the elements from arrayList
		System.out.println("Before remove multiple elements" + mylist);
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(true);
		mylist2.add(155666698l);
		mylist2.add('A');
		mylist2.add(null);
		
		mylist.removeAll(mylist2);
		System.out.println("After remove multiple elements" + mylist);
		
		//Clear method
		mylist.clear();
		System.out.println("My list is empty:" + mylist.isEmpty());
	
		System.out.println(mylist);   //[]
	}

}
