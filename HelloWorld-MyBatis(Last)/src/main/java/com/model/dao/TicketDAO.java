package com.model.dao;

import com.model.dto.TicketDTO;

import java.util.List;

public interface TicketDAO {
    List<TicketDTO> selectAllTicket();
}
