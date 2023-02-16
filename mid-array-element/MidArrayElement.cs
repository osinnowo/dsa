public class MidArrayElement
{
    public int MidArrayElements(int[] array) 
    {
        int slow = 0, fast = 0;
        while(slow < array.Length && ++fast < array.Length) {
            slow++; fast++;
        }
        return array[slow];
    }
}