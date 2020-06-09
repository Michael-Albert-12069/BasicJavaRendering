package com.company;

import com.company.RenderEngine.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Canvas extends JPanel {

    HashMap<String, Shape> objects = new HashMap<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawBackground(g2d, Color.BLACK);

        for (Map.Entry<String, Shape> stringShapeEntry : objects.entrySet()) {
            stringShapeEntry.getValue().render(g2d, Color.cyan);
        }


        System.out.println("rendering");
    }

    public void add(String name, Shape object){
        objects.put(name, object);
    }

    public Shape get(String name){
        return objects.get(name);
    }

    public void clear(){
        objects = new HashMap<>();
        this.repaint();
    }


    private static void drawBackground(Graphics2D g2d, Color color){
        g2d.setColor(color);
        g2d.fillRect(0, 0, Main.window.w, Main.window.h);

    }


}
