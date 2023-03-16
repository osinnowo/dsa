class MissingRanges {
    func findMissingRanges(_ nums: [Int], _ lower: Int, _ upper: Int) -> [String] {
        var missingRanges: [String] = []
        var prev: Int = lower - 1
        
        for i in 0...nums.count {
            let curr: Int = (i == nums.count) ? upper + 1 : nums[i]
            
            if curr - prev >= 2 {
                missingRanges.append(getRange(prev + 1, curr - 1))
            }
            
            prev = curr
        }
        
        return missingRanges
    }
    
    func getRange(_ start: Int, _ end: Int) -> String {
        return (start == end) ? "\(start)" : "\(start)->\(end)"
    }
}