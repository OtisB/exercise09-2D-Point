package geometricObjects;

import twoDimensionalVectorCalculation.Point;

public class Circle implements GeometricObject{

    private Point center;

    private double radius;

    public Circle() {
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Methode to calculate the area of a Circle object
     * @return double value
     */
    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    /**
     * Methode to calculate the circumference of a Circle object
     * @return double value
     */
    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
