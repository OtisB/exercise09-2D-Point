package vectorCalculation;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3, 1);
        Point p2 = new Point(2, 3);
        Point p3 =  p1.subtractPoint(p2);

        System.out.println(p3);

    }


}