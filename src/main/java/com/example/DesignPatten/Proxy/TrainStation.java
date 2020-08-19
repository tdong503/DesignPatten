package com.example.DesignPatten.Proxy;

import java.util.List;

public class TrainStation implements TicketOperations {
    public boolean buyTickets() {
        return false;
    }

    public List<String> getTickets() {
        return null;
    }

    public boolean refundTickets() {
        return false;
    }
}
