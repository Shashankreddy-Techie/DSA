// Base class
class Animal {
    // Method in the base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    // Method in the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();
        
        // Call methods from both the Dog class and the Animal class
        myDog.eat();  // Inherited method
        myDog.bark(); // Dog's own method
    }
}
