class Solution {
public:
    int projectionArea(vector<vector<int>>& grid) {
      int n=grid.size();
      int ans=0;
      for(int i=0;i<n;++i){
        int bestrow=0;
        int bestcol=0;
        for(int j=0;j<n;++j){
          if(grid[i][j]>0){
            ans++;
          }
          bestrow=max(bestrow,grid[i][j]);
          bestcol=max(bestcol,grid[j][i]);
        }
        ans+=bestrow+bestcol;
          
      
      }
      return ans;
    }
};
      
