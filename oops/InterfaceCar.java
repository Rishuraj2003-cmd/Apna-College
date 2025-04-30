package oops;

interface car {
    public void start();

}

class EVcar implements car {
    public void start() {
        System.out.println("Electric car starts");
    }
}

class Diselcar implements car {
    public void start() {
        System.out.println("Disel car starts");
    }
}
    public class InterfaceCar {

    public static void main(String[] args){

        car tesla  = new EVcar() ;
        car XUV700 = new Diselcar() ;
        tesla.start();
        XUV700.start();
    }
}
