// For example, consider a newly born baby, inheriting eyes from mother, nose from father.

// Kindly note that Java does not support Multiple Inheritance, but we can use Interfaces to achieve the same purpose.
/* 
package oops;
class A {
    void show() {
        System.out.println("Class A");
    }
}
class B {
    void show(){
        System.out.println("Class B");
    }
}
class C extends A  {

}
public class multipleInheritance {
  
        C obj = new C(); // creating object of class C
       // obj.show(); //  ------>>>> ambiguity aa jati hai . Show()  ko pata hi nhi chal rha hai hi kisko print kru... 
       // we will fix through " interface "
	
}

*/
package oops;

interface A {
    void run();
}

interface B {
    void run();
}

class C implements A, B {
    public void run() {
        System.out.println("C class run method");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}
