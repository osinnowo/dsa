import Foundation

class SelectionSort {
    func selectionSort(_ array: inout [Int]) -> [Int] {
        for i in 0 ..< array.count {
            var j = i + 1
            var smallestIndex = i
            while(j < array.count) {
                if(array[smallestIndex] > array[j]) { smallestIndex = j }
                j += 1  
            }
            array.swapAt(i, smallestIndex)
        }
        return array
    }
}