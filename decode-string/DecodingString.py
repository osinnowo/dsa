class Solution:
    def DecodeString(self, s: str) -> str:
        stack = []
        current_str = ''
        result = ''
        count_str = ''
        
        for c in s:
            if c.isdigit():
                count_str += c
            elif c == '[':
                stack.append(current_str)
                stack.append(count_str)
                current_str = ''
                count_str = ''
            elif c == ']':
                prev_count_str = stack.pop()
                prev_str = stack.pop()
                repeat_count = int(prev_count_str)
                current_str = prev_str + current_str * repeat_count
            else:
                current_str += c
        
        return current_str