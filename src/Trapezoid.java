public class Trapezoid extends Figure {
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

    @Override
    public void draw() {
        System.out.println("Trapezoid has been drawn");
    }

    @Override
    public double getArea() {
        return 1 / 2. * (firstSideLength + secondSideLength) * height;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double getMedian() {
        return 1 / 2. * (firstSideLength + secondSideLength);
    }

    @Override
    public String toString() {
        return "Trapezoid: " +
                "Area = " + getArea() +
                ", median = " + getMedian() +
                ", color is " + getColor();
    }
}
