class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;          //perform a xor opertion on x and y
        int bitCount=0;
        for(int i=0;i<32;i++){  //iterating through 32 bit index
            if((xor>>i &1)==1){   //performing right shift and then do 'and' with 1
                bitCount++;       //if ans==1... increment the counter
            }
        }
        return bitCount;        //return counter
          
    }
}
