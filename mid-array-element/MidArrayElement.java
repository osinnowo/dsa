public class MidArrayElement {
    public int midArrayElement(int[] array) {
        int slow = 0, fast = 0;
        while(slow < array.length && ++fast < array.length) {
            slow++; fast++;
        }
        return array[slow];
    }
}
