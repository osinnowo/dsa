var arrayOfProducts = (array) => {
    let result = [];
    for(let i = 0; i < array.length; i++) {
        let temp = 1;
        for(let j = 0; j < array.length; j++) {
            if(i === j) continue;
            temp *= array[j];
        }
        result[i] = temp;
    }
    return result;
}

exports.arrayOfProducts = arrayOfProducts;