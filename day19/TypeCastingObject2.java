package day19;

//TypeCasting for user-defined classes


public class TypeCastingObject2 {

	class Animal {
	}

	class Cat extends Animal {
	}

	class Dog extends Animal {
	}

	public static void main(String[] args) {

		// Cat ct=(Cat) an;
		// A B C D

		// Ru1e 1 - Conversion is valid or not
		// The type of 'd' and 'c' should be same or it must have some relationship(either parent to child or child to parent)

		//Anima1 an = new Dog();
		//Cat ct = (Cat) an; // valid as per rule 1

		//Dog dg = new Dog();
		//Cat ct = (Cat) dg; // invalid as per Rulel

		// Ru1e2 - assignment is valid or not
		// 'C' must be either same or child of 'A' .

//		Anima1 an=new Dog();
//		Cat ct = (Cat) an;    //valid as per Rule2

//		Anima1 an=new Dog();
//		Cat ct = (Dog) an;     // invalid as per Rule2

		// Ru1e3 The underlying object type of 'd' must be either same as Casting object
		// or the underlying object should be child of 'C'
		// Here the underlying object type of 'd'(an) is Dog
		// Underlying object and casting object should be same

		// Animal an-new Dog();
		// Cat ct=(Cat) an;         // invalid as per Rule3
		// Here Underlying object - Dog     Casting Object - Cat

		
		
		
		// Combining Rule 01, Rule02, Rule03
		
		//Animal an = new Dog();
		//Dog dg = (Dog) an;      //All 3 rules passed

	}

}
