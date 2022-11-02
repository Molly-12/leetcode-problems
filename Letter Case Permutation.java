class Solution {
    public List<String> letterCasePermutation(String s) {
      List<String> l=new ArrayList<>();
      if(s.length()==0){
        return l;
      }
      helper(s.toCharArray(),l,0);
      return l;
    }
    private void helper(char[] str,List<String> l,int index){
      if(index==str.length){
        l.add(new String(str));
        return l;
      }
      if(Character.isDigit(str[index])){
        helper(str,l,index+1);
        return;
      }
      else{
        str[index]=Character.toUpperCase(str[index])
          helper(str,l,index+1);
        str[index]=Character.toLowerCase(str[index])
          helper(str,l,index+1);
      }
    }
}
          
        
    
  
  
