package javpackage;

//Abstract class
abstract class Animal {
 // Abstract method (no body)
 abstract void sound();

 // Concrete method
 public void eat() {
     System.out.println("This animal eats food.");
 }
}

//Subclass
class Dog extends Animal {
 // Implementing abstract method
	//@Override
	public void sound() {
     System.out.println("Dog barks");
 }
}
class Cat1 extends Animal
{
	public void sound()
	{
		System.out.println(" Cat meows");
	}
}

//Main class
public class AbstractionExample {
 public static void main(String[] args) {
     Animal myDog = new Dog();  // upcasting
     myDog.sound();             // Dog barks
     myDog.eat();               // This animal eats food.
     
     Animal mycat = new Cat1();
     mycat.sound();
     mycat.eat();
     
 }
}
