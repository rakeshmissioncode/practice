package minstack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinStackUsingMinHeap {

    List<Integer> list = new ArrayList<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue();
    public void MinStack() {

    }

    public void push(int x) {
        minHeap.offer(x);
        list.add(x);
    }

    public void pop() {
        Integer topValue = list.get(list.size() - 1);
        minHeap.remove(topValue);
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minHeap.peek();
    }
}
