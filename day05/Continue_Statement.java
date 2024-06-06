package day05;

public class Continue_Statement {

	public static void main(String[] args) {
	
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}

		//If want to skip three five and nine
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==9 || i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
