class Solution {
    public String toLowerCase(String s) {
      char c[]=s.toCharArray();
      for(int i=0;i<s.length;i++){
        if(c[i]>="A" && c[i]<="Z"){
          c[i]=(char)(c[i]+32);
        }
      }
      return new String(c);
    }
]
