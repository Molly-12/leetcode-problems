class Solution {
public:
    int longestPalindrome(string s) {
        int freq[256];
        for(int i=0;i<s.size();i++)
            freq[i]++;
        int count=0;
        int odd=0;
        for(int i=0;i<freq;i++)
            count+=2*(i/2);
            if(i%2==1)
                odd=1;
        return count+odd;
        
        
    }
};
