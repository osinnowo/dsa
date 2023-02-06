function spiralTraverse(array) {
    const result = [];
    let startColumn = 0;
    let endColumn = array[0].length - 1;
    let startRow = 0;
    let endRow = array.length - 1;
    while(startColumn <= endColumn && startRow <= endRow) {
       for(let column = startColumn; column <= endColumn; column++) {
         result.push(array[startRow][column]);
       }
  
       for(let row = startRow + 1; row <= endRow; row++) {
         result.push(array[row][endColumn]);
       }
  
       for(let column = endColumn - 1; column >= startColumn; column--) {
         if(startRow === endRow) break;
         result.push(array[endRow][column]);
       }
  
       for(let row = endRow - 1; row > startRow; row--) {
         if(startColumn === endColumn) break;
         result.push(array[row][startColumn]);
       }
      
       startRow++; endRow--;
       startColumn++; endColumn--;
    }
    return result;
  }
  
  exports.spiralTraverse = spiralTraverse;