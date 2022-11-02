class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
      int n=jewels.size();
      int m=stones.size();
      map<char,int> mp;
      for(int i=0;i<n;i++){
        mp[jewels[i]]=1;
      }
      int res=0;
      for(int i=0;i<m;i++){
        res+=mp[stones[i]];
      }
      return res;
    }
};
