class ReverseVowel:
    def reverseVowels(self, s: str) -> str:
        vowel = ['a', 'e', 'i', 'o', 'u']
        characters = list(s)
        left = 0
        right = len(characters) - 1
        while left < right:
            while left < right and characters[left].lower() not in vowel:
                left += 1

            while left < right and characters[right].lower() not in vowel:
                right -= 1

            [characters[left], characters[right]] = [characters[right], characters[left]]    
            left += 1
            right -= 1        
        return "".join(characters)