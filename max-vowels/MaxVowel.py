class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = set('aeiouAEIOU')
        max_vowels_count = 0
        current_vowels_count = 0

        for i in range(k):
            if s[i] in vowels:
                current_vowels_count += 1

        max_vowels_count = current_vowels_count

        for i in range(k, len(s)):
            if s[i - k] in vowels:
                current_vowels_count -= 1
            if s[i] in vowels:
                current_vowels_count += 1
            max_vowels_count = max(max_vowels_count, current_vowels_count)

        return max_vowels_count
