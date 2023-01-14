function zeroSumSubArray2(array) {
    if(array.length === 1 && array[0] === 0) { return true; }
    for(let index = 1; index < array.length; index++) {
        let leftIndex = index - 1;
        let sum = 0;
        while(leftIndex >= 0) {
            let leftSum = array[leftIndex] + array[index];
            if(leftSum === 0) { return true; }
            sum += leftSum;
            leftIndex--;
        }

        let rightIndex = index + 1;
        while(rightIndex < array.length) {
            let rightSum = array[rightIndex] + array[index];
            if(rightSum === 0) { return true; }
            sum += rightSum;
            rightIndex++;
        }

        if(sum === 0) { return true; }
    }

    return false;
}

function zeroSumSubArray2(array) {
    const set = new Set();
    let summation = 0;
    for(const num of array) {
        summation += num;
        if(num === 0 || summation === 0 || set.has(summation)) return true;
        set.add(summation)
    }
    return false;
}

exports.zeroSumSubArray = zeroSumSubArray1;