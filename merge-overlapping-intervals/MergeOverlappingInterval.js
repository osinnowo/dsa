var mergeOverlappingIntervals = (intervals) => {
    const START_TIME = 0; const END_TIME = 1;

    intervals.sort((a, b) => a[START_TIME] - b[START_TIME]);
    let result = []; index = 1; result.push(intervals[index - 1]);

    while(index < intervals.length) {
        let previousIndex = result.length - 1;
        let previous =  result[previousIndex];
        let current = intervals[index];

        let isOverlap = previous[END_TIME] >= current[START_TIME];
        if(isOverlap) {
            previous[END_TIME] = Math.max(current[END_TIME], previous[END_TIME]);
            result[previousIndex] = previous;
            index++; continue;
        }
        result.push(current);
        index++;
    }
    return result;
}

exports.mergeOverlappingIntervals = mergeOverlappingIntervals;