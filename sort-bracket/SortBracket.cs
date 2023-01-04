using System;
using System.Collections.Generic;

public class SortBracket {
    public static string SortedBracket(string str) {
        LinkedList<char> linkedList = new LinkedList<char>();
        foreach(char word in str) {
            if(word == ')') {
                linkedList.AddLast(')');
                continue;
            }
            linkedList.AddFirst('(');
        }
        return new String(linkedList.ToArray());
    }

    public static string SortedBracket(string str) {
        int index = 0;
        while(index < str.Length) {
            
        }
    }
}