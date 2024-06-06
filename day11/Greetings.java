package day11;

public class Greetings {
 
	//Different ways/combinations we can create methods:
	
	//l) No params  - No return value
	
	void display(){
		System.out.println("Hello Java");
	}
	


  //2) No params  - Returns value
 
      String print(){
    	  return "Hello Sommu Alagappan";
      }
      
      
    //3) Takes Params - no return value
         
      void mode(String name){
    	  System.out.println("Welcome " + name );
      }
      
      
      //4) Takes Params - return value 
      
      String fox(String name){
    	  return (name + " Re-release" );
      }
      
      
}