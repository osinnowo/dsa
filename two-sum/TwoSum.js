function twoNumberSum1(array, targetSum) {
    for(let i = 0; i < array.length; i++) {
      for(let j = 0; j < array.length; j++) {
        if(i === j) continue;
        if(array[i] + array[j] === targetSum) { return [ array[i], array[j] ]; }
      }
    }
    return [];
  }

function twoNumberSum2(array, targetSum) {
  for(let i = 0; i < array.length; i++) {
    for(let j = i + 1; j < array.length; j++) {
      if(array[j] + array[i] === targetSum) {
        return [ array[i], array[j] ];
      }
    }
  }
  return [];
}

function twoNumberSum3(array, targetSum) {
    const set = new Set();
    for(const num of array) {
      let difference = targetSum - num;
      if(set.has(difference)) { return [ num, difference ]; }
      set.add(num)
    }
    return [];
}

function twoNumberSum4(array, targetSum) {
    const map = new Map();
    for(const num of array) {
      let difference = targetSum - num;
      if(map.has(difference)) {
        return [ difference, map.get(difference) ]
      }
      map.set(num, difference)
    }
    return [];
}

function twoNumberSum(array, targetSum) {
    array.sort((a, b) => a - b);
    var left = 0;
    var right = array.length - 1;
    while(left < right) {
      var sum = array[left] + array[right];
      if(sum == targetSum) {
        return [ array[left], array[right] ];
      } else if (sum < targetSum) {
        left++;
      } else {
        right--;
      }
    }
    return [];
}

exports.twoNumberSum = twoNumberSum;