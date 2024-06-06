package day17;

public class Test1 {
	
	//Private access Modifier:
	
	    private int a = 100;
	    private void m1() {
		System.out.println("Hi Private access Modifier");
	    }
	
	
	//Default access modifier:
	    
	    int b = 100;
	    void m2() {
		System.out.println("Hi Default access Modifier");
	    }
	
	//Protect access modifier
	
	    protected int c = 100;
	    protected void m3() {
		System.out.println("Hi Protected access Modifier");
	    }
	    
	//public access modifier
	
	    public int d = 1000;
	    public void m4() {
		System.out.println("Hi Public access Modifier");
	    }

	public static void main(String[] args) {

	//Private 
		Test1 obj = new Test1();
		System.out.println(obj.a);
		obj.m1();

	}

}
