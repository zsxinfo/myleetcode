class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reminder = 0;
        int reverse_value = 0;
        int num = x;
        while (num != 0) {
            reminder = num % 10;
            reverse_value = reverse_value * 10 + reminder;
            num = num / 10;
        }
        return reverse_value == x;
    }
}