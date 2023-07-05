from typing import Dict, List

class UniqueOccurence:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count_map = {}
        for num in arr:
            if num in count_map:
                count_map[num] += 1
            else:
                count_map[num] = 1
        occurrence_set = set(count_map.values())
        return len(occurrence_set) == len(count_map)