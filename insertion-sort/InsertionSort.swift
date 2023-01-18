import Foundation

class InsertionSort {
    func insertionSort1(_ array: inout [Int]) -> [Int] {
      for i in 1..<array.count {
            var j = i;
            while(j > 0 && array[j] < array[j - 1]) {
                array.swapAt(j, j - 1)
                j -= 1
            }
       }
       return array;
    }

    func insertionSort2(_ array: inout [Int]) -> [Int] {
        for i in stride(from: array.count - 2, through: 0, by: -1){
            var j = i
            while(j <= array.count - 2 && array[j] > array[j + 1]) {
                (array[j], array[j + 1]) = (array[j + 1], array[j])
                j += 1
            }
        }
        return array
    }
 }