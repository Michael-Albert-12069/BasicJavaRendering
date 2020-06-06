package com.company;

import com.company.RenderEngine.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {

    ArrayList<Shape> objects = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawBackground(g2d, Color.BLACK);


        for (Shape object: objects) {
            object.render(g2d, Color.cyan);
        }
        System.out.println("rendering");
    }

    public void add(String name, Shape object){
        objects.add(object);
    }


    public void clear(){
        objects = new ArrayList<>();
        this.repaint();
    }
    private static void drawBackground(Graphics2D g2d, Color color){
        g2d.setColor(color);
        g2d.fillRect(0, 0, Main.window.w, Main.window.h);

    }


}
