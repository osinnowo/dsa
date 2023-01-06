import Foundation

class NonDuplicate {
    func nonDuplicate(array: inout [Int]) -> [Int] {
        array.sort()
        var results: [Int] = []
        var i = 0
        while (i < array.count) {
            var j = i + 1
            var distinctIndex = i
            while(j < array.count) {
                if(array[distinctIndex] == array[j]) {
                    distinctIndex = j
                }
                j += 1
            }
            results.append(array[distinctIndex])
            i = distinctIndex
            i += 1
        }
        return results
    }
}