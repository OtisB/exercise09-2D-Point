package geometricObjects;

import org.junit.jupiter.api.Test;
import twoDimensionalVectorCalculation.Point;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private static final double DELTA = 0.01;

    Triangle testTriangle = new Triangle(
            new Point(0.0, 0.0),
            new Point(3.0, 0.0),
            new Point(0.0, 4.0)
    );

    @Test
    void calculateArea() {
        assertEquals(testTriangle.calculateArea(), 4.47, DELTA);
    }

    @Test
    void calculateCircumference() {
        assertEquals(testTriangle.calculateCircumference(), 12.0, DELTA);
    }
}