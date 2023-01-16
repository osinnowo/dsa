public class ReverseWord {
    public static String reverseWord(String word) {
        String[] words = word.split(" ");
        for(int i = 0; i < word.length(); i++) {
            int lastIndex = word.length() - i - 1;
            String temp = words[i];
            words[i] = words[lastIndex];
            words[lastIndex] = temp;
        }
        return String.join(" ", words);
    }
}