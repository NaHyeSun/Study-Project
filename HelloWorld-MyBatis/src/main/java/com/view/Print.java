package com.view;

import com.model.dto.PersonDTO;

import java.util.List;

public class Print {
    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 입장 인원 등록을 성공하였습니다!"; break;
            case "successRide" : successMessage = "놀이기구에 줄을 섰습니다. "; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "insert" : errorMessage = "신규 입장 인원 등록을 실패하였습니다."; break;
            case "selectPerson" : errorMessage = "인원 정보 조회를 실패하였습니다."; break;
            case "failRide" : errorMessage = "줄서기에 실패하였습니다. "; break;
        }

        System.out.println(errorMessage);
    }

    public void printAllPerson(List<PersonDTO> personList) {

        for (PersonDTO personDTO : personList) {
            System.out.println(personDTO);
        }
    }
}
