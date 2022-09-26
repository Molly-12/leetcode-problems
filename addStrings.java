class Solution {
    public String addStrings(String num1, String num2) {
        String res="";
        int it1=num1.length()-1;
        int it2=num2.length()-1;
        int carry=0;
        int sum=0;
        while(it1>=0 && it2>=0){
            int d1=num1.charAt(it1)-'0';
            int d2=num2.charAt(it2)-'0';
            sum=d1+d2+carry;
            carry=sum/10;
            sum=sum%10;
            res=sum+res;
            it1--;
            it2--;
        }
        while(it1>=0){
            int d1=num1.charAt(it1)-'0';
            sum=d1+carry;
            carry=sum/10;
            sum=sum%10;
            res=sum+res;
            it1--;
        }
        
        while(it2>=0){
            int d2=num2.charAt(it2)-'0';
            sum=d2+carry;
            carry=sum/10;
            sum=sum%10;
            res=sum+res;;
            it2--;
            
        }
        if(carry==1){
            res='1'+res;
        }
        return res;
    }
}
