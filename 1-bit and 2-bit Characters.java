class Solution {
    public boolean isOneBitCharacter(int[] bits) {
      int i=0;
      int n=bits.length-1;
      
      while(i<n){
        if(bits[i]==1){
          i=i+2;
        }
        else{
          i=i+1;
        }
      }
      return i==n;
    }
}
