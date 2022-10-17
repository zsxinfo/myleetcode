class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) return 0;
        for (int i = len; i > 1; i--) {
            for (int j = 0; j < len - i + 1; j ++) {
                String str = s.substring(j, j + i);
                if (!isRepeat(str)) {
                    return i;
                }
            }
        }
        return 1;
    }
    
    public boolean isRepeat(String s) {
        char[] check = new char[100];
        for (int i = 0; i < 100; i ++) {
            check[i] = 0;
        }
        for (char c: s.toCharArray()) {
            check[c - ' '] += 1;
            if (check[c - ' '] > 1) {
                return true;
            }
        }
        return false;
    }
}

// Time Limit