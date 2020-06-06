package com.company.RenderEngine.D2;

import java.awt.*;
import com.company.RenderEngine.Shape;

public class Point2D extends Shape {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics2D g2d, Color color) {
        g2d.setColor(color);
        g2d.fillOval(x-2, y-2, 4, 4);
    }

}
