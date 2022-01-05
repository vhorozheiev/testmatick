public class Triangle extends Figure {
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

    @Override
    public void draw() {
        System.out.println("Triangle has been drawn");
    }

    @Override
    public double getArea() {
        if (isTriangleValid(firstSideLength, secondSideLength, thirdSideLength)) {
            double halfPerimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2.0;
            double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSideLength) *
                    (halfPerimeter - secondSideLength) * (halfPerimeter - thirdSideLength));
            System.out.println("Triangle area is " + area);
            return area;
        }
        return 0;
    }

    @Override
    public String getColor() {
        System.out.println("The color of triangle is " + this.color);
        return color;
    }

    public double getMedian() {
        double median = 1 / 2. * Math.sqrt(2 * Math.pow(firstSideLength, 2) + 2 * Math.pow(secondSideLength, 2) - Math.pow(thirdSideLength, 2));
        System.out.println("The median of the triangle is " + median);
        return median;
    }

    private boolean isTriangleValid(double firstSideLength, double secondSideLength, double thirdLengthSide) {
        return (firstSideLength + secondSideLength) > thirdLengthSide && (firstSideLength + thirdLengthSide) > secondSideLength
                && (secondSideLength + thirdLengthSide) > firstSideLength;
    }
}
