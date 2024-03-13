package com.view;

import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;
import com.model.dto.TicketDTO;

import java.util.List;

public class Print {
    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 입장 인원 등록을 성공하였습니다!"; break;
            case "lineUp" : successMessage = "놀이기구를 신나게 탔습니다~"; break;
            case "change" : successMessage = "놀이기구의 대기시간을 변경하였습니다."; break;
            case "goodBye" : successMessage = "다음에 또 이용해 주세요 안전귀가!!"; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "insert" : errorMessage = "신규 입장 인원 등록을 실패하였습니다."; break;
            case "selectPerson" : errorMessage = "인원 정보 조회를 실패하였습니다."; break;
            case "lineUp" : errorMessage = "해당 인원이 놀이기구를 타지 못하였습니다."; break;
            case "change" : errorMessage = "대기시간을 변경하지 못하였습니다."; break;
            case "goodBye" : errorMessage = "해당 인원이 집에 가지 못하였습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printAllPerson(List<PersonDTO> personList) {

        for (PersonDTO personDTO : personList) {
            System.out.println(personDTO);
        }
    }

    public void printAllRide(List<RideDTO> rideList) {

        for(RideDTO rideDTO : rideList){
            System.out.println(rideDTO);
        }
    }

    public void printAllTicket(List<TicketDTO> ticketList) {
        for(TicketDTO ticketDTO : ticketList) {
            System.out.println(ticketDTO);
        }
    }
}
