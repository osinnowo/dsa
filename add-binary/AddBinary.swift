/**
 * MIT License
 *
 * Copyright (c) 2023 Osinnowo Emmanuel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do 
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.                                
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS 
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.      
 *
 *   
 * ============================ 
 * Description:
 * ============================
 * 67. Add Binary
 *
 * Given two binary strings a and b, return their sum as a binary string:
 * 
 * Example I:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example II:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 **/

import Foundation

class AddBinary {
    func addBinary(_ a: String, _ b: String) -> String {
        var result = String()
        var i = a.count - 1
        var j = b.count - 1
        var carryOver = 0
        while(i >= 0 || j >= 0 || carryOver > 0) {
            let sum = (i >= 0 ? 
            Int(String(a[a.index(a.startIndex, offsetBy: i)]))! : 0) + (j >= 0 ? 
            Int(String(b[b.index(b.startIndex, offsetBy: j)]))! : 0) + carryOver
            result = String(sum % 2) + result
            carryOver = sum / 2
            i -= 1; j -= 1;
        }
        return result
    }
}