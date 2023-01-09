public class MinimumDifferencePair{
    public static List<int[]> MinimumDifferencePair(int[] array)
    {
        Array.Sort(array);
        int minimumDifference = array[1] - array[0];
        List<int[]> results = new List<int[]>();
        for (int i = 2; i < array.Length; i++)
        {
            minimumDifference = Math.Min(minimumDifference, array[i] - array[i - 1]);
        }
        for (int i = 1; i < array.Length; i++)
        {
            if ((array[i] - array[i - 1]) == minimumDifference) { results.Add(new int[] { array[i], array[i - 1] }); }
        }
        return results;
    }
}