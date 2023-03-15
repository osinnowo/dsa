class RotateArrayRight {
    func rotate(_ nums: inout [Int], _ k: Int) {
        let n = nums.count
        if n == 0 || k % n == 0 {
            return
        }
        
        let k = k % n
        
        // Helper function to reverse elements in the array
        func reverse(_ nums: inout [Int], _ start: Int, _ end: Int) {
            var start = start
            var end = end
            while start < end {
                nums.swapAt(start, end)
                start += 1
                end -= 1
            }
        }
        
        // Reverse the entire array
        reverse(&nums, 0, n - 1)
        // Reverse the first k elements
        reverse(&nums, 0, k - 1)
        // Reverse the remaining n - k elements
        reverse(&nums, k, n - 1)
    }

    func rotate1(_ nums: inout [Int], _ k: Int) {
        for _ in stride(from: 0, to: k, by: 1) {
            var firstItem = nums.last!
            for index in stride(from: nums.count - 2, through: 0, by: -1) {
               nums[index + 1] = nums[index]
            }
            nums[0] = firstItem
        }
    }
}