function minimumDifference(array) {
    array.sort((a, b) => a - b);
    let results = [];
    let difference = array[1] - array[0];
    
    for(let i = 2; i < array.length; i++) {
        difference = Math.min(difference, (array[i] - array[i - 1]));
    }
    
    for(let j = 1; j < array.length; j++) {
        if(difference === (array[j] - array[j - 1])) {
            results.push([array[j], array[j - 1]]);
        }
    }
    return results;
}

exports.minimumDifference = minimumDifference;