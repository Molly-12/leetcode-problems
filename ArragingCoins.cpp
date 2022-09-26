class Solution {
public:
    int arrangeCoins(int n) {
        int r_count=0;
        while(n>0){
            r_count++;
            n=n-r_count;
        }
        if(n==0)
            return r_count;
        return r_count-1;
    }
};
