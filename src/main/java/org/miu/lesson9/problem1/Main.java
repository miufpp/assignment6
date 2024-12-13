package org.miu.lesson9.problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue=new ArrayQueueImpl();
        System.out.println("Peeking... :"+queue.peek());
        System.out.println(queue.size());
        queue.enqueue(13);
        System.out.println("Peeking... :"+queue.peek());
        System.out.println(queue.size());
        queue.enqueue(1);
        queue.enqueue(113);
        queue.enqueue(131);
        queue.dequeue();
        System.out.println("Peeking... :"+queue.peek());
        queue.dequeue();
    }
}
