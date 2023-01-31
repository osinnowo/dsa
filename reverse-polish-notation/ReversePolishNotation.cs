using System;
using System.Collections.Generic;

public class ReversePolishNotation {
    public int ReversePolishNotations(string[] notations) 
    {
        Stack<int> stack = new Stack<int>();
        string operators = "+-*/";
        int result = 0;
        foreach (string notation in notations)
        {
            if (!operators.Contains(notation))
            {
                stack.Push(int.Parse(notation)); continue;
            }
            int first = stack.Pop();
            int second = stack.Pop();
            int index = operators.IndexOf(notation);

            switch (index)
            {
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
                    break;
            }

            stack.Push(result);
        }
        return result;
    }
}