public class RemoveTargetElement {
    public static void removeTargetElement(int[] arr, int t){
        int index = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != t){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = 0; i < index ; i++){
            System.out.print(" " + arr[i]);
        }
    }
   public static void main(String[] args) {
    int [] arr = {1,2,1,2};
    int target = 1;
    removeTargetElement(arr, target);
   } 
}
