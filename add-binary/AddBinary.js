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

var addBinary = function(a, b) {
    let result = "";
    let carryOver = "0";
    let i = a.length - 1;
    let j = b.length - 1;
    while(i >= 0 || j >= 0) {
        let num1 = parseInt(a[i] === undefined ? "0" : a[i]);
        let num2 = parseInt(b[j] === undefined ? "0" : b[j]);
        let sum =  num1 + num2 + parseInt(carryOver);
        let actualResult = sum % 2;
        carryOver = String(Math.floor(sum / 2));
        result = actualResult + result;
        i--; j--;
    }
    result = parseInt(carryOver) > 0 ? carryOver + result : result;
    return result;
};