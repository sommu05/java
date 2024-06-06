package day19;

public class TypeCasting {

	public static void main(String[] args) {
		
		//UpCasting & Downcasting
		//TypeCasting for primitive variables
	
		//UpCasting  ---> smaller to larger
		 
		     int intnum = 10;
		     long longnum = intnum;
		     System.out.println(longnum);
		     
		     float floatnum = 15.5698f;
		     double doublenum = floatnum;
		     System.out.println(doublenum);
		     
		     int intval = 10;
		     double doubleval = intval;
		     System.out.println(doubleval);  //10.0
		     
		     
		     
		     
		 //Downcasting -->  larger to smaller -- do it manually
		     
		     long longvalue = 100000l;
		     int intvalue = (int) longvalue;  //we will convert that into int and then I'm storing into the intvalue
		     System.out.println(intvalue);
		     
		     double doubleValue = 100.500;
		     float floatvalue = (float) doubleValue; //we will convert that into float and then I'm storing into the floatValue 
		     System.out.println(doubleValue);
			     
		     double dle = 10.65;
		     int il = (int) dle;  //we will convert that into int and then I'm storing into the il
		     System.out.println(il);
		     

	}

}
