class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest = "";
        int minLength = Integer.MAX_VALUE;
        for(String s: strs){
            if(s.length() < minLength){
                shortest = s;
            }
        }
        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(shortest) != 0){
                shortest = shortest.substring(0, shortest.length() - 1);
            }
        }
        return shortest;
    }
}
