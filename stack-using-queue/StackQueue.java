import java.util.*;

public class StackQueue {

    private List<Integer> list = new ArrayList<Integer>();

    public StackQueue() {}
    
    public void push(int x) {
        this.list.add(x);
    }
    
    public int pop() {
        int index = this.list.size() - 1;
        int item = this.list.get(index);
        this.list.remove(index);
        return item;
    }
    
    public int top() {
        return this.list.get(list.size() - 1);
    }
    
    public boolean empty() {
        return this.list.isEmpty();
    }
}