class Solution {
    public boolean makesquare(int[] nums) {
      if(nums.length<4) return false;
      int peri=0;
      for(int el:nums){
        peri+=el;
      }
      int side=peri/4;
      int[] sides=new int[] {side,side,side,side};
      return helper(nums,0,sides);
        
    }
    private void helper(int[]nums,int i,int[] sides){
      if(i==nums.length)
        return sides[0]==0 && sides[1]==0 && sides[2]==0 && sides[3]==0;
      for(int j=0;j<4;j++){
        if(nums[i]>sides[j]) continue;
        sides[j]-=nums[i];
        if(helper(nums,i+1,sides)) return true;
        sides[j]+=nums[i];
      }
    }
  return false;
  
  
}
