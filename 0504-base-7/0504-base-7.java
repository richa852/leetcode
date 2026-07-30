class Solution {
    public String convertToBase7(int num) {
        // Edge case: if num is 0
        if (num == 0) return "0";

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);   // remainder in base 7
            num /= 7;             // reduce number
        }

        if (isNegative) sb.append('-');

        return sb.reverse().toString();
    }
}
