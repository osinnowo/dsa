import Foundation 

class SpiralTraverse {
    func spiralTraverse(_ array: [[Int]]) -> [Int] {
        var result: [Int] = []
        var startColumn = 0, endColumn = array[0].count - 1
        var startRow = 0, endRow = array.count - 1

        while startColumn <= endColumn, endRow >= startRow {
            for column in stride(from: startColumn, through: endColumn, by: 1) {
                result.append(array[startRow][column])
            }

            for row in stride(from: startRow + 1, through: endRow, by: 1) {
                result.append(array[row][endColumn])
            }

            for column in stride(from: endColumn - 1, through: startRow, by: -1) {
                if startRow == endRow { break }
                result.append(array[endRow][column])
            }

            for row in stride(from: endRow - 1, to: startRow, by: -1) {
                if startColumn == endColumn { break }
                result.append(array[row][startColumn])
            }

            startRow += 1; endRow -= 1
            startColumn += 1; endColumn -= 1
        }
        return result
    }
}