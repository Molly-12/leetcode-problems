class Solution {
public:
  bool selfDivide(int num){
    int x=num;
    int curr=0;
    while(num>0){
      curr=num%10;
      if(curr==0) return false;
      if(x%curr!=0) return false;
      num=num/10;
    }
    return true;
  }
  vector<int> selfDividingNumbers(int left, int right) {
    vector<int> res;
    for(int i=left;i<=right;i++){
      if(selfDivide(i))
        res.push_back(i);
    }
    return res;
  }
}
    
