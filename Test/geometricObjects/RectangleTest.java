package geometricObjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twoDimensionalVectorCalculation.Point;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private static final double DELTA = 0.01;

    private Rectangle testRectangle;

    @BeforeEach
    public void initTestRectangle() {
        // TopLeft, TopRight, BottomRight, BottomLeft
        testRectangle = new Rectangle(
                new Point(2.0, 4.0),
                new Point(4.0, 4.0),
                new Point(4.0,2.0),
                new Point(2.0, 2.0)
                );
    }

    @Test
    void calculateArea() {
        double calculatedArea = testRectangle.calculateArea();

        assertEquals(calculatedArea,4.0, DELTA);
    }

    @Test
    void calculateCircumference() {
        double calculatedCircumference = testRectangle.calculateCircumference();

        assertEquals(calculatedCircumference,8.0, DELTA);
    }
}