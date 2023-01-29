import Foundation

class RotateArray {
    func rotateArray1(_ array: [Int], _ times: Int) -> [Int] {
        var result = [Int]()
        var count = 0

        for index in stride(from: times, to: array.count, by: 1) {
            result.append(array[index])
            count += 1
        }

        for index in stride(from: 0, to: times, by: 1) {
            result.append(array[index])
            count += 1
        }

        return result
    }

    func rotateArray2(_ array: inout [Int], _ times: Int) -> [Int] { 
        for _ in 0 ..< times {
            var firstItem: Int = array.first!
            for j in 0 ..< array.count - 1 {
                array[j] = array[j + 1]
            }
            array[array.count - 1] = firstItem
        }
        return array
    }

    func rotateArray3(_ array: inout [Int], _ times: Int) -> [Int] {
        var i = 0
        while(i < times) {
            var firstItem: Int = array.first!
            for j in 0 ..< array.count - 1 {
                array[j] = array[j + 1]
            }
            array[array.count - 1] = firstItem
            i += 1
        }
        return array
    }
}