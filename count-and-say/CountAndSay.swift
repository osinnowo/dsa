class CountAndSay {
    func countAndSay(_ n: Int) -> String {
        var term = "1"
        for _ in 1..<n {
            var nextTerm = ""
            var currentDigit = term[term.startIndex]
            var currentCount = 0
            for digit in term {
                if digit == currentDigit {
                    currentCount += 1
                } else {
                    nextTerm += "\(currentCount)\(currentDigit)"
                    currentDigit = digit
                    currentCount = 1
                }
            }
            nextTerm += "\(currentCount)\(currentDigit)"
            term = nextTerm
        }
        return term
    }
}
