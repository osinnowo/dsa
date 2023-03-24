class ContainsDuplicateTwo {
     func containsNearbyDuplicate(_ nums: [Int], _ k: Int) -> Bool {
        var set: Set<Int> = []
        for i in 0 ..< nums.count {
            if(set.contains(nums[i])){ return true }
            set.insert(nums[i])
            if(set.count > k) {
                set.remove(nums[i - k])
            }
        }
        return false   
    }
}