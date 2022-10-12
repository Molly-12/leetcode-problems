class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1;
        int count=1;
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[i+1]){
                count++;
                ans=Math.max(count,ans);
            }
            else{
                count=1;
                
            }
        }
        return ans;
        
    }
}
                             
                             
                             
                             
                             
                             
                             
           
