from typing import Dict

class GreatestCommonDivisor:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""
        
        gcd_length = self.calculate_gcd(len(str1), len(str2))
        return str1[:gcd_length]
    
    def calculate_gcd(self, a: int, b: int) -> int:
        if b == 0:
            return a
        return self.calculate_gcd(b, a % b)
