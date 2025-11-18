public class SumOfDigit {
    static int func(int n){
        if(n==0) return 0;
        else{
            return n % 10 + func(n / 10);
        }
    }
    public static void main(String[] args){
        int n = 123456;
        System.out.println(func(n));
    }
}
