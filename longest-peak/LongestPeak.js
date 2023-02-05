function longestPeak(array) {
    let longestPeak = 0;
    let index = 1;
    while(index < array.length - 1) {
      let isPeak = array[index - 1] < array[index] && array[index] > array[index + 1];
      if(!isPeak) {
        index++;
        continue;
      }
  
      let leftIndex = index - 2;
      while(leftIndex >= 0 && (array[leftIndex] < array[leftIndex + 1])) {
         leftIndex--;
      }
  
      let rightIndex = index + 2;
      while(rightIndex < array.length && (array[rightIndex] < array[rightIndex - 1])) {
        rightIndex++;
      }
  
      longestPeak = Math.max(longestPeak, (rightIndex - leftIndex - 1));
      index = rightIndex
    }
    return longestPeak;
  }

exports.longestPeak = longestPeak;
  