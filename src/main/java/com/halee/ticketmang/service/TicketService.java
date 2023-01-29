package com.halee.ticketmang.service;


import org.springframework.data.domain.Sort;

import com.halee.ticketmang.entity.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> findAll(Sort sort);

    Ticket findById(int id);

    Ticket addOrUpdateTicket(Ticket ticket);

    void deleteTicket(Ticket ticket);

    List<Ticket> searchTicket(String title);
}
