package priv.terry.crosspoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // line start and end
        Point start = new Point(1, 1);
        Point end = new Point(2, 3);
        Line crack = new Line(start, end);

        // grids width M, length N
        int M = 3;
        int N = 3;
        Square[][] grids = new Square[M][N];

        // each square has length l
        double l = 1.0;


        Set<Point> crossPoints = new HashSet<Point>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                Point p = new Point(0 + i * l, 0 + j * l);
                grids[i][j] = new Square(p, l);
                ArrayList<Point> points = grids[i][j].intersectWithLine(crack);

                if(points!=null){
                    for(Point q : points){
                        crossPoints.add(q);
                    }
                }
            }
        }

        Iterator itr = crossPoints.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



    }
}