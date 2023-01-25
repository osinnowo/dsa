using System;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Array.Sort(arrayOne);
        Array.Sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int smallest = int.MaxValue;
        int current = int.MaxValue;
        int[] result = new int[2];
        while(idxOne < arrayOne.Length && idxTwo < arrayTwo.Length) {
            int first = arrayOne[idxOne];
            int second = arrayTwo[idxTwo];
            if(first < second) {
                current = second - first;
                idxOne++;
            } else if (second < first) {
                current = first - second;
                idxTwo++;
            } else {
                return new int[] { first, second };
            }
            if(current < smallest) {
                smallest = current;
                result = new int[]{ first, second };
            }
        }
        return result;
    }
}
