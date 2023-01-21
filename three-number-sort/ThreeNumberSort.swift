import Foundation

class ThreeNumberSort {
    func threeNumberSort1(_ array: inout [Int], _ order: [Int]) -> [Int] {
        var left = 0
        for index in 0 ..< order.count {
            var right = array.count - 1
            while(left < right) {
                if(array[left] == order[index]) { left += 1; continue ; }
                while(left < right) {
                    if(array[right] == order[index]) {
                        array.swapAt(left, right)
                        left += 1; break;
                    }
                    right -= 1
                }
            }
        }
        return array
    }

    func threeNumberSort1(_ array: inout [Int], _ order: [Int]) -> [Int] {
        var right = array.count - 1
        for index in stride(from: order.count - 1, through: 0, by: -1) {
            var left = 0
            while(left < right) {
                if(array[right] == order[index]) { right -= 1; continue; }
                while(left < right) {
                    if(array[left] == order[index]) {
                        array.swapAt(left, right)
                        right -= 1; break;
                    }
                    left += 1;
                }
            }
        }
        return array
    }
}