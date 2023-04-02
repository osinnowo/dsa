using System.Collections.Generic;

public class StackQueue {

    private List<int> list = new List<int>();

    public MyStack() {}
    
    public void Push(int x) {
        this.list.Add(x);
    }
    
    public int Pop() {
        int index = this.list.Count - 1;
        int item = this.list[index];
        this.list.RemoveAt(index);
        return item;
    }
    
    public int Top() {
        return this.list[list.Count - 1];
    }
    
    public bool Empty() {
        return this.list.Count == 0;
    }
}