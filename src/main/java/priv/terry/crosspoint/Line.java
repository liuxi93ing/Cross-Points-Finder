package priv.terry.crosspoint;

import static java.lang.Math.*;

public class Line {
    public final double length;
    public final Point start;
    public final Point end;
    private double k;
    private double b;

    // Assuming start.x < end.x
    public Line(Point p1, Point p2){
        start = new Point(p1);
        end = new Point(p2);
        k = (p1.y - p2.y)/(p1.x - p2.x);
        b = (p1.x * p2.y - p2.x * p1.y)/(p1.x - p2.x);
        length = sqrt(pow(start.x - end.x, 2) + pow(start.y - end.y, 2));
    }

    public Boolean xInRange(double x){
        return x >= min(start.x, end.x) && x <= max(start.x, end.x);
    }

    public Boolean yInRange(double y){
        return y >= min(start.y, end.y) && y <= max(start.y, end.y);
    }


    public double getYwithX(double x){
        return k * x + b;
    }

    public double getXwithY(double y){
        return (y - b) / k;
    }
}
