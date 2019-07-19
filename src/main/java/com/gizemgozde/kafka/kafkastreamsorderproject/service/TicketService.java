package com.gizemgozde.kafka.kafkastreamsorderproject.service;

import com.gizemgozde.kafka.kafkastreamsorderproject.entity.Ticket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author gizem
 */
@Service
@Slf4j
public class TicketService {
  public Ticket buyTicket(Ticket ticket) {
    return Ticket.builder().createdDate(new Date()).build();
  }
}
