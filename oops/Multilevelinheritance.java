package oops;
// Top-level class
class Gp {
    void gp() {
        System.out.println("I am grandparent");
    }
}

class par extends Gp {
    void pa() {
        System.out.println("I am parent");
    }
}

class child extends par {
    void Child() {
        System.out.println("I am child");
    }
}

public class Multilevelinheritance {
   
    public static void main(String[] args) {
        child obj = new child();
        System.out.println();
        obj.Child();
        obj.pa();
        obj.gp();
    }
}
