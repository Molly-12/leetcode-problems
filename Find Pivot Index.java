class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, temp = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; temp += nums[i++])
            if (nums[i]==total-2*temp) return i;
        return -1;
    }
}
