// polymorphism -> 1. method overloading (arguments)      2. method overriding (implementation)

package oops;

//-------------------------------- Overriding in Java

class Animal {
    // Base class
    void move() {
        System.out.println("Animal is moving.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dog is running.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    @Override
    void move() {
        System.out.println("Cat is running.");
    }

    void bark() {
        System.out.println("Cat is barking.");
    }
}

public class polymorphism {
    public static void main(String[] args)
    {
        // Animal a = new Animal();
        Dog d = new Dog();
        d.move(); 
        d.eat(); 
        d.bark();
        Cat c = new Cat();
        c.move(); 
        c.eat(); 
        c.bark();

    
    }
}

/*
 * // ------------------------------------ method overloading
 * void sum(int a, int b) {
 * System.out.println(a + b);
 * }
 * 
 * void sum(int a, int b, int c) {
 * System.out.println(a + b + c);
 * }
 * 
 * void sum(String a, String b) {
 * System.out.println(a + b);
 * }
 * 
 * public static void main(String[] args) {
 * 
 * polymorphism obj = new polymorphism();
 * obj.sum(2, 3);
 * obj.sum(2, 3, 4);
 * obj.sum("Rishu", "raj");
 * 
 * }
 * }
 * 
 * // ------------------------------------ method overriding
 */
