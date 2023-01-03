using System;
using System.Collections.Generic;

public class ValidateSubsequence {
    public static bool IsValidSubsequence(List<int> array, List<int> sequence) {
        int index = 0;
        int count = 0;
        while(index < array.Count) {
            if(sequence.Count == count) { break; }
            if(array[index].Equals(sequence[count])) {
                count++;
            }
            index++;
        }
        return sequence.Count == count;
    }

    public static bool IsValidSubsequence5(List<int> array, List<int> sequence) {
        Stack<int> stack = new Stack<int>(sequence);
        int index = 0;
        while(index < array.Count) {
            if(stack.Count == 0) { return true; }
            if(array[array.Count - 1 - index].Equals(stack.Peek())) { stack.Pop(); }
            index++;
        }
        return stack.Count == 0;
    }

    public static bool IsValidSubsequence5(List<int> array, List<int> sequence) { 
        Queue<int> queue = new Queue<int>(sequence);
        int index = 0;
        while (index < array.Count)
        {
            if (queue.Count == 0) { return true; }
            if (array[index].Equals(queue.Peek())) { queue.Dequeue(); }
            index++;
        }
        return queue.Count == 0;
    }
}