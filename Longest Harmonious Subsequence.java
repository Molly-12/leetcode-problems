class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int el: nums){
            int cFreq=map.getOrDefault(el,0);
            map.put(el,cFreq+1);
        }
        int maxLhs=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int currKey=entry.getKey();
            int freq=entry.getValue();
            int currLHS=0;
            if(map.containsKey(currKey+1)){
                currLHS=freq+map.get(currKey+1);
                
            }
            maxLhs=Math.max(maxLhs,currLHS);
        }
        return maxLhs;
        
    }
}
