class Solution {
    public boolean checkRecord(String s) {
      int count_a=0;
      int count_l=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='A'){
            count_a++;
            count_l=0;
          }
          else if(s.charAt(i)=='L'){
            count_l++;
          }
        else{
          count_l=0;
        }
        if(count_a==2){
          return false;
        }
        if(count_l>=3){
          return false;
        }
       
      }
      return true;
    
    }
}
