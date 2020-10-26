package minstack;

import sun.jvm.hotspot.types.CIntegerField;

import java.util.Stack;

public class MinMaxStack{

    private String stackType=null;

    Stack<Integer> main;
    Stack<Integer> temp;


    public MinMaxStack( String typeOfStack) {

         this.main=new Stack<Integer>();
        this.temp=new Stack<Integer>();
        this.stackType=typeOfStack;
    }

    public void push(int input) {
        main.push(input);
        if (stackType.equalsIgnoreCase("MIN")){
        if (temp.isEmpty() || main.peek() < temp.peek()) {
            temp.push(input);
        }
    }
    else {
            if (temp.isEmpty() || main.peek() > temp.peek()) {
                temp.push(input);
            }

        }

    }

    public void pop(){

        if(!main.isEmpty()) {
            if (main.peek() == temp.peek()) {
                //remove from both
                temp.pop();
            }
            main.pop();
        }else{
                System.out.println("no any element");
            }
        }



    public int getMin(){
        if(!temp.isEmpty())
            return temp.pop();
        else return -1;


    }


}
