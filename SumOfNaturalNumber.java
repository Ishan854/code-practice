public class SumOfNaturalNumber {
    static int sumOfNaturalNumber(int n){
        if(n==0) return 0;
        else{
            return n + sumOfNaturalNumber(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumOfNaturalNumber(n));
    }  
}
