import Foundation

class SelectionSort {
    func selectionSort1(_ array: inout [Int]) -> [Int] {
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

    func selectionSort2(_ array: inout [Int]) -> [Int] {
        for i in stride(from: array.count - 1, through: 0, by: -1) {
            var largestIndex = i
            var j = i + 1
            while(j >= 0) {
                if(array[largestIndex] < array[j]) { largestIndex = j }
                j -= 1 
            }
            (array[largestIndex], array[i]) = (array[i], array[largestIndex])
        }
        return array;
    }
}