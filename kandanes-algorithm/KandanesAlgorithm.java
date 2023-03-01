public class KandanesAlgorithm {
    public static int kadanesAlgorithm(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        for(int i = 1; i < array.length; i++) {
            int num = array[i];
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
      }
}
