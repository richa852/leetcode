class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII chars
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int length = 0;
        boolean oddExists = false;
        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddExists = true;
            }
        }
        return oddExists ? length + 1 : length;
    }
}
