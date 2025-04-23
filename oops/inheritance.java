package oops;

/* 
class parentClass{
    void display(){
        System.out.println("Parent class method");
    }
}

class childClass extends parentClass{
    void show(){
        System.out.println("Child class method");
    }
}

public class inheritance {
    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
*/

class vehicle {
    double price;
    int milage;
    String color;

    void display() {
        System.out.println();
        System.out.println("Car price : " +price);
        System.out.println("milage (km/L) : " +milage);
        System.out.println("Color : " +color);
        System.out.println();
    }
}

class car extends vehicle {
    String brand;
    String fueltype;
    Boolean sunroof;

    void show() {
        System.out.println();
        System.out.println("Brand : "+ brand);
        System.out.println("fueltype : "+ fueltype);
        System.out.println("Sunroof : "+ sunroof);
    }

}

public class inheritance {
    public static void main(String[] args) {
        car car1 = new car();
        car1.brand = " Mahindera ";
        car1.fueltype = "CNG";
        car1.color = "Z-Black";

        car1.price=1000000;
        car1.milage = 26;
        car1.sunroof= true ;
        
        car1.show();
        car1.display();

    }
}
