class Solution {
    public int maxDistinct(String s) {
        boolean[] y= new boolean[26];
        int c = 0;
        int n=s.length();
        for(int i=0; i<n; i++){
            int x= s.charAt(i)-'a';
            if(!y[x]){
            y[x] = true;
            c++;
        }
        }
        return c;
    }
}