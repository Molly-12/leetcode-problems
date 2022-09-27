class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        int count=duration;
        for(int i=0;i<n-1;i++){
            int min=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
            count+=min;
        }
        return count;
        
    }
}
