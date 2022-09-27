class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        res = ""
        temp = ""
        for i in range(len(s)-1,-1,-1):
            if s[i]!='-':
                temp = s[i].upper()+temp
                if len(temp)==k:
                    res = temp+"-"+res
                    temp = ""
        if len(temp)<k and temp!="":
            res = temp+"-"+res
        return res[:-1]
