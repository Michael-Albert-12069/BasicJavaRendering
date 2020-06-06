package com.company.RenderEngine.D2;

import com.company.RenderEngine.Shape;

import java.awt.*;
import java.util.HashMap;

public abstract class Shape2D extends Shape {
    HashMap<Character, Point2D> shapePoints = new HashMap<>();

    public Shape2D(Point2D... points){
        int i = 65;
        for (Point2D point: points) {
            shapePoints.put(((char)i), point);
            i++;
        }
    }

    @Override
    public abstract void render(Graphics2D g2d, Color color);
}
