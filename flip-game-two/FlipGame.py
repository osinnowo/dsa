class Solution:
    def canWin(self, currentState: str) -> bool:
        # Base case: If there are no valid moves, the current player cannot win.
        if '++' not in currentState:
            return False
        
        # Check all possible moves
        for i in range(len(currentState) - 1):
            if currentState[i:i+2] == '++':
                # Make the move by flipping the '++' to '--'
                nextState = currentState[:i] + '--' + currentState[i+2:]
                # Recursively check if the opponent cannot win from this nextState
                if not self.canWin(nextState):
                    return True
        
        # If no winning moves are found, the current player cannot win
        return False
