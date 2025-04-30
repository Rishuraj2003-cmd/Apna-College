package oops;

class A {
    public void print() {
        System.out.println("Class A method");
    }
}
class B extends A {
    public void printB() {
        System.out.println("Class B method");
    }
}
class C extends B {
    public void printC() {
        System.out.println("Class C method");
    }
}

public class hirerchicalInhertance {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        obj.print();
        obj1.print();

    }
}
