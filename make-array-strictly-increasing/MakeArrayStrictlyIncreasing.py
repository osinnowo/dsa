from typing import List
import sys

class MakeArrayStrictlyIncreasing:
    def makeArrayIncreasing(self, arr1: List[int], arr2: List[int]) -> int:
        def dfs(arr1, arr2, prev, index, replacements):
            if index == len(arr1):
                return 0

            key = (prev, index)
            if key in replacements:
                return replacements[key]

            replace_cost = sys.maxsize
            if arr1[index] > prev:
                replace_cost = dfs(arr1, arr2, arr1[index], index + 1, replacements)

            insert_index = binary_search(arr2, prev)
            if insert_index < len(arr2):
                insert_cost = dfs(arr1, arr2, arr2[insert_index], index + 1, replacements) + 1
                replace_cost = min(replace_cost, insert_cost)

            replacements[key] = replace_cost
            return replace_cost

        def binary_search(arr, target):
            left, right = 0, len(arr)
            while left < right:
                mid = left + (right - left) // 2
                if arr[mid] <= target:
                    left = mid + 1
                else:
                    right = mid
            return left

        replacements = {}
        result = dfs(arr1, sorted(set(arr2)), -sys.maxsize, 0, replacements)
        return -1 if result == sys.maxsize else result
