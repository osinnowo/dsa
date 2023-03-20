class MinimumWaitingTime{
    func minimumWaitingTime(_ queries: inout [Int]) -> Int {
        queries.sort()
        var totalWaitingTIme = 0
        for(idx, duration) in queries.enumerated() {
            let queriesLeft = queries.count - (idx + 1)
            totalWaitingTIme += duration * queriesLeft
        }
        return totalWaitingTIme
    }
}