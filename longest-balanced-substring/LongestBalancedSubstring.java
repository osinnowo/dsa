import java.util.*;

class LongestBalancedSubstring {
  
  public int longestBalancedSubstring(String string) {
    int maxLength = 0;
    Stack<Integer> idxStack = new Stack<>();
    idxStack.push(-1);
    for(int i = 0; i < string.length(); i++) {
      if(string.charAt(i) == '(') {
        idxStack.push(i);
      } else {
        idxStack.pop();
        if(idxStack.size() == 0) {
          idxStack.push(i);
        } else {
          int balancedSubstringStartIdx = idxStack.peek();
          int currentLength = i - balancedSubstringStartIdx;
          maxLength = Math.max(maxLength, currentLength);
        }
      }
    }
    return maxLength;
  }
}