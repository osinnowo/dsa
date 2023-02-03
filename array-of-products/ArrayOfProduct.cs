using System;

public class ArrayOfProducts {
    public int[] ArrayOfProduct(int[] array) {
        int[] result = new int[array.Length];
        for(int i = 0; i < array.Length; i++){
            int temp = 1;
            for(int j = 0; j < array.Length; j++) {
                if(i == j) continue;
                temp *= array[j];
            }
            result[i] =  temp;
        }
        return result;
    }
}