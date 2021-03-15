package com.crud.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.crud.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
