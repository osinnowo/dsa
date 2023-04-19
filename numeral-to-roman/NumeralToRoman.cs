public class NumeralToRoman {
    public string IntToRoman(int num) {
        string[] symbols = { "M",  "CM", "D","CD", "C","XC", "L", "XL",  "X",  "IX", "V", "IV", "I" };
        int[] values =    { 1000, 900, 500, 400, 100,  90,  50,  40,    10,     9,   5,    4, 1 } ;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.Length; i++) {
            while(num >= values[i]) {
                sb.Append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.ToString();
    }

    public SortedDictionary<int, string> getRomans() {
        SortedDictionary<int, string> dictionary = new SortedDictionary<int, string>();
        dictionary.Add(1000, "M");
        dictionary.Add(900, "CM");
        dictionary.Add(500, "D");
        dictionary.Add(400, "CD");
        dictionary.Add(100, "C");
        dictionary.Add(90, "M");
        dictionary.Add(50, "M");
        dictionary.Add(40, "M");
        dictionary.Add(10, "M");
        dictionary.Add(9, "M");
        dictionary.Add(5, "M");
        dictionary.Add(4, "M");
        dictionary.Add(1, "M");
        return dictionary;
    }
}