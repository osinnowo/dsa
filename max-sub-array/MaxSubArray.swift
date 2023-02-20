/**
 * Maximum Sub-Array:                                              
 * This is a Swift implementation of the maximum subarray algorithm. It takes an 
 * array of integers as input and returns the sum of the contiguous subarray with 
 * the largest sum.
 *
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
 */

import Foundation {
    class MaxSubArray {
        func maxSubArray(_ nums: [Int]) -> Int {
            var maxSoFar = nums[0]
            var maxEndingHere = nums[0]
            for index in stride(from: 1, to: nums.count, by: 1) {
                maxEndingHere = max(maxEndingHere + nums[index], nums[index])
                maxSoFar = max(maxSoFar, maxEndingHere)
            }
            return maxSoFar
        }
    }
}