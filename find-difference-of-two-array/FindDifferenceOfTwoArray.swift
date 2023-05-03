class FindDifferenceOfTwoArray {
    func findDifference(_ nums1: [Int], _ nums2: [Int]) -> [[Int]] {
        var array1 = Array(Set(nums1)).sorted()
        var array2 = Array(Set(nums2)).sorted()
        var result1 = [Int](), result2 = [Int]()
        var i = 0, j = 0;
        
        while (i < array1.count || j < array2.count) {
            let num1 = (i < array1.count) ? array1[i] : nil
            let num2 = (j < array2.count) ? array2[j] : nil

            guard let num1 = num1, let num2 = num2 else { break }

            if(num1 == num2) { i += 1; j += 1; continue } 

            if(num1 < num2) {
                result1.append(num1)
                i += 1
            } else {
                result2.append(num2)
                j += 1
            }
        }

        while(i < array1.count) {
            result1.append(array1[i])
            i += 1
        }

        while(j < array2.count) {
            result2.append(array2[j])
            j += 1
        }

        return[ result1, result2 ]
    }
}