class Solution:
    def ReverseWords(self, s: str) -> str:
        words = s.split(" ")
        words = [word for word in words if word != '']
        for index in range(0, len(words) // 2):
            last_index = len(words) - 1 - index
            temp = words[index]
            words[index] = words[last_index]
            words[last_index] = temp
        return " ".join(words).strip()