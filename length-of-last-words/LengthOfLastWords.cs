public class LengthOfLastWords {
    public int LengthOfLastWord1(string word) {
        int end = word.Length - 1;
        
        while(end >= 0 && Char.IsWhiteSpace(word[end])) {
            end--;
        }

        int left = end;
        while(left >= 0 && !Char.IsWhiteSpace(word[left])) {
            left--;
        }

        return end - left;
    }
    // " Hello World"
    public int LengthOfLastWord1(string word) {
        List<string> list = new List<string>();
        int index = -1;
        for(int i = 0; i < word.Length; i++) {
            if(Char.IsWhiteSpace(word.Substring(i, i + 1))) {
                if(index != -1) {
                    list.Add(word.Substring(index, i));
                    index = -1;
                }
                continue;
            }
            index = i;
        }
        if(index != -1) {
            list.Add(word.Substring(index, word.Length));
        }
        return list[list.Count - 1].Length;
    }
}

