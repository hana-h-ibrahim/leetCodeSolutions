/**
Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
Memory Usage: 38.5 MB, less than 96.29% of Java online submissions for Palindrome Number.

**/

class Solution {
    public boolean isPalindrome(int x) {
        boolean result=true; 
     
        int reversed=0; 
        int xOld =x; 
    
        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if(xOld<0) 
            result=false; 
        else {
        if(reversed==xOld) {
            result=true; 
        }
        else if (reversed!=xOld) {
            result=false;
        }
        }
        return result; 
    }
}
