/*Given an integer value N, indicates number of bits in a binary number.

Your task is to design a Binary Code System, where two consecutive values
in BCS having N bits, must have one bit difference only.


Find and print the integer values of BCS, starting from 0.
*/


import java.util.*;

class Solution {
	public List bcs(int n) 
	{
        List <String> al = grayCode(n);
        List <Integer> ans = new ArrayList<Integer>();

		
        for (String s : al) {
            ans.add(Integer.parseInt(s, 2));
        }
        return ans;
	}

    public List<String> grayCode(int n) {
		List <String> bresult = new ArrayList<String>();
        if (n == 0) {
            bresult.add("0");
            return bresult;
        }
		else if(n == 1)
		{
			bresult.add("0");
			bresult.add("1");
			return bresult;
		}

		

        List lst = grayCode(n - 1);
        List<String> al = new ArrayList<String>();

	
        for (int i = 0; i < lst.size(); i++) {
            al.add("0" + lst.get(i));
        }

		

        for (int i = lst.size() - 1; i >= 0; i--) {
            al.add("1" + lst.get(i));
        }
        
	

        return al;
    }

	
}
