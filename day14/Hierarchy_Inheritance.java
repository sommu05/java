package day14;

class Parent {
	
	int a;
	void display() {
		System.out.println(a);
	}
}

class Child1 extends Parent {
	
	int b;
	void show() {
		System.out.println(b);
	}
}

class Child2 extends Parent {
	
	int c;
	void print() {
		System.out.println(c);
	}
}


public class Hierarchy_Inheritance {

	public static void main(String[] args) {
	
		Child1 c1 = new Child1();
		c1.a = 250;
		c1.display();
		
		Child2 c2 = new Child2();
		c2.a = 500;
		c2.display();
		
		
		

	}

}
