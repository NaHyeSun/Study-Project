package com.controller;

import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;
import com.model.dto.TicketDTO;
import com.service.Service;
import com.view.Print;

import java.util.List;

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

    public void lineUpRide(RideDTO rideDTO) {

        if (service.lineUpRide(rideDTO)) {

            print.printSuccessMessage("lineUp");
        } else {

            print.printErrorMessage("lineUp");
        }
    }

    public void changeWaitingTime(RideDTO rideDTO) {

        Controller controller = new Controller();
        if (service.changeWaitingTime(rideDTO)) {

            print.printSuccessMessage("change");
            controller.selectAllRide();
        } else {

            print.printErrorMessage("change");
        }
    }

    private void selectAllRide() {
        List<RideDTO> rideList = service.selectAllRide();

        if (rideList != null) {
            print.printAllRide(rideList);
        } else {
            print.printErrorMessage("rideList");
        }
    }

    public void goHomePerson(PersonDTO personDTO) {

        if (service.goHomePerson(personDTO)){

            print.printSuccessMessage("goodBye");
        } else {

            print.printErrorMessage("goodBye");
        }
    }

    public void selectAllTicket() {
        List<TicketDTO> ticketList = service.selectAllTicket();
        if (ticketList != null) {
            print.printAllTicket(ticketList);
        } else {
            print.printErrorMessage("TicketList");
        }
    }
}
