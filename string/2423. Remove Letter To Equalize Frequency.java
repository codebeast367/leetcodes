class Solution {
    public boolean equalFrequency(String word) {
        int n=word.length();
        int[] f = new int[26];
        
        for(int i=0; i<n; i++){
           int d= word.charAt(i) - 'a';
           f[d]=f[d]+1;
        }
        for (int i=0; i<26; i++) {

            if (f[i] == 0) {
                continue;
            }
            f[i]--;
            int v = 0;
            boolean b = true;
            for (int j = 0; j < 26; j++) {

                if (f[j]==0) {
                    continue;
                }

                if (v==0) {
                    v=f[j];
                } 
                else if (f[j]!=v) {
                    b=false;
                    break;
                }
            }
            f[i]++; 
            if (b){
                return true;
            }
    }
    return false;

    
}
}