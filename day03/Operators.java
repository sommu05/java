package day03;

public class Operators {
   public static void main(String args[]) {
	   
	// 1) Arithmetic operators + - * / %
	   int a=20,b=10;
	   System.out.println("Sum of a and b is: "+(a+b));
	   System.out.println("Subraction of a and b is: "+(a-b));
	   System.out.println("Mu1tip1ication of a and b is:" + (a*b));
	   System.out.println("Division of a and b is: "+(a/b));
	   System.out.println("Modu1o division of a and b is: " + (a%b));
	   
	   int result = a+b;
	   System.out.println("Sum of a and b is: "+ result);
			   
	   
	// 2) Relational/comparison operators > >= < <= != ==
	// Always return Boolean value   
	   
	   System.out.println(a<b); //false
	   System.out.println(a<=b); // false
	   System.out.println(a>b); //true
	   System.out.println(a>=b); //true
	   b=20;
	   System.out.println(a!=b); //false
	   System.out.println(a==b); //true
	   System.out.println(a<=b); //true
	   System.out.println(a>=b); //true
	   
	   a=40;
	   boolean res = a>b;
	   System.out.println(res);  //true
	   System.out.println("The answer for == is: "+ (a==b));
	   
	   
	   
	   //3) Logical operators && || ! ---->  and or not 
	   // Always return Boolean value  
       // works between 2 boolean values
	   
	   boolean x=true;
	   boolean y=false;
	   System.out.println(x&&y);  //false
	   System.out.println(x||y); //true
	   System.out.println(!x); //false
	   System.out.println(!y); //true
	   
	   
	   int c=10;
	   int d=20;
	   boolean b1 = c<d;
	   System.out.println("The value of b1 is: "+b1);
	   
	   boolean b2 = c>d;
	   System.out.println("The value of b2 is: "+b2);
	   
	   System.out.println(b1 && b2); //false
	   System.out.println(b1 || b2); //true
	   System.out.println(!b1);  //false
	   System.out.println(!b2);  //true
	   
	   //Combination of relational and logical operator
	   System.out.println("The answer is:"+ ((10<20) && (20>10))); //true
	   
	   
	   
   }
}
