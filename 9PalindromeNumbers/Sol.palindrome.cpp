class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) return false;
        long num = x;
        long reverse_value = 0;
        long reminder = 0;
        while (num != 0) {
            reminder = num % 10;
            reverse_value = reverse_value * 10 + reminder;
            num = num / 10;
        }
        return reverse_value == x;
    }
};