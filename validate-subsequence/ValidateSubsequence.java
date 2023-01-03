import java.util.*;

public class ValidateSubsequence {
    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        int count = 0;
        int index = 0;
        while(index < array.size()) {
            if(sequence.size() == count) break;
            if(array.get(index).equals(sequence.get(count))) { count++; }
            index++;
        }
        return sequence.size() == count;
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int count = sequence.size() - 1;
        int index = array.size() - 1;
        while(index >= 0) {
            if(count == -1) break;
            if(array.get(index).equals(sequence.get(count))){ count--; }
            index--;
        }
        return count == -1;
    }

    public static boolean isValidSubsequence3(List<Integer> array, List<Integer> sequence) {
        Deque<Integer> numbers = new ArrayDeque<>(sequence);
        int index = 0;
        while(index < array.size()) {
            if(numbers.isEmpty()) break; 
            if(array.get(index).equals(numbers.getFirst())) { numbers.removeFirst(); }
          index++;
        }
        return numbers.isEmpty();
    }

    public static boolean isValidSubsequence4(List<Integer> array, List<Integer> sequence) {
        Deque<Integer> numbers = new ArrayDeque<>(sequence);
        int index = array.size() - 1;
        while(index >= 0) {
            if(numbers.isEmpty()) break;
            if(array.get(index).equals(numbers.getLast())) { numbers.removeLast(); }
            index--;
        }
        return numbers.isEmpty();
    }

    public static boolean isValidSubsequence5(List<Integer> array, List<Integer> sequence) {
        Stack<Integer> stack = new Stack<>(); stack.addAll(sequence);
        int index = 0;
        while(index < array.size()) {
            if(stack.isEmpty()) break;
            if(array.get(array.size() - index - 1).equals(stack.peek())) { stack.pop(); }
            index++;
        }
        return stack.isEmpty();
    }
}
