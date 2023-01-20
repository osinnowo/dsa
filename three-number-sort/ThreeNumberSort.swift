import Foundation

class ThreeNumberSort {
    func threeNumberSort(_ array: inout [Int], _ order: [Int]) -> [Int] {
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
}