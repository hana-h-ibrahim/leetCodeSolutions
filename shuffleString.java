// Runtime: 1 ms, faster than 100.00% of Java online submissions for Shuffle String.
// Memory Usage: 38.8 MB, less than 99.05% of Java online submissions for Shuffle String.

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray(); 
        String result=""; 
        char[] res= new char[ch.length];  

        for(int i=0;i<ch.length;i++) { 
            int position = indices[i]; 
            res[position] = ch[i];
        }

        result = String.valueOf(res);
        return result; 
    }
}
