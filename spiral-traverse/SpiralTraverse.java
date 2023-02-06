import java.util.*;
public class SpiralTraverse {
    public Integer[] spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int startColumn = 0, endColumn = array[0].length - 1;
        int startRow = 0, endRow = array.length - 1;
        while(startColumn <= endColumn && startRow <= endRow) {
            for(int column = startColumn; column <= endColumn; column++) {
                result.add(array[startRow][column]);
            }

            for(int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endColumn]);
            }

            for(int column = endColumn - 1; column >= startColumn; column--) {
                if(endRow == startRow) break;
                result.add(array[endRow][column]);
            }

            for(int row = endRow - 1; row > startRow; row--) {
                if(startColumn == endColumn) break;
                result.add(array[row][startColumn]);
            }
            startRow++; endColumn--;
            endRow--; startColumn++;
        }

        return result.toArray(new Integer[0]);
    }
}
