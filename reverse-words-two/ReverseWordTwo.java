class ReverseWordTwo {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        for(int i = 0; i < (words.length /2 ); i++) {
            int lastIndex = words.length - i - 1;
            String temp = words[lastIndex];
            words[lastIndex] = words[i];
            words[i] = temp;
        }
        return String.join(" ", words);
    }
}