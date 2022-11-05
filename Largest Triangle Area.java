class Solution {
   public double largestTriangleArea(int[][] pointer) {
     double res=0;
     for(int i[]:pointer){
       for(int j[]:pointer){
         for(int k[]:pointer){
           res=Math.max(res,0.5*Math.abs(i[0]*j[1]+j[0]*k[1]+k[0]+i[1]-j[0]*i[1]-k[0]*j[1]-i[0]*k[1]));
         }
       }
     }
     return res;
   }
}
                
             
    
