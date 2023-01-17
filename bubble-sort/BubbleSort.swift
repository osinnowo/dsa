import Foundation

class BubbleSort {
    func bubbleSort(_ array: inout [Int]) -> [Int] {
        var isSorted: Bool = false
        while(!isSorted) {
            isSorted = true
            var index = 1
            while(index < array.count) {
                if(array[index - 1] > array[index]) {
                    isSorted = false
                    (array[index - 1], array[index]) = (array[index], array[index - 1])
                }
                index += 1
            }
        }
        return array
    }

    func bubbleSort2(_ array: inout [Int]) -> [Int] {
        var isSorted: Bool = false
        while(!isSorted){
            isSorted = true
            var index = 0
            while(index < array.count - 1) {
                if(array[index] > array[index + 1]) {
                    isSorted = false
                    array.swapAt(index, index + 1)
                }
                index += 1
            }
        }
        return array
    }
}