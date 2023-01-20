var threeNumberSort = (array, order) => {
    let left = 0;
    for(const num of order) {
        let right = array.length - 1;
        while(left < right) {
            if(array[left] === num) { left++; continue; }
            while(right > left) {
                if(array[right] === num) {
                    [array[right], array[left]] = [array[left], array[right]];
                    left++; break; 
                }
                right--;
            }
        }
    }
    return array;
}

exports.threeNumberSort = threeNumberSort;