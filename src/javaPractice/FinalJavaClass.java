package javaPractice;

public class FinalJavaClass {

	public static void main(String[] args) {
		
	car mycar = new car();
	mycar.name = "Toyota";
	mycar.start();
	mycar.Break();
	mycar.extremeaccelerate();
	
	
	sportscar sahi = new sportscar();
	sahi.start();
	sahi.acceletrate();
	sahi.extremeaccelerate();
	
	}
 
}
//interface vs class: An interface is a programming structure/syntax that allows the computer to enforce certain properties on an object (class). For example, say we have a car class and a scooter class and a truck class. Each of these three classes should have a start_engine() action. //
//abstaction; hides the implementation details and only shows the methods of those objects necessary to send a command operation//
//inheritance: when a child class adapts the same function of its parents class//
//polymorphism; when a class takes on multiple properties from its parents class; More specifically, it is the ability to redefine methods for derived classes. //
//encapsulation: when a class embeds itself in another class. It describes the idea of bundling data and methods that work on that data within one unit//
//overrideing = contract only method when a parents class is overrided by the child class.//
