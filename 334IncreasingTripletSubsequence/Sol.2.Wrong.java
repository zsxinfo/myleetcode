class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        int low1 = nums[0];
        int low2 = Integer.MAX_VALUE;
        int low3 = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            int v = nums[i];
            if (v < low1) {
                low3 = Integer.MAX_VALUE;
                low2 = Integer.MAX_VALUE;
                low1 = v;
            } else {
                if (v < low2) {
                    low2 = v;
                    low3 = Integer.MAX_VALUE;
                } else {
                    if (v < low3) {
                        low3 = v;
                    }
                }
            }
            
        }
        if (low3 != Integer.MAX_VALUE) return true;
        return false;
    }
}

// [20,100,10,12,5,13] test fail
// didn't consider 5!