package com;

import com.controller.Controller;
import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        label:
        do {
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 손님 입장");         //insert
            System.out.println("2. 입장인원 전체 조회");
            System.out.println("3. 놀이기구 타기");            //update
            System.out.println("4. 대기시간 변경");      //update
            System.out.println("5. 집가기");            //delete
            System.out.println("6. 티켓정보 조회");
            System.out.println("7. 놀이공원 폐장");
            System.out.print("번호를 입력 하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    controller.insertPerson(inputNewPerson());
                    break;
                case 2:
                    controller.selectAllPerson();
                    break;
                case 3:
                    controller.lineUpRide(inputLineUpRide());
                    break;
                case 4:
                    controller.changeWaitingTime(inputChangeWaitingTime()); break;
                case 5:
                    controller.goHomePerson(inputPersonCode()); break;
                case 6:
                    controller.selectAllTicket(); break;
                case 7:
                    System.out.println("금일 HelloWorld는 폐장합니다.");
                    System.out.println("감사합니다~");
                    break label;
            }
        } while (true);
    }

    private static PersonDTO inputNewPerson() {

        System.out.println("================================");
        System.out.println("입장할 인원의 정보를 입력하세요");
        System.out.println("================================");
        PersonDTO personDTO = new PersonDTO();
        getPersonInfo(personDTO);
        System.out.println("================================");

        return personDTO;
    }

    private static PersonDTO getPersonInfo(PersonDTO personDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.print("티켓 코드를 입력해주세요 : ");
        int ticketCode = sc.nextInt();
        sc.nextLine();

        System.out.print("이름을 입력해 주세요 : ");
        String personName = sc.nextLine();

        System.out.print("나이를 입력해 주세요 : ");
        int personAge = sc.nextInt();
        sc.nextLine();

        System.out.print("성별을 입력해 주세요 : ");
        String personGender = sc.nextLine();

        System.out.print("키를 입력해 주세요 : ");
        double personHeight = sc.nextDouble();

        personDTO.setTicketCode(ticketCode);
        personDTO.setPersonName(personName);
        personDTO.setPersonAge(personAge);
        personDTO.setPersonGender(personGender);
        personDTO.setPersonHeight(personHeight);

        return personDTO;
    }

    private static RideDTO inputLineUpRide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("놀이기구 탈 사람의 코드를 입력하세요 : ");
        int entranceCode = sc.nextInt();
        sc.nextLine();

        System.out.print("탈 놀이기구의 입력하세요(회전목마, 자이로드롭 , 바이킹) :");
        String rideSort = sc.nextLine();

        RideDTO rideDTO = new RideDTO();

        rideDTO.setEntranceCode(entranceCode);
        rideDTO.setRideSort(rideSort);

        return rideDTO;
    }
    private static RideDTO inputChangeWaitingTime() {
        Scanner sc = new Scanner(System.in);

        System.out.print("대기시간을 변경 하세요 :");
        String watingTime = sc.nextLine();

        System.out.print("대기시간을 변경할 놀이기구를 입력하세요 (회전목마, 자이로드롭 , 바이킹) : ");
        String rideSort = sc.nextLine();

        RideDTO rideDTO = new RideDTO();

        rideDTO.setWatingTime(watingTime);
        rideDTO.setRideSort(rideSort);

        return rideDTO;
    }
    private static PersonDTO inputPersonCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("집에 갈 사람의 이름을 적어주세요 : ");
        String personName = sc.nextLine();

        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonName(personName);

        return personDTO;
    }
}
