class Solution{
  public int numberCompliment(int num){
    int no=0;
    int power=0;
    while(no<num){
      no+=Math.pow(2,power);
      power++;
    }
    return no-num;
  }
}
  
