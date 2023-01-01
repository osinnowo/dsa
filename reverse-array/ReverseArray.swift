import Foundation

class ReverseArray {
    func reverseArray(array: inout [Int]) -> [Int] {
       var result: [Int] = array
       for index in stride(from: array.count - 1, through: 0, by: -1) {
            result[index] = array[array.count - index - 1]
       }
       return result
    }

    func reverseArray2(array: inout [Int]) -> [Int] {
        for index in 0..< array.count / 2 {
            let lastIndex = array.count - 1 - index
            let temp = array[lastIndex]
            array[lastIndex] = array[index]
            array[index] = temp
        }
        return array
    }

    func reverseArray3(array: inout [Int]) -> [Int] {
        var left = 0
        var right = array.count - 1
        while(left < right) {
            let temp = array[left]
            array[left] = array[right]
            array[right] = temp;
            left += 1; right -= 1;
        }
        return array
    }
}