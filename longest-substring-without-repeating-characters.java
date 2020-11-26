public class Solution {
    // O(n) time, O(m) size; n = length of string, m = size of charset
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int[] index = new int[256];
​
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(i, index[s.charAt(j)]);
            result = Math.max(result, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        
        return result;
    }
}
