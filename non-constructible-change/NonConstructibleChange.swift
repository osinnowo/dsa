import Foundation 
class NonConstructibleChange {
    func nonConstructibleChange(_ coins: [Int]) -> Int {
        coins.sort()
        var result = 0
        for index in 0 ..< coins.count {
            if((result + 1) < coins[index]) { break }
                result += coins[index]
        }
        return result + 1
    }
}