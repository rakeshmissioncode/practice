package minstack;

public class MinMaxStackClient {

    public static void main(String[] args) {

        MinMaxStack minStack= new MinMaxStack();

       // minStack.push(5);
        minStack.push(9);
        minStack.push(1);
        minStack.push(4);

        System.out.println(minStack.getMin());
        minStack.pop();

        minStack.pop();

        System.out.println(minStack.getMin());

    }
}
