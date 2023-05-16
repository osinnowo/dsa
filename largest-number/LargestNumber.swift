class LargestNumber {
    func largestNumber(_ nums: [Int]) -> String {
        var maxNumber = ""
        var number = ""
        for num in nums {
            number.append(String(num))
        }
        var visited = Array(repeating: false, count: number.count)
        backtrack(number, &maxNumber, &visited)
        return maxNumber
    }

    func backtrack(_ number: String, _ max: inout String, _ visited: inout [Bool]) {
        if number > max {
            max = number
        }

        let digits = Array(number)
        for i in 0..<digits.count {
            if visited[i] {
                continue
            }
            visited[i] = true
            for j in 0..<digits.count {
                if visited[j] {
                    continue
                }
                var temp = digits
                temp.swapAt(i, j)
                let newNumber = String(temp)
                backtrack(newNumber, &max, &visited)
            }
            visited[i] = false
        }
    }

}