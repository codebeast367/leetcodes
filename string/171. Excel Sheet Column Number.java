class Solution {
    public int titleToNumber(String columnTitle) {
        int o =0;
        for(int i=0; i<columnTitle.length(); i++){
            char c = columnTitle.charAt(i);
            o= o*26+(c-'A'+1);
        }
        return o;
    }
}