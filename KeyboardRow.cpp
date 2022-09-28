class Solution {
public:
    bool check(char c,string s){
        for(auto i :s)
            if(i==c) return true;
        return false;
    }
    vector<string> findWords(vector<string>& words) {
        vector<string> vec={"qwertyuiop","asdfghjkl","zxcvbnm"};
        vector<string>ans;
        for(int i=0;i<words.size();i++){
            for(int j=0;j<3;j++){
                bool found=true;
                for(int k=0;k<words[i].size();k++){
                    if(!check(tolower(words[i][k]),vec[j])) found=false;
                }
                
                if(found){
                ans.push_back(words[i]);
                break;
                }
            }
        }
            
            
        
    
        return ans;
        
    }
};
