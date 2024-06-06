package day11;

public class GreetingsMain {

	public static void main(String[] args) {
	
        Greetings gre = new Greetings();
        
        gre.display();
        
        
        
        System.out.println(gre.print());
        //(or)
        String se = gre.print();
        System.out.println(se);
        
        
        gre.mode("Velan");
        
        
        String sr = gre.fox("Ghilli");
        System.out.println(sr);
        
        
        
        
	}

}
         