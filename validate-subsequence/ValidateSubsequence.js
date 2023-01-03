function isValidSubsequence1(array, sequence) {
    let count = 0;
    for (let index = 0; index < array.length; index++) {
        if(sequence.length === count) break;
        if(array[index] === sequence[count]) { count++; }
    }
    return sequence.length == count;
  }

  function isValidSubsequence2(array, sequence) {
    let count = sequence.length - 1;
    for(let index = 0; index < array.length; index++) {
        if(count === -1) break;
        if(array[array.length - 1 - index ] === sequence[count]) {
            count--;
        }
    }
    return count === -1;
  }

  function isValidSubsequence3(array, sequence) {
    for(let index = 0; index < array.length; index++) {
        if(sequence.length === 0) break
        if(array[array.length - 1 - index ] === sequence[sequence.length - 1]) {
           sequence.pop();
        }
    }
    return sequence.length === 0;
  }

  function isValidSubsequence4(array, sequence) {
    for(let index = 0; index < array.length; index++) {
        if(sequence.length === 0) break
        if(array[index] === sequence[0]) {
           sequence.shift();
        }
    }
    return sequence.length === 0;
  }

  exports.isValidSubsequence = isValidSubsequence4;