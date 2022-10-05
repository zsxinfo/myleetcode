class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        int vi = 0;
        int vj = nums[0];
        int vk = nums[1];
        for (int t = 2; t < len; t++) {
            vi = vj;
            vj = vk;
            vk = nums[t];
            if (vi < vj && vj < vk) {
                return true;
            }
        }
        return false;
    }
}

// Wrong understanding of the problem.
// i j k no need to be continuous.