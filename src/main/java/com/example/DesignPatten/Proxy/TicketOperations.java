package com.example.DesignPatten.Proxy;

import java.util.List;

public interface TicketOperations {
    boolean buyTickets();
    List<String> getTickets();
    boolean refundTickets();
}
