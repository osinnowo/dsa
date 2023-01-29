import java.util.*;

public class ReversePolishNotation {
    public int reversePolishNotation(String[] notations) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;
        String operators = "+-*/";

        for(String notation: notations) {
            if(!operators.contains(notation)) {
                stack.push(Integer.valueOf(notation));
                continue;
            }

            int first = stack.pop();
            int second = stack.pop();

            int index = operators.indexOf(notation);
            switch(index) {
                case 0:
                    result = first + second;
                    break;
                case 1:
                    result = first - second;
                    break;
                case 2:
                    result = first * second;
                    break;
                default:
                    result = first / second;
            }
            stack.push(result);
        }
        return result;
    }
 }