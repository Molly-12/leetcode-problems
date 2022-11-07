class Solution {
    public boolean backspaceCompare(String s, String t) {
      int s_pointer=s.length()-1;
      int t_pointer=t.length()-1;
      int t_skip=0;
      int s_skip=0;
      
      while(s_pointer>==0 || t_pointer>=0){
        while(s_pointer>=0){
          if(s.charAt(s_pointer)=='#'){
            s_skip++;
            s_pointer--;
          }
          else if(s_skip>0){
            s_skip--;
            s_pointer--;
          }
          else{
            break;
          }
        }
        while(t_pointer>=0){
          if(t.charAt(t_pointer)=='#'){
            t_skip++;
          }
          else if(t_skip>0){
            t_skip--;
            t_pointer--;
          }
          else{
            break;
          }
        }
        if(s_pointer>=0 && t_pointer>=0 && s.charAt(s_pointer)!=t.charAt(t_pointer)){
          return false;
        }
        if((s_pointer>=0)!= t_pointer>=0){
          return false;
          s_pointer--;
          t_pointer--;
      }
        return true;
    }
}

            
          
          
          
   
