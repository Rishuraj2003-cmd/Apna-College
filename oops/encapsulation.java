package oops;

class student{
    private String name;
    private int age ;
    private int roll_no;

    public String getName(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getRoll(){
        return roll_no;
    }

    public void setName(String name){
        this.name=name ;
    }
    public void setage(int age){
        this.age= age;
    }
    public void setRoll(int roll_no){
        this.roll_no= roll_no;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        
        student obj = new student() ;
        obj.setName("Rishu");
        obj.setRoll(1);
        obj.setage(22);

     System.out.println(obj.getName());
     System.out.println(obj.getRoll());
     System.out.println(obj.getage());
  }
}
