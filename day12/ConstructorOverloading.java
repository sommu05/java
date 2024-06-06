package day12;

public class ConstructorOverloading {

	double length, width, height;
	
	ConstructorOverloading(){
		length=width=height=0;
	}
	
	ConstructorOverloading(double l, double w, double h){
		length=l;
		width=w;
		height=h;
	}
	
	ConstructorOverloading(double len){
		length=width=height=len;
	}
	
	double display() {
		return length*width*height;
		
	}
	
	
}
