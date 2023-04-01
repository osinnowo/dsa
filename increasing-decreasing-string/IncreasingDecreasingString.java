class IncreasingDecreasingString {
    public String sortString(String s) {
        // Count the frequency of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Build the sorted string
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            // Append the smallest remaining character(s)
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) ('a' + i));
                    freq[i]--;
                }
            }
            // Append the largest remaining character(s)
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) ('a' + i));
                    freq[i]--;
                }
            }
        }
        
        return sb.toString();
    }
}
