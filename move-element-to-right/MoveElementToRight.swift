import Foundation

class MoveElementToRight {
    func moveElementToRight(array: inout [Int], elementToMove: Int) -> [Int] {
        var left = 0
        var right = array.count - 1
        while(left < right) {
            if(array[left] != elementToMove) { left += 1; continue; }
            while(left < right) {
                if(array[right] != elementToMove) {
                    (array[left], array[right]) = (array[right], array[left])
                    left += 1; right -= 1;
                    break
                }
                right -= 1
            }
        }
        return array
    }

    func moveElementToRight2(array: inout [Int], elementToMove: Int) -> [Int] {
        var left = 0
        var right = array.count - 1
        while(left < right) {
            while(left < right && array[left] != elementToMove) { left += 1 }
            while(left < right && array[right] == elementToMove) { right -= 1}
            array.swapAt(left, right)
            left += 1; right -= 1;
        }
        return array
    }

    func moveElementToRight3(array: inout [Int], elementToMove: Int) -> [Int] {
        var result = [Int]()
        for element in array {
            if(element == elementToMove) {
                result.append(element); continue
            }
            result.insert(element, at: 0)
        }
        return result
    }
}