class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.rbegin(),g.rend());  //descending order sorting
        sort(s.rbegin(),g.rend());
        int total=0;
        int curr=0;
        int n=g.size();
        int m=s.size();
        for(int i=0;i<n;i++){
            if(curr<m && g[i]<=s[curr]){
                total++;
                curr++;
            }
        }
        return total;
        
    }
};
