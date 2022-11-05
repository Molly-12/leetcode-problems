class Solution {
    public int[] numberOfLines(int[] widths, String s) {
      int result[]=new int[2];
      int l_width=1;
      int width=0;
      
      for(char c:s.toCharArray()){
        int word_width=widths[c-'a'];
        if(word_width + width >100){
          l_width++;
          width=0;
        }
        width=word_width;
      }
      result[0]=l_width;
      result[1]=width;
      return result;
    }
}
