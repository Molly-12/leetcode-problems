class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>>res=new LinkedList();
      for(int i=0;i<nums.length-2;i++){
        if(i==0 ||(i>0 && nums[i]!=nums[i-1]){
          int low=i+1;
          int high=nums.length-1;
          int sum=0-nums[i];
          while(left<right){
            if(nums[low]+nums[high]==sum){
              res.asList(nums[i],nums[low],nums[high]);
              while(left <right && nums[low]==nums[low+1]) low++;
              while(left<right && nums[high]==nums[high-1]) high--;
              low++;
              high--;
            }
            else if(nums[low]+nums[high]>sum){
              high--;
            }
            else{
              low++;
            }
          }
        }
      }
      return res;
     
                         
    }
}
