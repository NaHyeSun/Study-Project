package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
    private Circle c = new Circle();

    public String calcArea(int x,int y, int radius){

        String a = String.valueOf(x);
        String b = String.valueOf(y);
        String c = String.valueOf(radius);

        String d = String.valueOf(2*Math.PI*radius);

        return a+" " +b + " "+c + "/" + d;

    }
    public String calcCircum(int x,int y, int radius){

        String a1 = String.valueOf(x);
        String b1 = String.valueOf(y);
        String c1 = String.valueOf(radius);

        String d1 = String.valueOf(Math.PI*radius*radius);

        return a1+" " +b1 + " "+c1 + "/" + d1;
    }
}
