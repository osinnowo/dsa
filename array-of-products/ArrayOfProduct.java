public class ArrayOfProduct{
    public int[] arrayOfProducts(int[] array) {
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int temp = 1;
            for(int j = 0; j < array.length; j++) {
                if(i == j) continue;
                temp = temp * array[j];
            }
            result[i] = temp;
        }
        return result;
    }
}