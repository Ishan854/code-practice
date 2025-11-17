class FunctionCall {
    static void functionOne() {
        System.out.println("Inside function one");
    }

    static void functionTwo() {
        System.out.println("Before Function one");
        functionOne();
        System.out.println("After Function one");
    }
}

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Before function two");
        FunctionCall.functionTwo();
        System.out.println("After function two");
    }

}