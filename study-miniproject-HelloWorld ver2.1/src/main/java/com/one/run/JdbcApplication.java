package com.one.run;

import com.one.insert.Insert;
import com.one.delete.Delete;
import com.one.model.jdbcDTO.JdbcDTO;
import com.one.update.Update;

import java.util.Scanner;

public class JdbcApplication {
    public static void main(String[] args) {

        Delete delete = new Delete();
        Insert insert = new Insert();
        Update update = new Update();
        JdbcDTO jdbcDTO = new JdbcDTO();

        Scanner sc = new Scanner(System.in);
        label:
        do {
            System.out.println("********** 메뉴 **********");
            System.out.println("1. 손님 입장");          //insert
            System.out.println("2. 줄서기");
            System.out.println("3. 집가기");            //delete
            System.out.println("4. 대기시간 변경");        //update
            System.out.println("5. 놀이공원 폐장");
            System.out.print("번호를 입력 하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    insert.insertMenu();
                    break;
                case 2:
                    update.enterRide();
                    break;
                case 3:
                    delete.goHomePerson();
                    break;
                case 4:
                    update.updateWatingTime();
                    break;
                case 5:
                    System.out.println("이제는 우리가 헤어져야 할시간~");
                    break label;

            }
        } while (true);
    }
}
