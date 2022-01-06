public class Trapezoid extends Shape {
    private String color;
    private int firstSideLength;
    private int secondSideLength;
    private int height;

    public Trapezoid(String color, int firstSideLength, int secondSideLength, int height) {
        this.color = color;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.height = height;
    }

    /**
     * method to draw figure
     */
    @Override
    public void draw() {
        System.out.println("Trapezoid has been drawn");
    }

    /**
     * @return area of trapezoid
     */
    @Override
    public double getArea() {
        return 1 / 2. * (firstSideLength + secondSideLength) * height;
    }

    /**
     * @return color of trapezoid
     */
    @Override
    public String getColor() {
        return this.color;
    }

    /**
     * @return median of trapezoid
     */
    public double getMedian() {
        return 1 / 2. * (firstSideLength + secondSideLength);
    }

    /**
     * @return information about object
     */
    @Override
    public String toString() {
        return "Trapezoid: " +
                "Area = " + getArea() +
                ", median = " + getMedian() +
                ", color is " + getColor();
    }
}
