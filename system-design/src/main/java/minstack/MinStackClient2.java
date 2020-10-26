package minstack;

public class MinStackClient2 {
    public static void main(String[] args) {

        MinStackUsingMinHeap minStack= new MinStackUsingMinHeap();
        minStack.push(5);
        minStack.push(9);
        minStack.push(1);
        minStack.push(4);

        System.out.println(minStack.getMin());
       minStack.pop();

        minStack.pop();

        System.out.println(minStack.getMin());

    }


}
