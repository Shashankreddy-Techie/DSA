// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Call the methods from the Dog class
        myDog.bark(); // Output: The dog barks.
        
        // Call the inherited method from the Animal class
        myDog.eat();  // Output: This animal eats food.
    }
}
