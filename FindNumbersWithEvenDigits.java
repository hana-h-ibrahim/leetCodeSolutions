// Runtime: 1 ms, faster than 95.62% of Java online submissions for Find Numbers with Even Number of Digits.
// Memory Usage: 38.2 MB, less than 99.94% of Java online submissions for Find Numbers with Even Number of Digits.

class Solution {
    public int findNumbers(int[] nums) {
    int result=0;
        
        for(int i=0;i<nums.length;i++) {
            int length = (int) (Math.log10(nums[i]) + 1);

            if(length%2==0)
                result++;
        }
        
    return result; 
    }
}
