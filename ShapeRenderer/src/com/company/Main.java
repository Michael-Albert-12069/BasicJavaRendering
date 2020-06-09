package com.company;

import com.company.RenderEngine.D2.Point2D;
import com.company.RenderEngine.D2.Square2D;
import com.company.RenderEngine.D2.Text2D;
import com.company.RenderEngine.D2.Triangle2D;

import java.awt.*;

public class Main {

    static double eXDbl = 0;



    public static Window window;
    public static Canvas canvas;

    public static void init(){
        window = new Window(800, 600);
        canvas = new Canvas();
        window.add(canvas);
    }



    public static void main(String[] args) throws InterruptedException {
        init();
        Point2D a = new Point2D(100, 200);

        Square2D tile = new Square2D(a, 50, 50);

        canvas.add("tile", tile);







        canvas.repaint();
        Thread.sleep(100);


    }
}
