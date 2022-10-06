class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i += 1) {
            for (int j = i + 1; j < nums.length; j += 1) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        
        return result;
    }
}