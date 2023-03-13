package twoDimensionalVectorCalculation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private static final double DELTA = 0.01;

    private Point testPoint1;
    private Point testPoint2;

@BeforeEach
    public void initTestPoints() {
        testPoint1 = new Point(12.0, 12.0);
        testPoint2 = new Point(4.0, 4.0);
    }

    @Test
    void addPoint() {
        Point testPoint3 = testPoint1.addPoint(testPoint2);

        assertEquals(testPoint3.getX(), 16.0, DELTA);
        assertEquals(testPoint3.getY(), 16.0, DELTA);
    }

    @Test
    void subtractPoint() {
        Point testPoint3 = testPoint1.subtractPoint(testPoint2);

        assertEquals(testPoint3.getX(), 8.0, DELTA);
        assertEquals(testPoint3.getY(), 8.0, DELTA);
    }

    @Test
    void multiplyWithScalar() {
        Point testPoint3 = testPoint1.multiplyWithScalar(2.0);

        assertEquals(testPoint3.getX(), 24.0, DELTA);
        assertEquals(testPoint3.getY(), 24.0, DELTA);
    }

    @Test
    void divideWithScalar() {
        Point testPoint3 = testPoint1.divideWithScalar(2.0);

        assertEquals(testPoint3.getX(), 6.0, DELTA);
        assertEquals(testPoint3.getY(), 6.0, DELTA);
    }
}