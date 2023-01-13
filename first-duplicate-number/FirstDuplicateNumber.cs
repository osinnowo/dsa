using System;
using System.Collections.Generic;

public class FirstDuplicateNumber {
    public static int FirstDuplicateNum(int[] array) {
        Dictionary<int, int> dictionary = new Dictionary<int, int>();
        int index = 0;
        while(index < array.Length) {
            int current = dictionary.GetValueOrDefault(array[index]);
            if(current == 1) { return array[index]; }
            dictionary.Add(array[index], dictionary.GetValueOrDefault(array[index]) + 1);
            index++;
        }
        return -1;
    }

    public static int FirstDuplicateNum(int[] array) {
        HashSet<int> set = new HashSet<int>();
        foreach(var arr in array) {
            if(set.Contains(arr)) { return arr; }
            set.Add(arr);
        }
        return -1;
    }
}