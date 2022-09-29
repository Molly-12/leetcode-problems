class Solution(object):
    def convertToBase7(self, num):
      s=''
      copy=num     #create a num copy
      if num==0:
        return '0'
      if num<0:
        num=abs(num)   #if negative number, convert it to positive using the abs function
      while(num>0):
        rem=num%7
        num=num//7
        s=s+str(rem)      #append the answer in the string
      if(num>=0):
        return s[::-1]
      else:
        return '-1'+s[::-1]
