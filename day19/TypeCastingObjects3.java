package day19;

public class TypeCastingObjects3 {

	
	//TypeCasting with using a predefined classes predefined objects
	
	
	public static void main(String[] args) {
		
		
		//Ex1:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;   //Ru1e1-yes  Rule2 -yes  Rule3 -failed
		
		//Ex2:
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s;   //Ru1e1 -failed
		
		//Ex4:
		//Object o=new String( "welcome");
		//StringBuffer sb = (String) o;     //Rule1 -yes  Rule-2 - fail (cannot convert from String to StringBuffer)  
		//Rule 2 - after after conversion  string should be stored in a variable and that variable should be again either string or the parent of string which can be object
		
		
		// Ex5:
		//String s = new String("welcome");
		//StringBuffer sb = (String) o;    //Rule 1-passed Rule2-faiIed
		
		
		 //EX6:
		 //Object o=new String("welcome");
		 //StringBuffer sb=(StringBuffer) o;  //Ru1e1- passed Rule2- passed Rule3-failed
		//the underlying of object of O is what string and here it is a string  buffer so string and string buffer not matching no relation so rule three is got failed 
		
		
		//Ex7:
		Object o = new String("welcome");
		String sb = (String) o;           //Rule1 -yes  Rule-2 - yes Rule 3 - Yes
		System.out.println(sb);    //welcome
	}

}
