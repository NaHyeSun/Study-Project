package com;

import com.controller.Controller;
import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 손님 입장");         //insert
            System.out.println("2. 입장인원 전체 조회");
            System.out.println("3. 줄서기");            //update
            System.out.println("4. 대기시간 변경");      //update
            System.out.println("5. 집가기");            //delete
            System.out.println("6. 놀이공원 폐장");
            System.out.print("번호를 입력 하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    controller.insertPerson(inputNewPerson()); break;
                case 2 :
                    controller.selectAllPerson(); break;
                case 3 :
                    controller.lineUpRide(inputLineUpRide()); break;
//                case 4 :
//                    controller.changeWaitingTime(inputChangeWaitingTime()); break;
//                case 5:
//                    controller.goHomePerson(inputPersonCode()); break;


            }
        } while (true);
    }


    private static PersonDTO inputNewPerson() {

        Scanner sc = new Scanner(System.in);
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
    private static Map<String, Integer> inputLineUpRide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("놀이기구 탈 사람의 코드를 입력하세요 :  ");
        int entranceCode = sc.nextInt();
        sc.nextLine();

        System.out.println("탑승을 원하는 놀이기구 번호를 입력해 주세요 : ");
        System.out.println(" 31.회전목마 ,32.자이로드롭 ,33.바이킹" );
        int rideCode = sc.nextInt();
        sc.nextLine();

        Map<String,Integer> parameter = new HashMap<>();
        parameter.put("entranceCode",entranceCode);
        parameter.put("rideCode",rideCode);


        return parameter;

    }

}
