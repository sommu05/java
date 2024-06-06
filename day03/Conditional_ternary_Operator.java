package day03;

public class Conditional_ternary_Operator {

	public static void main(String[] args) {
		
		int a=100, b=200;
//		int x = (a<b) ? a : b;
//		System.out.println(x);  //100
		
		int x = (a>b) ? a : b;
		System.out.println(x);   //200
		
		int y = (1==2) ? 100 : 200;
		System.out.println(y); //200
		
		int age = 19;
		String z = (age>=18) ? "Eligible" : "Not Eligible";
		System.out.println("He is "+ z + " to vote");       //He is Eligible to vote

	}

}
