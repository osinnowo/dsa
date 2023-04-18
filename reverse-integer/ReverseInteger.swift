class ReverseInteger {
    func reverse(_ x: Int) -> Int {
        var isNegative = x.signum() == -1
        var converted = String(abs(x))
        var digit = ""
        for character in converted where character.isNumber {
            digit = "\(character)\(digit)"
        }
        if let reversed = Int(digit) {
            if isNegative {
                if reversed > Int(Int32.max) + 1 {
                    return 0
                }
                return -reversed
            } else {
                if reversed > Int(Int32.max) {
                    return 0
                }
                return reversed
            }
        }
        return 0
    }
}