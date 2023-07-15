from typing import List

class HighestAltitude:
    def largestAltitude(self, gain: List[int]) -> int:
        max_altitude = 0
        current_altitude = 0
        
        for altitude_gain in gain:
            current_altitude += altitude_gain
            max_altitude = max(max_altitude, current_altitude)
        
        return max_altitude
