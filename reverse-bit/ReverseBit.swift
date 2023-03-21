class ReverseBit {
    func reverseBits(_ n: Int) -> Int {
        var result = 0
        var n = n
        for i in 0..<32 {
            result <<= 1
            result |= n & 1
            n >>= 1
        }
        return result
    }
}
