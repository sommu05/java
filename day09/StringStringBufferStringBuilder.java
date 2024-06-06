package day09;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {
		String s = new String("Welcome");
		
		s.concat(" to Java");            //- Immutable
		System.out.println(s); //Welcome
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" to java");          //- Mutable
		System.out.println(sb); // Welcome to java
		
		StringBuilder sbu = new StringBuilder("Welcome");
		sbu.append(" to java");         //- Mutable
		System.out.println(sbu); //Welcome to java

	}

}
