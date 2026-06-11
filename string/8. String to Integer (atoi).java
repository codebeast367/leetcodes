class Solution {
    public int myAtoi(String s) {

        long u = 0;
        int g = 1;
        int i = 0;
        int n = s.length();

    
        for (; i < n && s.charAt(i) == ' '; i++);

    
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                g = -1;
            }
            i++;
        }

    
        for (; i < n; i++) {

            char c = s.charAt(i);

            if (!Character.isDigit(c)) {
                break;
            }

            u = u * 10 + (c - '0');

            if (g == 1 && u > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (g == -1 && -u < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        int w = (int)(g*u);

        return w;
    }
}