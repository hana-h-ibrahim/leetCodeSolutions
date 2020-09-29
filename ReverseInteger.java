// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
// Memory Usage: 36.5 MB, less than 90.90% of Java online submissions for Reverse Integer.


class Solution {
    public int reverse(int x) {
        boolean isNumberNegative=false;  
        if (x>=0) 
            isNumberNegative = false; 
        else {
            isNumberNegative=true; 
               x= Math.abs(x); 
        }
        
        long reversed=0; 
        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
                 
        if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE)
            return 0;
            x /= 10;
        }
   
            
         if (isNumberNegative==false) 
            reversed = reversed; 
        else 
            reversed = reversed *-1;
        
            
        return (int) reversed; 
    }
}
