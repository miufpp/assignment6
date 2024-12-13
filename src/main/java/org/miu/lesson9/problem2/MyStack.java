package org.miu.lesson9.problem2;

import java.time.LocalDateTime;

public class MyStack {
    Node head;
    public MyStack(){
        this.head=new Node(null);
    }
    private class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.next=null;
            this.data=data;
        }
    }
    public void push(String item){
        Node n=new Node(item);
        if(head.next==null){
            head.next=n;
            n.next=null;
        }else{
            n.next=head.next;
            head.next=n;
        }
    }
    public String pop(){
        if(head.next==null) return "Stack empty";
        else{
            Node nodeToDelete=head.next;
            String data= nodeToDelete.data;
            head.next=nodeToDelete.next;
            nodeToDelete=null;
            return data;
        }
    }
    public String peek(){
        if(head.next!=null){
            return head.next.data;
        }else{
            return "Stack is empty";
        }
    }
}
