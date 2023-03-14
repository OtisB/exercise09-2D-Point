package geometricObjects;

import twoDimensionalVectorCalculation.Point;

public class Triangle implements GeometricObject {

    private Point A;
    private Point B;
    private Point C;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    /**
     * Method to calculate the area of a rectangular Triangle object
     * @return a double value
     */
    @Override
    public double calculateArea() {
        double siteA = getA().calculateDistance(getB());
        double siteB = getB().calculateDistance(getC());
        double siteC = getC().calculateDistance(getA());
        double sin = (siteA + siteB + siteC) / 2;
        return Math.sqrt(sin * (sin - siteA) * (sin - siteB) + (sin - siteC));
    }

    /**
     * Method to calculate the circumference of a rectangular Triangle object
     * @return a double value
     */
    @Override
    public double calculateCircumference() {
        return getA().calculateDistance(getB()) +
                getB().calculateDistance(getC()) +
                getC().calculateDistance(getA());
        }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
