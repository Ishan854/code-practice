public class Factorial {
    static long fact(long n){
        if(n<=1)return 1;
        else{
             return n * fact(n-1);
        }    
    }
    public static void main(String[] args) {
        long n = 8;
        System.out.println(fact(n));
    }

}
