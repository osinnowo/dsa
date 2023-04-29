class MultiplyString {
    func multiply(_ num1: String, _ num2: String) -> String {
        var result = Array(repeating: 0, count: num1.count + num2.count)
        
        let digits1 = num1.map { Int(String($0))! }
        let digits2 = num2.map { Int(String($0))! }
        
        for i in (0..<digits1.count).reversed() {
            for j in (0..<digits2.count).reversed() {
                let product = digits1[i] * digits2[j]
                let sum = product + result[i+j+1]
                
                result[i+j] += sum / 10
                result[i+j+1] = sum % 10
            }
        }
        
        while result.count > 1 && result.first! == 0 {
            result.removeFirst()
        }
        
        return result.map { String($0) }.joined()
    }
}
