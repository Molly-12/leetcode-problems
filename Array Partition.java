class Solution{
  public int arraySum(int[] nums){
    Arrays.sort(nums);
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
      sum+=nums[i];
    }
    return sum;
  }
}
