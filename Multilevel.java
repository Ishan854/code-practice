class Parent{
    public void methodParent(){
        System.out.println("Parent Method");
    }
}
 class Child extends Parent {
public void methodChild(){
    System.out.println("Child Method");
}
    
}
class SubChild extends Child{
    public void subChildMethod(){
        System.out.println("Sub Child Method");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        SubChild sc = new SubChild();
        sc.methodParent();
        sc.methodChild();
        sc.subChildMethod();
    }
}
