package day02;

public class Datatypes_demo {

	public static void main(String[] args) {
		 int a=100, b=200;
		 System.out.println("The value of a is: "+ a);
		 System.out.println("The value of a is: "+ b);
		 System.out.println(a+b);
		 System.out.println("The value of a is: "+ a+b);  // 100200 - Here 2 plus operators so code confuses to do concatenation or addition
		 System.out.println("The value of a is: "+ (a+b));  //300
		 
		 byte by=127;
         System.out.println(by);	
         
         short sh= 32767;
         System.out.println(sh);
         
         long lg=56987456325L;   //L/l literal is needed
         System.out.println(lg);
         
         float fl=56.5632F;      //F/f literal is needed
         System.out.println(fl);
         
         double dl=56.8569859856;
         System.out.println(dl);
        		 
         char grade='A' , rank='1';
         System.out.println(grade+" "+rank);
         
         String name="John";
         System.out.println(name);
         
        // char ch='ABC'; // invalid
        // String ch='ABC'; // invalid
        // String ch='A'; // invalid
        // String ch="A"; // valid
         
        boolean bl=true; 
        System.out.println(bl);
        
      //boolean bl="true";  //invalid
      //boolean bl="false"; //invalid
      //String bl=true;     //invalid
      //String bl="true"    //valid
        
        
        		
        		 
	}

}
