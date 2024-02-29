package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
    private Rectangle r = new Rectangle();

    public String calcArea(int x,int y, int height, int width){

        String a = String.valueOf(x);
        String b = String.valueOf(y);
        String c = String.valueOf(height);
        String d = String.valueOf(width);
        String e = String.valueOf((height+width)*2);

        return e;


    }
    public String calcPerimeter(int x,int y, int height, int width){

        String e = String.valueOf(height*width);

        return e;
    }
}
