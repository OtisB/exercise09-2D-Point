package threeDimensionalVectorCalculation;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Method to add a Vector object
     * @param vector 3D Vector object of double values
     * @return a new Vector object
     */
    public Vector addVector(Vector vector) {
        double xResult = this.x + vector.getX();
        double yResult = this.y + vector.getY();
        double zResult = this.z + vector.getZ();

        return new Vector(xResult, yResult, zResult);
    }

    /**
     * Method to subtract a Vector object
     * @param vector 3D Vector object of double values
     * @return a new Vector object
     */
    public Vector subtractVector(Vector vector) {

        return new Vector(
                this.x - vector.getX(),
                this.y - vector.getY(),
                this.z - vector.getZ()
        );
    }

    /**
     * Method to calculate the crosspruduct between two Vector object
     * @param vector three-dimensional Vector object
     * @return a ne Vector bject
     */
    public Vector calculateCrossProduct(Vector vector) {
        return new Vector(
                this.y * vector.z - this.z * vector.y,
                this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x);
    }

    /**
     * Method to multiply with a double scalar value
     * @param scalar a double scalar value
     * @return a new Vector object
     */
    public Vector multiplyWithScalar(double scalar) {
        return new Vector(
                this.x * scalar,
                this.y * scalar,
                this.z * scalar);
    }

    /**
     * Method to divide by a double scalar value
     * @param scalar a double scalar value
     * @return a new Vector object
     */
    public Vector divideByScalar(double scalar) {
        return new Vector(
                this.x / scalar,
                this.y / scalar,
                this.z / scalar);
    }

    /**
     * Method to calculate the magnitude of a three-dimensional Vector object
     * @param vector three-dimensional Vector object
     * @return the magnitude as double value
     */
    public double calculateMagnitude(Vector vector) {

        double squareX = Math.pow(vector.getX(), 2);
        double squareY = Math.pow(vector.getY(), 2);
        double squareZ = Math.pow(vector.getZ(), 2);

        return Math.sqrt(squareX + squareY + squareZ);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
