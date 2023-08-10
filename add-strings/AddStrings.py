class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        i = len(num1) - 1
        j = len(num2) - 1
        remainder = 0
        carry = 0

        result = ""
        while i >= 0 or j >= 0:
            first = int(num1[i]) if i >= 0 else 0
            second = int(num2[j]) if j >= 0 else 0
            total = first + second + carry

            remainder = total % 10
            carry = total // 10

            result = f"{remainder}{result}"

            if i >= 0:
                i -= 1
            if j >= 0:
                j -= 1
        
        if carry != 0:
            result = str(carry) + result

        return result