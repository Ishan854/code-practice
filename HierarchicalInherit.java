class Parent {
    public void parentMethod(){
        System.out.println("Parent Method");
    }
}
 class Child1  extends Parent{

   public void childOneMethod(){
        System.out.println("Child One Method");
   }
}
class Child2  extends Parent{

   public void childTwoMethod(){
        System.out.println("Child Two Method");
   }
}
class Child3  extends Parent{

   public void childThreeMethod(){
        System.out.println("Child Three Method");
   }
}
public class HierarchicalInherit {

    public static void main(String[] args) {
       Child2 c2 = new Child2();
       Child3 c3 = new Child3();
       c3.childThreeMethod();
       c2.childTwoMethod();
    }
}