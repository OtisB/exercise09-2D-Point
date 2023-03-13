package vectorCalculation;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(6.0, 4.0);
        Point p2 = new Point(2.0, 2.0);

        Point p3 =  p1.addPoint(p2);
        Point p4 = p1.subtractPoint(p2);

        Point p5 = p1.multiplyWithScalar(3.0);
        Point p6 = p1.divideWithScalar(2.0);

        System.out.println("p1");
        System.out.println(p1);

        System.out.println("p2");
        System.out.println(p2);

        System.out.println("p1 +  p2");
        System.out.println(p3);

        System.out.println("p1 - p2");
        System.out.println(p4);

        System.out.println("p1 multiplied with 3.0");
        System.out.println(p5);

        System.out.println("p1 divided by 2.0");
        System.out.println(p6);

    }


}