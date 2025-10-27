public class LongestSubString {
    public static int longestSubString(String s){
        int low = 0, high = 0;
        boolean freq[] = new boolean[256];
        int res = 0;
        while(high<s.length()){
            while (freq[s.charAt(high)] == true) {
                freq[s.charAt(low)] = false;
                low++;
            }
            freq[s.charAt(high)] = true;
            res = Math.max(res, (high - low + 1));
            high++;
           
        }
        return res;
    }
    public static void main(String[] args) {
        String s =  "abcdefdefghij";
        System.out.println(longestSubString(s));
    }
    
}
