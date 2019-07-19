package com.gizemgozde.kafka.kafkastreamsorderproject.controller;

import com.gizemgozde.kafka.kafkastreamsorderproject.entity.Ticket;
import com.gizemgozde.kafka.kafkastreamsorderproject.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gizem
 */
@RestController
@RequestMapping(value = "/ticket")
@Slf4j
public class TicketController {

    private TicketService ticketService;


    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/buy")
    public Ticket buyTicket(@RequestBody Ticket ticket) {

        Ticket savedTicket = ticketService.buyTicket(ticket);
        return savedTicket;


    }
}
