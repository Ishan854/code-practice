import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[]nums, int target){
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0 ; i< nums.length;i++){
        int comp = target - nums[i];
        if(!map.containsKey(comp)){
            map.put(nums[i], i);
        }else{
            return new int[]{map.get(comp), i};
        }
       }
       return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,5,10,4};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
