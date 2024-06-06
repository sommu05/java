package day10;

public class EmployeeMain {
	public static void main(String[] args) {
		
    	Employee emp1 = new Employee();
    	emp1.rollNumber = 55;
    	emp1.name = "Sommu Alagappan";
    	emp1.age = 27;
    	emp1.role = "Test Automation Engineer";
    	emp1.display();

    	Employee emp2 = new Employee();
    	emp2.rollNumber = 07;
    	emp2.age = 25;
    	emp2.name = "Ashok";
    	emp2.role = "Engineer";
    	emp2.display();
    	
    	System.out.println(emp2.age);  //we can also print, without display method but it not recommended
		System.out.println(emp2.role);
    	
    	
    	
    	
	}

}
