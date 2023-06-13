from collections import Counter

class RandomNote:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        # Count the frequencies of characters in the ransom note and magazine
        ransom_counts = Counter(ransomNote)
        magazine_counts = Counter(magazine)

        # Check if the magazine has enough characters to construct the ransom note
        for char, count in ransom_counts.items():
            if magazine_counts[char] < count:
                return False

        return True
