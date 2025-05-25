class Solution {
    public int myAtoi(String s) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        s = s.trim();
        if (s.length() == 0) {
            return 0; 
        }
        int sign = 1;  
        int idx = 0; 
        if (s.charAt(0) == '-') {
            sign = -1;
            idx++;
        } else if (s.charAt(0) == '+') {
            idx++; 
        }
        long res = 0;
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            int d = s.charAt(idx) - '0'; 
            if (res > (max - d) / 10) {
                return sign == 1 ? max : min;
            }

            res = res * 10 + d;
            idx++;
        }
        return (int) res * sign;
    }
}
