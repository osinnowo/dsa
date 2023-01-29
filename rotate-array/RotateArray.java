import java.util.*;

public class RotateArray { 
    public int[] rotateArray1(int[] array, int times) {
        int[] result = new int[array.length];
        int count = 0;
        
        for(int i = times; i < array.length; i++) {
           result[count] = array[i];
           count++;
        }

        for(int j = 0; j < times; j++) {
            result[count] = array[j];
            count++;
        }

        return result;
    }

    public int[] rotateArray2(int[] array, int times) {
        int k = 1;
        while(k <= times) {
            int firstItem = array[0];
            for(int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = firstItem;
            k++;
        }
        return array;
    }
}