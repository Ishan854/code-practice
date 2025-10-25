class ParentOne{
    public void methodOne(){
        System.out.println("Method One Parent 1");
    }
}

class ParentTwo{
    public void methodOne(){
        System.out.println("Method One Parent 2");
    }
}

 


public class MultipleInherit extends ParentOne, ParentTwo {
    public static void main(String[] args) {
        MultipleInherit mi = new MultipleInherit();
        mi.methodOne();
    }
}
