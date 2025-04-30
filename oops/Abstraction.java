// hiding certain details / unnecessary and showing only essential nformation to user .
package oops;

// Abstract class - only essential info exposed to user
abstract class Car {
    abstract public void fuelType(); // Only what user needs to know
    abstract public void color();
}

// Concrete class implementing abstract class
class Tata extends Car {
    @Override
    public void fuelType() {
        System.out.println("CNG");
    }

    @Override
    public void color() {
        System.out.println("White");
    }
}

// Main class to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        Car remote = new Tata(); // Using abstract reference for abstraction
        remote.fuelType();       // Only essential methods accessible
        remote.color();
    }
}
