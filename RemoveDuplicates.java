import java.util.Arrays;

public class RemoveDuplicates {
    public static void removeDuplicates(int [] arr){
        int index = 0;
        Arrays.sort(arr);
        for(int i = 1; i< arr.length;i++){
            if(arr[index] != arr[i]){ 
                index++;
               arr[index] = arr[i];
            }
            
        }
        
         for(int i = 0 ; i<= index; i++){
               System.out.println(" " + arr[i]); 
            }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,5};
        removeDuplicates(arr);
    }
}
