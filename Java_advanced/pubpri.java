package javpackage;

//Base class (Grandparent)
class AnimalML {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Derived class (Parent)
class DogML extends AnimalML {
 void bark () {
     System.out.println("The dog barks.");
 }
}

//Derived class (Child)
class Puppy extends AnimalML {
 void weep() {
     System.out.println("The puppy weeps.");
 }
}

//Main class to test the inheritance
public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     Puppy myPuppy = new Puppy();

     myPuppy.eat();   // Inherited from Animal
     myPuppy.bark();  // Inherited from Animal
     myPuppy.weep();  // Defined in Puppy
 }
}