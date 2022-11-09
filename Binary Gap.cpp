class Solution {
public:
    int binaryGap(int n) {
      int last=-1;
      int ans=0;
      
      for(int i=0;i<32;i++){
        if(n&(1<<i)){
          if(last==-1)
            last=i;
          else{
            ans=max(ans,last-i);
            last=i;
          }
        }
      }
      return ans;
      
    }
};
