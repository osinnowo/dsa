import Foundation

class MergeOverlappingInterval {
    let START_TIME: Int = 0
    let END_TIME: Int = 1
    func mergeOverlappingIntervals(_ intervals: [[Int]]) -> [[Int]] {
        var interval = intervals.sorted(by: { $0[0] < $1[0] })
        var overlaps: [[Int]] = []
        overlaps.append(interval.first!)
        for index in stride(from: 1, to: interval.count, by: 1) {
        var previous = overlaps.last!
        var current = interval[index]
        let isOverlap = previous[END_TIME] >= current[START_TIME]
        if(isOverlap) {
            overlaps[overlaps.count - 1][1] = max(previous[END_TIME], current[END_TIME])
            continue
        }
        overlaps.append(current)
        }
        return overlaps;
    }
}