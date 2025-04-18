package oops;

public class concept {
    String name ;
    int roll ;

    public  void PrintData(){
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String[] args) {
        concept std1 = new concept()  ;
        std1.name = "rishu ";
        std1.roll = 1 ;
        std1.PrintData();

        concept std2 = new concept()  ;
        std2.name = "Nidhi ";
        std2.roll = 2 ;
        std2.PrintData();
    }
}
