package priv.terry.crosspoint;

import java.util.ArrayList;

public class Square {
    // lt: left top
    // lb: left bottom   smallest number
    // rt: right top
    // rb: right bottom
    public final Point lt;
    public final Point lb;
    public final Point rt;
    public final Point rb;
    public final double length;

    public Square (Point lb, double len){
        this.length = len;
        this.lb = new Point(lb);
        this.lt = new Point(lb.x, lb.y + len);
        this.rb = new Point(lb.x + len, lb.y);
        this.rt = new Point(lb.x + len, lb.y + len);
    }

    private Boolean pointInSquare(Point p){
        return p.x > lb.x && p.x < rt.x && p.y > lb.x && p.y < rt.y;
    }

    // check if four sides cross the line
    public ArrayList<Point> intersectWithLine(Line l){
        ArrayList<Point> result = new ArrayList<Point>();
        if (pointInSquare(l.start) && pointInSquare(l.end))
            return null;
        if(l.xInRange(lb.x)){
            double y = l.getYwithX(lb.x);
            if(y >= lb.y && y <= lt.y)
                result.add(new Point(lb.x, y));

        }
        if(l.xInRange(rb.x)){
            double y = l.getYwithX(rb.x);
            if(y >= rb.y && y <= rt.y)
                result.add(new Point(rb.x, y));

        }
        if(l.yInRange(lb.y)){
            double x = l.getXwithY(lb.y);
            if(x >= lb.x && x <= rb.x)
                result.add(new Point(x, lb.y));

        }
        if(l.yInRange(lt.y)){
            double x = l.getXwithY(lt.y);
            if(x >= lt.x && x <= rt.x)
                result.add(new Point(x, lt.y));

        }
        return result;
    }
}
