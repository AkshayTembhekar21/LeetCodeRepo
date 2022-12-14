import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<s.length() && j<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            res = Math.max(res, set.size());        
        }
        return res;
    }
}