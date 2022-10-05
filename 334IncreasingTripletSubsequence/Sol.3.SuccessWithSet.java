class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        Set<Integer> low1 = new HashSet<>();
        Set<Integer> low2 = new HashSet<>();
        Set<Integer> low3 = new HashSet<>();
        for (int i = 0; i < len; i++) {
            int v = nums[i];
            for (int t : low2) {
                if (v > t) return true;
            }
            for (int t : low1) {
                if (v > t) low2.add(v);
            }            
            low1.add(v); 
        }
        return false;
    }
}