using System.Collections.Generic;

public class MyQueue {
    private List<int> list = new List<int>();

    public MyQueue() {
        
    }
    
    public void Push(int x) {
        list.Add(x);
    }
    
    public int Pop() {
        int item = this.list[0];
        this.list.RemoveAt(0);
        return item;
    }
    
    public int Peek() {
        return this.list[0];
    }
    
    public bool Empty() {
        return this.list.Count == 0;
    }
}