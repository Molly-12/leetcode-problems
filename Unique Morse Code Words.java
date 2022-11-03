class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      Set<String>decodedStr=new HashSet<>();
      String[] morseCode=new String[]{
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
      for(String word:words){
        StringBuilder str=new StringBuilder();
        for(char c:word.toCharArray()){
          int index=c-'a';
          str.append(morseCode[index]);
        }
        decodedStr.add(str.toString);
      }
      return decodedStr.size();
    }
}
      
            
        
