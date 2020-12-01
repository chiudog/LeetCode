class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] alphaFreq = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            alphaFreq[s.charAt(i) - 'a']++;
            alphaFreq[t.charAt(i) - 'a']--;
        }
        
        for(int n : alphaFreq){
            if(n != 0){
                return false;
            }
        }
        
        return true;
    }
}
