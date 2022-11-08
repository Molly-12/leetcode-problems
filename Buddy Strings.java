class Solution {
    public boolean buddyStrings(String s, String goal) {
      if(s.length()!=goal.length()) return false;
      
      if(s.equals(goal){
        HashSet<Character> unique_word=new HashSet();
        for(char c:s.toCharArray()){
            unique_words.add(c);
        }
        if(unique_word.size()<s.length()){
          return true;
        }
        else{
          return false;
        }
      }
        List<Integer> diff_words=new ArrayList();
         for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=goal.charAt(i)){
             diff_words.add(i);
           }
           
         }
         if(diff_words.size()>2 && s.charAt(diff_words.get(0))==goal.charAt(diff_words.get(1)) && goal.charAt(diff_words.get(0))==s.charAt(diff_words.get(1))){
           return true;
         }
         else{
           return false;
         }
        
    }
}
