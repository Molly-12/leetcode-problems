class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        p = int(len(s)/2)+1
        for i in range(1,p):
            k = int(len(s)/i)
            if s[:i]*k == s and k!=1:
                return True
        return False
        
