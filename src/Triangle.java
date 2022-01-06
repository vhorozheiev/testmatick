public class Triangle extends Shape {
    private String color;
    private int firstSideLength;
    private int secondSideLength;
    private int thirdSideLength;

    public Triangle(String color, int firstSideLength, int secondSideLength, int thirdSideLength) {
        this.color = color;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
    }

    /**
     * Method to draw triangle
     */
    @Override
    public void draw() {
        System.out.println("Triangle has been drawn");
    }

    /**
     * @return area of triangle
     */
    @Override
    public double getArea() {
        if (isTriangleValid(firstSideLength, secondSideLength, thirdSideLength)) {
            double halfPerimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2.0;
            return Math.sqrt(halfPerimeter * (halfPerimeter - firstSideLength) *
                    (halfPerimeter - secondSideLength) * (halfPerimeter - thirdSideLength));
        }
        return 0;
    }

    /**
     * @return color of triangle
     */
    @Override
    public String getColor() {
        return this.color;
    }

    /**
     * @return median of triangle
     */
    public double getMedian() {
        return 1 / 2. * Math.sqrt(2 * Math.pow(firstSideLength, 2) + 2 * Math.pow(secondSideLength, 2) - Math.pow(thirdSideLength, 2));
    }

    /**
     * This method check that triangle is valid or not
     * @param firstSideLength
     * @param secondSideLength
     * @param thirdLengthSide
     * @return true or false
     */
    private boolean isTriangleValid(double firstSideLength, double secondSideLength, double thirdLengthSide) {
        return (firstSideLength + secondSideLength) > thirdLengthSide && (firstSideLength + thirdLengthSide) > secondSideLength
                && (secondSideLength + thirdLengthSide) > firstSideLength;
    }

    /**
     * @return information about object
     */
    @Override
    public String toString() {
        return "Triangle: " +
                "Area = " + getArea() +
                ", median = " + getMedian() +
                ", color is " + getColor();
    }
}
