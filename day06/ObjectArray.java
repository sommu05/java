package day06;

public class ObjectArray {

	public static void main(String[] args) {
	
		Object a[] = {123, "Welcome", 12.5, true};

		//Normal forloop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//Enhanced Forloop/Foreach loop
		for(Object x : a) {
			System.out.println(x);
		}
	}

}
