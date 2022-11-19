class Solution{
  public boolean isMonotonic(int[] nums){
    boolean increasing=true;
    boolean decreasing=false;
    
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]>nums[i+1]){
        increasing=false;
      }
      else if(nums[i]<nums[i+1]){
        decreasing=false;
      }
    }
    return increasing|| decreasing
  }
}
