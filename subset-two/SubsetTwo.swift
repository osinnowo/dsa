class SubsetTwo {
    func subsetsWithDup(_ nums: [Int]) -> [[Int]] {
        var result: [[Int]] = []
        var currentSubset: [Int] = []
        var sortedNums = nums.sorted()
        backtrack(&result, &currentSubset, sortedNums, 0)
        return result
    }
    
    private func backtrack(_ result: inout [[Int]], _ currentSubset: inout [Int], _ nums: [Int], _ startIdx: Int) {
        result.append(currentSubset)
        
        for i in startIdx..<nums.count {
            if i > startIdx && nums[i] == nums[i-1] {
                continue
            }
            currentSubset.append(nums[i])
            backtrack(&result, &currentSubset, nums, i+1)
            currentSubset.removeLast() 
        }
    }
}
