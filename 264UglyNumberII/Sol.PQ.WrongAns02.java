class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> ugly = new ArrayList<Integer>();
        ugly.add(1);
        int ugl = 1;
        PriorityQueue<Integer> ug = new PriorityQueue<Integer>();
        for (int i = 1; i < n; i += 1) {
            if (ugl*2 > 0) ug.add(ugl*2); // problem: integer overflow can not be detect by if(x*y > 0)
            if (ugl*3 > 0) ug.add(ugl*3);
            if (ugl*5 > 0) ug.add(ugl*5);
            while (ugly.contains(ugl)) {
                ugl = ug.poll();
            }
            ugly.add(ugl);
        }
        return ugl;
    }
}

// goes wrong with Input:1600 Output:267821216 Expected:1399680000