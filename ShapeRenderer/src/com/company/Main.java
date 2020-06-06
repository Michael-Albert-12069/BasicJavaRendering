package com.company;

import com.company.RenderEngine.D2.Point2D;
import com.company.RenderEngine.D2.Triangle2D;

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
        Point2D b = new Point2D(100, 300);
        Point2D c = new Point2D(150, 250);

        Triangle2D triangle = new Triangle2D(a,b,c);
        canvas.add("triangleA", triangle);
        canvas.repaint();
    }
}
