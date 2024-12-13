package org.miu.lesson9.problem2;

public class Main {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        System.out.println("Peeking: "+myStack.peek());
        System.out.println("Popping: "+myStack.pop());
        myStack.push("God is good");
        System.out.println("Peeking: "+myStack.peek());
        myStack.push("Again, I say God is good");
        System.out.println("Peeking: "+myStack.peek());
        myStack.push("There may be troubles in life. Worry less and they will be popped!");
        System.out.println("Peeking: "+myStack.peek());
        System.out.println("Popping: "+myStack.pop());
        System.out.println("Peeking after popping: "+myStack.peek());
    }
}
