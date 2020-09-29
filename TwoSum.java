/**

Runtime: 1 ms, faster than 99.95% of Java online submissions for Two Sum.
Memory Usage: 38.8 MB, less than 99.85% of Java online submissions for Two Sum.

**/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0;i<nums.length;i++) {
            int rem = target - nums[i];            
            if (map.containsKey(rem) && map.get(rem) !=i) 
                return new int[] { i, map.get(rem)};    
            map.put(nums[i], i);
        }
        return result; 
    }
}
