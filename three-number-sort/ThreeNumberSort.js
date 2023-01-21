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

var threeNumberSort = (array, order) => {
    let right = array.length - 1;
    for(let i = order.length - 1; i > -1; i--) {
        let left = 0;
        while(left < right) {
            if(array[right] === order[i]) { right--; continue; }
            while(left < right) {
                if(array[left] === order[i]) {
                    [array[left], array[right]] = [array[right], array[left]];
                    right--; break;
                }
                left++;
            }
        }
    }
    return array;
}
exports.threeNumberSort = threeNumberSort;