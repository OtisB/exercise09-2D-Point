package geometricObjects;

import twoDimensionalVectorCalculation.Point;

public class Rectangle implements GeometricObject {
    private Point topLeft; //A
    private Point topRight; //B
    private Point bottomRight; //C
    private Point bottomLeft; //D

    public Rectangle() {
    }

    public Rectangle(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
        this.bottomLeft = bottomLeft;
    }


    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    /**
     * Method to calculate the horizontal site of the rectangle
     * @return a double value representing the width of the rectangle
     */
    private double calculateAB() {
        return this.topRight.getX() - this.topLeft.getX();
    }

    /**
     * Method to calculate the vertical site of the rectangle
     * @return a double value representing the height of the rectangle
     */
    private double calculateAD() {
        return this.topLeft.getY() - this.bottomLeft.getY();
    }

    /**
     * Methode to calculate the area of a Rectangular object
     * @return double value
     */
    @Override
    public double calculateArea() {
        return calculateAB() * calculateAD();
    }

    /**
     * Methode to calculate the circumference of a rectangle
     * 2*ab + 2ad
     * @return double value
     */
    @Override
    public double calculateCircumference() {
        return 2 * calculateAB() + 2 * calculateAD();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomRight=" + bottomRight +
                ", bottomLeft=" + bottomLeft +
                '}';
    }
}
