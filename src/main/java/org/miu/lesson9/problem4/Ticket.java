package org.miu.lesson9.problem4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String id;
    private String description;
    private LocalDateTime timestamp;
    DateTimeFormatter df=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    public Ticket(int id,String description) {
        this.description = description;
        this.id=String.format("TKT%06d", id);
        //this.id="TKT0000"+id;
        this.timestamp= LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", timestamp=" + df.format(timestamp) +
                ']';
    }
}
