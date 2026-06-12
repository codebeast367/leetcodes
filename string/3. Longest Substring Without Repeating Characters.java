class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n = s.length();
        for(int i=0; i<n; i++){
            boolean[] y = new boolean[128];
            int c = 0;
            for(int j=i; j<n; j++){
                char ch = s.charAt(j);
                if(y[ch]){
                    break;
                }
                y[ch]=true;
                c++;
            }
            max = Math.max(max,c);
        }

            
            
        return max;
    }
}