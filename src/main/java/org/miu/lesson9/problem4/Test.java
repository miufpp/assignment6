package org.miu.lesson9.problem4;

public class Test {
    public static void main(String[] args) {
        TicketingSystem ticketSystem = new TicketingSystem();

        // Add some tickets
        Ticket ticket1 = ticketSystem.addTicket("Printer not working");
        Ticket ticket2 = ticketSystem.addTicket("Network connectivity issue");
        Ticket ticket3 = ticketSystem.addTicket("Software installation request");

        // View queue details
        System.out.println("Queue Size: " + ticketSystem.getQueueSize());
        System.out.println("Next Ticket: " + ticketSystem.viewNextTicket());

        // Process tickets
        System.out.println("\nProcessing Tickets:");
        while (!ticketSystem.isQueueEmpty()) {
            Ticket processedTicket = ticketSystem.processTicket();
            System.out.println("Processed: " + processedTicket);
        }

        // Verify queue is empty
        System.out.println("\nQueue Empty: " + ticketSystem.isQueueEmpty());
    }
}
