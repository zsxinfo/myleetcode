class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> ugly = new ArrayList<Integer>();
        ugly.add(1);
        int ugl = 1;
        PriorityQueue<Integer> ug = new PriorityQueue<Integer>();
        for (int i = 1; i < n; i += 1) {
            long x = ugl*2l;
            if (x < Integer.MAX_VALUE)  ug.add(ugl*2);
            x = ugl*3l;
            if (x < Integer.MAX_VALUE)  ug.add(ugl*3);
            x = ugl*5l;
            if (x < Integer.MAX_VALUE)  ug.add(ugl*5);
            while (ugly.contains(ugl)) {
                ugl = ug.poll();
            }
            ugly.add(ugl);
        }
        return ugl;
    }
}

// Runtime: 2643 ms, faster than 5.03% of Java online submissions for Ugly Number II.
// Memory Usage: 58.8 MB, less than 16.53% of Java online submissions for Ugly Number II.