import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> possibleMoves = new ArrayList<>();
        
        for (int i = 0; i < currentState.length() - 1; i++) {
            if (currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+') {
                String nextState = currentState.substring(0, i) + "--" + currentState.substring(i + 2);
                possibleMoves.add(nextState);
            }
        }
        
        return possibleMoves;
    }
}
