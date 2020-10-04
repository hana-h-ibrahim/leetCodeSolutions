// Runtime: 0 ms, faster than 100.00% of Java online submissions for Jewels and Stones.
// Memory Usage: 37.2 MB, less than 98.33% of Java online submissions for Jewels and Stones.


class Solution {
    public int numJewelsInStones(String J, String S) {
    int result=0;        
        for(int i=0;i<S.length();i++) { 
            char wanted = S.charAt(i);
            String candidates = J;
            boolean hit = candidates.indexOf(wanted) >= 0;
            if (hit)
                result=result+1;
        }
        return result; 
    }
}
