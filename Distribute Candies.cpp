class solution{
  public:
    int distributeCandies(vector<int>& candyType) {
      set<int>s;
      int n=candyType.size();
      for(auto i: candytype){
        s.insert(i);
      }
      int m= s.size();
      return min(n/2,m);
    }
}
