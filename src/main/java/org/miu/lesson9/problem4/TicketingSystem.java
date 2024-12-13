package org.miu.lesson9.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketingQueue;
    private static int nextId=1;

    public TicketingSystem() {
        this.ticketingQueue = new LinkedList<>();
    }

    public Ticket addTicket(String description){
        Ticket ticket=new Ticket(nextId++,description);
        ticketingQueue.offer(ticket);
        return ticket;
    }
    public Ticket processTicket(){
        if(ticketingQueue.isEmpty()){
            System.out.println("No tickets to process.");
            return null;
        }
            return ticketingQueue.poll();
    }
    public Ticket viewNextTicket(){
        return ticketingQueue.peek();
    }
    public boolean isQueueEmpty() {
        return ticketingQueue.isEmpty();
    }
    public int getQueueSize() {
        return ticketingQueue.size();
    }
}
