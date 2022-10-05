class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char p = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = p;
        }
    }
}

/* Runtime: 2 ms, faster than 41.03% of Java online submissions for Reverse String.
	Memory Usage: 55.2 MB, less than 41.93% of Java online submissions for Reverse String.
*/