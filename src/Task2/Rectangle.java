package Task2;

import java.awt.*;

public class Rectangle extends Shape{
    public double getXx() {
        return xx;
    }

    private final double xx;

    public double getYy() {
        return yy;
    }

    private final double yy;

    public Rectangle(double x, double y, double xx, double yy, Color colour) {
        setX(x);
        setY(y);
        setColour(colour);
        this.xx = xx;
        this.yy = yy;
    }

}
