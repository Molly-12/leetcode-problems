class Solution {
    public String toGoatLatin(String sentence) {
      HashSet<Character> vowels=new HashSet();
      for(char c:"aeiouAEIOU".toCharArray()){
        vowels.add(c);
      }
  
      String res="";
      int index=1;
      for(String word:sentence.split("\\s")){
        res+=" ";
      }
      char first_letter=word.charAt(0);
      if(vowels.contains(first_letter)){
        res+=word+"ma";
      }
      else{
        res+=word.substring(1)+first_letter+"ma";
      }
      for(int i=0;i<index;i++){
        res+="a";
      }
      index++;
    }
      return res;
    }
}
