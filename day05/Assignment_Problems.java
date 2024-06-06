package day05;

public class Assignment_Problems {
public static void main(String [] args) {
	
	//Example1  - Reverse a number
	
//	int num = 1234;
	//Using StringBuffer class
			
//	StringBuffer sb= new StringBuffer (String.valueOf(num)) ;   //convert the number into string format and store it in a variable sb
//	StringBuffer rev = sb.reverse();
//	System.out.println("Reverse Number is: "+ rev); //1234
	
	//Using StringBuilder class
	
//	StringBuilder sbl = new StringBuilder();
//	sbl.append(num);
//	StringBuilder rev = sbl.reverse();
//	System.out.println("Reverse Number is: "+ rev); //1234
	
	
	//Example2  - Palindrome number - wrong have to check
//	int First_number=121;
//	
//	StringBuilder sbe = new StringBuilder();
//	sbe.append(First_number);
//	StringBuilder rev = sbe.reverse()
//			
//    if (First_number == rev)
//    {
//    	System.out.println("Yes its a palindrome number");
//    }
//    else {
//    	System.out.println("Its not a palindrome number");
//    }
			
      //Example3 : Count number of digits in a number
	
//	   int num = 123456;
//	   int count = 0;
//	   
//        while(num>0)
//	   {
//		   num= num/10; 
//		   count++;
//	   }
//	   System.out.println("The count number of digits in a number:"+ count );
    
	
	   
	   //Example5 : Find sum of digits in a number
		
	   int num = 1234;
	   int sum = 0;
	   
        while(num>0)
	   {
		   sum=sum+num%10;     //Extract the reminder from the number
		   num = num/10;      // Remove the last digit number from the number 
	   }
	   System.out.println("The sum of digits in a number:"+ sum ); //10
    
	
	
}
}
