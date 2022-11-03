public class Solution{
  public boolean rotateStrings(String s,String goal){
    return (s.length()==goal.length() && (s+s).contains(goal))
    }
}
