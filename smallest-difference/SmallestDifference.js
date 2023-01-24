function smallestDifference(arrayOne, arrayTwo) {
    arrayOne.sort((a, b) => a - b);
    arrayTwo.sort((a, b) => a - b);
    let idxOne = 0;
    let idxTwo = 0;
    let minimumValue = Infinity;
    let result = [];
    while(idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
      let current = Infinity;
      let numOne = arrayOne[idxOne];
      let numTwo = arrayTwo[idxTwo];
      if(numOne < numTwo) {
        current = numTwo - numOne;
        idxTwo++;
      } else if (numTwo < numOne) {
        current = numOne - numTwo;
        idxOne++;
      } else {
        return [numOne, numTwo];
      }
      if(minimumValue > current) {
        minimumValue = current
        result = [ numOne, numTwo ]
      }
    }
    return result;
  }

  exports.smallestDifference = smallestDifference;