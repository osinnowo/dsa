from typing import Dict
from collections import Counter

def majorityElement(array):
    counter = Counter(array)
    majority = -1

    for (key, value) in counter.items():
        if counter[key] > counter.get(majority, 0):
            majority = key
        
    return majority
    
    
def majorityElement1(array):
    bucket: Dict[int: int] = {}
    majority = -1

    for item in array:
        if item not in bucket:
            bucket[item] = 1
        else:
            bucket[item] = bucket[item] + 1

        last = 0 if majority not in bucket else bucket[majority]
        current = bucket[item]
        majority = item if current > last else majority
    
    return majority