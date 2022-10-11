class Solution {
public:
    bool judgeCircle(string moves) {
      int hor=0;
      int ver=0;
      for(auto i: moves){
        if(i=='U')
          ver++;
        if(i=='D')
          ver--;
        if(i=='R')
          hor++;
        else
          hor--;
      }
      return hor==0 && ver==0;
    }
};
