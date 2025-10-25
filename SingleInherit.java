class Parent {
    public void method1(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent {
    public void method2(){
        System.out.println("Child Method");
    }
}
public class SingleInherit{
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
    }
}
