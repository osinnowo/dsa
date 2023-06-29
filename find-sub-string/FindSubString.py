from typing import List
from collections import Counter

class FindSubstring:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        if not s or not words:
            return []

        word_length = len(words[0])
        total_words = len(words)
        substring_length = word_length * total_words

        word_count = Counter(words)

        result = []
        for i in range(len(s) - substring_length + 1):
            substring = s[i:i+substring_length]
            substring_words = [substring[j:j+word_length] for j in range(0, substring_length, word_length)]
            substring_count = Counter(substring_words)

            if substring_count == word_count:
                result.append(i)

        return result
