package twoDimensionalVectorCalculation;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Method to add a Point object
     * @param point 2D Point object with x and y double values
     * @return a new Point object
     */
    public Point addPoint(Point point) {

        double xResult = this.x + point.getX();
        double yResult = this.y + point.getY();

        return new Point(xResult, yResult);
    }

    /**
     * Method to subtract a Point object
     * @param point 2D Point object with x and y double values
     * @return a new Point object
     */
    public Point subtractPoint(Point point) {
        double xResult = this.x - point.getX();
        double yResult = this.y - point.getY();

        return new Point(xResult, yResult);
    }

    /**
     * Method to to multiply with a double scalar value
     * @param scalar a double scalar value
     * @return a new Point object
     */
    public Point multiplyWithScalar(double scalar) {
        double xResult = this.x * scalar;
        double yResult = this.y * scalar;

        return new Point(xResult, yResult);
    }

    /**
     * Method to divide by a double scalar value
     * @param scalar a double scalar value
     * @return a new Point object
     */
    public Point divideWithScalar(double scalar) {
        double xResult = this.x / scalar;
        double yResult = this.y / scalar;

        return new Point(xResult, yResult);
    }

    /**
     * Method to calculate the distant to an Point object
     * @param point 2D Point object with x and y double values
     * @return a double value representing the distant
     */
    public double calculateDistance(Point point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
