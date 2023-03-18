class CombinationSum {
    func combinationSum(_ candidates: [Int], _ target: Int) -> [[Int]] {
        var result = [[Int]]()
        var path = [Int]()
        backtrack(candidates.sorted(), target, 0, &path, &result)
        return result
    }
    
    private func backtrack(_ candidates: [Int], _ target: Int, _ start: Int, _ path: inout [Int], _ result: inout [[Int]]) {
        if target < 0 {
            return
        }
        if target == 0 {
            result.append(path)
            return
        }
        for i in start..<candidates.count {
            let candidate = candidates[i]
            if candidate <= target {
                path.append(candidate)
                backtrack(candidates, target - candidate, i, &path, &result)
                path.removeLast()
            }
        }
    }
}
