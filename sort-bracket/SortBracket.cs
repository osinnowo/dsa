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
        char[] characters = str.ToCharArray();
        int left = 0;
        int right = characters.Length - 1;
        while(left < right) {
            if(characters[left] == '(') { left++; continue; }
            while(left < right) {
                if(characters[right] == '(') {
                    char temp = characters[right];
                    characters[right] = characters[left];
                    characters[left] = temp;
                    left++; right--;
                    break;
                }
                right--;
            }
        }
        return new String(characters);
    }
}