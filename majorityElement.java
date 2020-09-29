/* 
Runtime: 1 ms, faster than 99.92% of Java online submissions for Majority Element.
Memory Usage: 42.5 MB, less than 92.97% of Java online submissions for Majority Element.
*/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
