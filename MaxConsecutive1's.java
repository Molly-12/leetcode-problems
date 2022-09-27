class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==1){
                nums[i]+=nums[i-1];
                }
            maxCount=Math.max(maxCount,nums[i]);
        }
        return maxCount;
        
    }
}
