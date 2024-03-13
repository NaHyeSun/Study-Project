package com.controller;

import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;
import com.service.Service;
import com.view.Print;

import java.util.List;
import java.util.Map;

public class Controller {
    private final Service service;
    private final Print print;

    public Controller() {
        service = new Service();
        print = new Print();
    }

    public void insertPerson(PersonDTO personDTO) {

        if (service.insertPerson(personDTO)) {
            print.printSuccessMessage("insert");
        } else {
            print.printErrorMessage("insert");
        }

    }

    public void selectAllPerson() {

        List<PersonDTO> personList = service.selectAllPerson();

        if (personList != null) {
            print.printAllPerson(personList);
        } else {
            print.printErrorMessage("selectList");
        }

    }

    public void lineUpRide(Map<String, Integer> parameter) {

        int entranceCode = parameter.get("entranceCode");
        int rideCode = parameter.get("rideCode");

        RideDTO ride = new RideDTO();
        ride.setEntranceCode(entranceCode);
        ride.setRideCode(rideCode);

        if (service.lineUpRide(ride)) {
            print.printSuccessMessage("successRide");
        } else {
            print.printErrorMessage("failRide");
        }
    }
}
