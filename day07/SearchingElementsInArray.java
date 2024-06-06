package day07;

public class SearchingElementsInArray {

	public static void main(String[] args) {
	
		//Example:01 Search an element in array(linear search)
		
		//Normal Forloop
		
		/*int a[] = {10,20,30,40,50};
		int Search_element = 50;
		boolean status = false;
		
		for(int i=0; i<a.length;i++) {
			 
			    if(a[i] == Search_element) {
			    	status = true;
			    	System.out.println("Element found: " + a[i]);
			    	break;
			    	
			    }
			} 
		if(status==false) {
			System.out.println("Element not found");
		}*/
		

		//Foreach loop
		
		int a[] = {10,20,30,40,50};
		int Search_element = 10;
		boolean status = false;
		
		for(int x:a) {
			 if(x == Search_element) {
			    	status = true;
			    	System.out.println("Element found: " + x);
			    	break;    	
			    }	
			 
		}
		if(status==false) {
		System.out.println("Element not found");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
