class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        char[] arr= s.toCharArray();
        int sc =0;
        for(int i=0;i<n-1;i++){
            int ascii = (int) arr[i];
            int brr = (int) arr[i + 1];
            sc += Math.abs(ascii-brr);
            
        }
        return sc;
    }
}