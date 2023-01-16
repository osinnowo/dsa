public class ReverseWord
{
    public static string reverseWord(string word) 
    { 
        string[] words = word.Split(' ');
        for(int i = 0; i < words.Length / 2; i++) {
            int lastIndex = words.Length - i - 1;
            string temp = words[lastIndex];
            words[lastIndex] = words[i];
            words[i] = temp;
        }
        return string.Join(' ', words);
    }
}