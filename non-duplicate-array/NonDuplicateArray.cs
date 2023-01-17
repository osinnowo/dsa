using System;
using System.Collections.Generic;

public class NonDuplicateArray {
    public static int[] NonDuplicate(int[] array) {
        Array.Sort(array);
        List<int> results = new List<int>();
        for (int i = 0; i < array.Length; i++)
        {
            int distinctIndex = i;
            bool isDuplicated = false;
            for (int j = i + 1; j < array.Length; j++)
            {
                if(isDuplicated && array[distinctIndex] != array[j]) { break; }
                if (array[distinctIndex] == array[j])
                {
                    distinctIndex = j;
                    isDuplicated = true;
                }
            }
            results.Add(array[distinctIndex]);
            i = distinctIndex;
        }
        return results.ToArray();
    }

    public static int[] NonDuplicate2(int[] array) {
        HashSet<int> set = new HashSet<int>();
        int index = 0;
        while(index < array.Length) {
            set.Add(array[index]);
            index++;
        }
        return set.ToArray();
    }

    public static int[] NonDuplicate3(int[] array) {
        HashSet<int> set = new HashSet<int>(array); return set.ToArray();
    }
}