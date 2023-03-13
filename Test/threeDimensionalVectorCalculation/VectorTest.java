package threeDimensionalVectorCalculation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    private static final double DELTA = 0.01;

    private Vector testVector1;
    private Vector testVector2;
    @BeforeEach
    public void initVectors() {
        testVector1 = new Vector(10.0, 10.0, 10.0);
        testVector2 = new Vector(2.0, 2.0, 2.0);
    }
    @Test
    void addVector() {
        Vector testVector3 = testVector1.addVector(testVector2);

        assertEquals(testVector3.getX(), 12.0, DELTA);
        assertEquals(testVector3.getY(), 12.0, DELTA);
        assertEquals(testVector3.getZ(), 12.0, DELTA);
    }

    @Test
    void subtractVector() {
        Vector testVector3 = testVector1.subtractVector(testVector2);

        assertEquals(testVector3.getX(), 8.0, DELTA);
        assertEquals(testVector3.getY(), 8.0, DELTA);
        assertEquals(testVector3.getZ(), 8.0, DELTA);
    }

    @Test
    void calculateCrossProduct() {
        Vector testVector3 = testVector1.calculateCrossProduct(testVector2);

        assertEquals(testVector3.getX(), 0.0, DELTA);
        assertEquals(testVector3.getY(), 0.0, DELTA);
        assertEquals(testVector3.getZ(), 0.0, DELTA);
    }

    @Test
    void multiplyWithScalar() {
        Vector testVector3 = testVector1.multiplyWithScalar(2.0);

        assertEquals(testVector3.getX(), 20.0, DELTA);
        assertEquals(testVector3.getY(), 20.0, DELTA);
        assertEquals(testVector3.getZ(), 20.0, DELTA);
    }

    @Test
    void divideByScalar() {
        Vector testVector3 = testVector1.divideByScalar(2.0);

        assertEquals(testVector3.getX(), 5.0, DELTA);
        assertEquals(testVector3.getY(), 5.0, DELTA);
        assertEquals(testVector3.getZ(), 5.0, DELTA);
    }

    @Test
    void calculateMagnitude() {
        double magnitude = testVector1.calculateMagnitude(testVector1);
        double expected = 17.32;

        assertEquals(magnitude, expected, DELTA);
    }
}