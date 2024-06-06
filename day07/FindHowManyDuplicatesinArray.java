package day07;

public class FindHowManyDuplicatesinArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 30, 30, 50 ,20 };
		int number = 30;
		int count = 0;
		boolean status = false;

		for (int x : a) {
			if (x == number) {
				status = true;
				count++;
			}
		}
		if (status == false) {
			System.out.println("The given element not found");
		}

		System.out.println("The element repeated times is:" + count);

	}

}
