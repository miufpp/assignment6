package org.miu.lesson9.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;


    public int peek() {
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[0];
        }
//implement
    }
    public void enqueue(int obj){
        if(arr.length==rear) resize();
        arr[rear++]=obj;
        front=0;
//implement
    }
    public int dequeue() {
        int result=peek();
        if(result==-1) return result;
        else{
            result=arr[0];
            for(int i=0;i<=rear;i++){
                arr[i]=arr[i+1];
            }
            arr[rear]=0;
            rear--;
        }
        return result;
//implement
    }
    public boolean isEmpty(){
//implement
        return rear==0;
    }
    public int size(){
//implement
        return rear;
    }
    private void resize(){
//implement
        arr= Arrays.copyOf(arr,arr.length*2);
    }
}

