class MergeAlternately:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = ""
        i, j = 0, 0
        while i < len(word1) and j < len(word2):
            if i == j or i < j:
                result += word1[i]
                i += 1
            else:
                result += word2[j]
                j += 1

        while i < len(word1):
            result += word1[i]
            i += 1

        while j < len(word2):
            result += word2[j]
            j += 1

        return result