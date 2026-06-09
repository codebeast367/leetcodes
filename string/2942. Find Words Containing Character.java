class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> z = new ArrayList<>();
         
         int n = words.length;
         for(int i=0; i<n; i++){
         int e = words[i].length();
         for(int j=0; j<e; j++){
            if(words[i].charAt(j) == x){
                z.add(i);
                break;
                

            }
         }
    
     }
      return z;
    }
   
}