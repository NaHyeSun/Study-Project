package com.kh.practice.point.view;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;
import com.kh.practice.point.model.vo.Circle;

import java.util.Scanner;

public class PointMenu {
    private Scanner sc = new Scanner(System.in);
    private CircleController cc = new CircleController();
    private RectangleController rc = new RectangleController();

    public void mainMenu() {

        while (true) {

            System.out.println("========메뉴========");
            System.out.println("1. 원 ");
            System.out.println("2. 사각형 ");
            System.out.println("9. 끝내기 ");
            System.out.println("메뉴 번호 : ");

            int num1 = sc.nextInt();

            switch (num1) {
                case 1: circleMenu();
                    break;
                case 2: rectangleMenu();
                    break;

                default:
                    System.out.println(" 끝내기 ");


            }

        }
    }
    public void circleMenu(){

        while (true) {

            System.out.println("========원메뉴========");
            System.out.println("1. 원 둘레 ");
            System.out.println("2. 원 넓이 ");
            System.out.println("9. 메인으로 ");
            System.out.println("메뉴 번호 : ");

            int num2 = sc.nextInt();

            switch (num2) {
                case 1: calcCircum();
                    break;
                case 2:calcCircleArea();
                    break;

                default: mainMenu();


            }

        }

    }
    public void rectangleMenu(){

        while (true) {

            System.out.println("========메뉴========");
            System.out.println("1. 사각형 둘레 ");
            System.out.println("2. 사각형 넓이 ");
            System.out.println("3. 메인으로 ");
            System.out.println("메뉴 번호 : ");

            int num3 = sc.nextInt();

            switch (num3) {
                case 1:calcPerimeter();
                    break;
                case 2:calcRectArea();
                    break;

                default:mainMenu();


            }
        }
    }
    public void calcCircum(){

        System.out.println("x 좌표 : ");
        int x = sc.nextInt();
        System.out.println("y 좌표 : ");
        int y = sc.nextInt();
        System.out.println("반지름 : ");
        int radius = sc.nextInt();

        System.out.println(cc.calcCircum(x,y,radius));

    }
    public void calcCircleArea(){

        System.out.println("x 좌표 : ");
        int x = sc.nextInt();
        System.out.println("y 좌표 : ");
        int y = sc.nextInt();
        System.out.println("반지름 : ");
        int radius = sc.nextInt();

        System.out.println(cc.calcArea(x,y,radius));

    }
    public void calcPerimeter(){

        System.out.println("x 좌표 : ");
        int x = sc.nextInt();
        System.out.println("y 좌표 : ");
        int y = sc.nextInt();
        System.out.println("높이 : ");
        int height = sc.nextInt();
        System.out.println("너비 : ");
        int width = sc.nextInt();

        System.out.println(rc.calcPerimeter(x,y,height,width));

    }
    public void calcRectArea(){

        System.out.println("x 좌표 : ");
        int x = sc.nextInt();
        System.out.println("y 좌표 : ");
        int y = sc.nextInt();
        System.out.println("높이 : ");
        int height = sc.nextInt();
        System.out.println("너비 : ");
        int width = sc.nextInt();

        System.out.println(rc.calcArea(x,y,height,width));

    }
}
