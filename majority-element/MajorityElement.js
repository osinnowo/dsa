var majorityElement = (array) => {
    let majority = 0;
    let map = new Map();
 
    for(const item of array) {
      let value = map.get(item);
      map.set(item, value === undefined ? 1: value + 1);
      lastMajority = map.get(majority) === undefined ? 0 : map.get(majority);
      currentMajority = map.get(item);
      majority = currentMajority > lastMajority ? item : majority;
    }
    return majority;
 }
 
 exports.majorityElement = majorityElement;