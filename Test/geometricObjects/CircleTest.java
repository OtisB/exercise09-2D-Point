package geometricObjects;

import org.junit.jupiter.api.Test;
import twoDimensionalVectorCalculation.Point;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest extends GeometricObjectTest {

    private static final double DELTA = 0.01;

    Circle testCircle = new Circle(new Point(4.0,8.0), 5.0);

    @Test
    void calculateArea() {
        assertEquals(testCircle.calculateArea(), 78.53, DELTA);
    }

    @Test
    void calculateCircumference() {
        assertEquals(testCircle.calculateCircumference(), 31.41, DELTA);
    }
}