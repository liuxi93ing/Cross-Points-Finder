
import priv.terry.crosspoint.Point;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(1.0, 2.0);
        Point p3 = p2;

        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = s2;
        String s4 = new String("aaa");

        System.out.printf("p1.equals(p2) : %s\n", p1.equals(p2));
        System.out.printf("p1 == p2 : %s\n", p1 == p2);
        System.out.printf("p2.equals(p3) : %s\n", p2.equals(p3));
        System.out.printf("p2 == p3 : %s\n", p2 == p3);


        System.out.printf("p1 hash code : %s\n", p1.hashCode());
        System.out.printf("p2 hash code : %s\n", p2.hashCode());
        System.out.printf("p3 hash code : %s\n", p3.hashCode());
    }
}
