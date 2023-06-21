public class MergeAlternatively {
    public string MergeAlternately(string word1, string word2) {
        StringBuilder sb = new StringBuilder();
        
        int i = 0, j = 0;

        while(i < word1.Length && j < word2.Length){
            if(i == j) {
                sb.Append(word1[i]); i += 1;
            } else {
                  sb.Append(word2[j]); j += 1;
            }
        }

        while(i < word1.Length) {
            sb.Append(word1[i]);
            i += 1;
        }

        while(j < word2.Length) {
            sb.Append(word2[j]);
            j += 1;
        }

        return sb.ToString();
    }
}