package vectorCalculation;

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

    public Point addPoint(Point point) {

        double xResult = this.x + point.getX();
        double yResult = this.y + point.getY();

        return new Point(xResult, yResult);
    }

    public Point subtractPoint(Point point) {
        double xResult = this.x - point.getX();
        double yResult = this.y - point.getY();

        return new Point(xResult, yResult);
    }

    public Point multiplyWithScalar(double scalar) {
        double xResult = this.x * scalar;
        double yResult = this.y * scalar;

        return new Point(xResult, yResult);
    }

    public Point divideWithScalar(double scalar) {
        double xResult = this.x / scalar;
        double yResult = this.y / scalar;

        return new Point(xResult, yResult);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
