function selectionSort(array) {
    let i = 0;
    const length = array.length;
    while(i < length) {
      let smallestIndex = i;
      let j = i + 1;
      while(j < length){
        if(array[smallestIndex] > array[j]) { smallestIndex = j; }
        j++;
      }
      [array[smallestIndex], array[i]] = [array[i], array[smallestIndex]];
      i++;
    }
    return array;
  }
  
  exports.selectionSort = selectionSort;