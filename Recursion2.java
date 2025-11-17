public class Recursion2 {

    static void functionOne(int n) {
        if (n == 0)
            return;
        // System.out.println("GFG : " + n);
        functionOne(n - 1);
        System.out.println(n);
        functionOne(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        functionOne(n);
    }
}
