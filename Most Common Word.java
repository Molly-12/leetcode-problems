class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
      HashSet<String> banned_words=new HashSet();
      HashMap<String,Integer> valid_words=new HashMap();
      for(String word:banned_words){
        banned_words.add(word);
      }
      String[] count=paragraph.toLowerCase().split("\\W+");
      for(String word:count){
        if(!banned_words.contains(word)){
          valid_words.put(word,valid_words.getOrDefault(word,0)+1);
        }
      }
      int max=0;
      int result="";
      for(String word:valid_words.keySet()){
        if(valid_words.get(word)>max){
          max=valid_words.get(word);
          result=word;
        }
      }
      return result;
    
    }
}
