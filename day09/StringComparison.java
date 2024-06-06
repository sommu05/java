package day09;

public class StringComparison {

	public static void main(String[] args) {
	
		//Example01:
		
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1==s2);         //true
		System.out.println(s1.equals(s2));  //true
		
		//Example02:
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		
		System.out.println(s3==s4);         //false   //double equal to will compare the objects 
		System.out.println(s3.equals(s4));  //true    //whereas equals method will compare the values of object 
		
		//Example03:
		String s5 = "welcome";
		String s6 = new String("welcome");
				
		System.out.println(s5==s6);      //false
		System.out.println(s5.equals(s6)); //true
		
		//S5 is totally different than S6, S5 can be object or variable that dosen't matter, But s6 is different object, so false
		//But here values are same so, true
		
		//Example04:
		String s7= "abc";
		String s8= new String("abc");
		String s9 = s8;
		
		System.out.println(s7==s8);        //false
		System.out.println(s7.equals(s8)); //true 
		
		System.out.println(s8==s9);       //true
		System.out.println(s8.equals(s9));//true
		 
		System.out.println(s7==s9);       //false
		System.out.println(s7.equals(s9));//true

	}

}
