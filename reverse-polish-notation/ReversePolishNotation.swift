import Foundation

class ReversePolishNotation {
    func reversePolishNotation(_ notations: [String]) -> Int {
        var result = 0;
        var stack = [Int]()
        var operators = "+-*/"
        for notation in notations {
            if !operators.contains(notation) {
                stack.append(Int(notation)!); continue
            }
            var first = stack.popLast()!
            var second = stack.popLast()!

            var `operator`: Character = operators[operators.firstIndex(of: Character(notation))!]

            switch `operator` {
                case "+":
                    result = first + second
                case "-":
                    result = first - second
                case "*":
                    result = first * second
                default:
                    result = first / second
            }
            stack.append(result)
        }
        return result;
    }
}