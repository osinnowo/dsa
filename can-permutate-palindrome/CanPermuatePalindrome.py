from typing import Dict
from collections import Counter

class CanPermutatePalindrome:
    #aab -> True
    #aabcc
    def canPermutePalindrome(self, s: str) -> bool:
        character_counts = Counter(s)
        odd_count = 0
        
        for count in character_counts.values():
            if count % 2 != 0:
                odd_count += 1
                if odd_count > 1:
                    return False
        
        return True