package twoDimensionalVectorCalculation;

public class PointUtils {

    /**
     * Static method to add two two dimensional given Point objects
     * @param p1 two dimensional Point
     * @param p2 two dimensional Point
     * @return a new Point object
     */
    public static Point addPoints (Point p1, Point p2) {

        double xNewPoint = p1.getX() + p2.getX();
        double yNewPoint = p1.getY() + p2.getY();

        return new Point(xNewPoint, yNewPoint);
    }
}
