public class LinearSearch {
    public static void linearSearch(int[] arr, int num){
        for(int i = 0 ; i < arr.length;i++){
            if(num == arr[i]){
                System.out.println("Element found at index : " + i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        int num  = 6;
        linearSearch(arr, num);
    }
}
