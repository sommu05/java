package day05;

public class WhileLoop {

	public static void main(String[] args) {
	
		//Example1 : Print 1....10
//		int i=1;                //initialization
//		while(i<=10)            //condition 
//		{ 
//			System.out.println(i);
//			i++;                //incrementation
//		}
		
		//Example2 : Print hello message 10 times
//		int i=1;                //initialization
//		while(i<=10)            //condition 
//		{ 
//			System.out.println("hello");
//			i++;                //incrementation
//		}
		
		//Example3 : Print only even numbers between 0-50
		//Approach01
//		int i=0;
//		while(i<=50) 
//		{
//			System.out.println(i);
//			i+=2;
//			
//		}
		//Approach02
//		int i = 1;
//		while(i<=50) 
//		{
//			if(i%2==0) 
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
        
		//Example4 : Print only even numbers between 1-10 stating odd and even along with numbers
		
//		int i =1;
//		while(i<=10)
//		{
//			if(i%2==0) 
//			{
//				System.out.println(i + " is even");
//			}
//			else
//			{
//				System.out.println(i + " is odd");
//			}
//			i++;
//		}
		
		//Example5 : Print 1 to 10 in decending order
		
		int i=10;
		while(i>=1) 
		{
			System.out.println(i);
			i--;
		}
		
	}

}
