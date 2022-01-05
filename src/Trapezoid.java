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
        //TODO write method to get area for trapezoid
        double area = 1 / 2. * (firstSideLength + secondSideLength) * height;
        System.out.println("The area of the trapezoid is " + area);
        return area;
    }

    @Override
    public String getColor() {
        System.out.println("The color of triangle is " + this.color);
        return color;
    }

    public double getMedian() {
        double median = 1 / 2. * (firstSideLength + secondSideLength);
        System.out.println("The median of the trapezoid is " + median);
        return median;
    }
}
