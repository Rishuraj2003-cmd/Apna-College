package oops;

class employee{
        void salary(){
            System.out.println("salay = 70000");
        }
}
class hr extends employee{
    void bonus(){
        System.out.println("Bonus = 20000");
    }
}

public class singInheritance {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        System.out.println();
        obj.bonus();

    }
}
