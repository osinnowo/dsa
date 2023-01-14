import Foundation

class ZeroSumSubArray {
    func zeroSumSubArray1(_ array: [Int]) -> Bool {
        if(array.count == 1 && array.first! == 0) { return true }
        for index in stride(from: 1, to: array.count, by: 1) {
            var sum = 0
            var leftIndex = index - 1;
            while(leftIndex >= 0) {
                var leftSum = array[leftIndex] + array[index]
                if(leftSum == 0) { return true }
                sum += leftSum
                leftIndex -= 1
            }

            var rightIndex = index + 1;
            while(rightIndex < array.count) {
                var rightSum = array[rightIndex] + array[index]
                if(rightSum == 0) { return true }
                sum += rightSum
                rightIndex += 1
            }

            if(sum == 0) { return true }
        }
        return false
    }

    func ZeroSumSubArray2(_ array: [Int]) -> Bool {
        var set: Set<Int> = []
        var summation = 0
        for num in array {
            summation += num
            if(num == 0 || summation == 0 || set.contains(summation)) { return true }
            set.insert(summation)
        }
        return false
    }
}