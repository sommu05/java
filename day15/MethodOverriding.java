package day15;

class Bank {
    static double roi() {
        return 0;
    }
}

class ICICI extends Bank {
    // This is a new method, not an override
    double roi() {
        return 8.5;
    }
}

class SBI extends Bank {
    // This is a new method, not an override
    double roi() {
        return 7.5;
    }
}
//In the provided code, the methods roi() defined in the ICICI and SBI classes are instance methods.

class ReserveBank  extends Bank{
	
}


public class MethodOverriding {

	public static void main(String[] args) {
       ICICI obj1 = new ICICI();
       System.out.println(obj1.roi()); //8.5
       
       SBI obj2 = new SBI();
       double rateofinterest = obj2.roi();
       System.out.println(rateofinterest); //7.5
       
       ReserveBank rbiobj = new ReserveBank();
       System.out.println(rbiobj.roi()); //0.0 
       //because it has not overrided the method, its just the inherits the method from the Bank

	}

}
