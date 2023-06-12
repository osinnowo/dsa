class FindTheDifference:
    def findTheDifference(self, s: str, t: str) -> str:
        char_count = {}
        
        # Count the occurrences of each character in string s
        for char in s:
            if char in char_count:
                char_count[char] += 1
            else:
                char_count[char] = 1
        
        # Subtract the count of each character in string t
        # If a character count becomes negative or not present, it means that character is the difference
        for char in t:
            if char in char_count:
                char_count[char] -= 1
                if char_count[char] == 0:
                    del char_count[char]
            else:
                return char

        # If no difference found, return an empty string or handle it based on your requirements
        return ""