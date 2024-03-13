package com.model.dao;

import com.model.dto.RideDTO;

import java.util.List;

public interface RideDAO {
    int lineUpRide(RideDTO rideDTO);

    int changeWaitingTime(RideDTO rideDTO);

    List<RideDTO> selectAllRide();
}
