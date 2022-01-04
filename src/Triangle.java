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
        double halfPerimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2.0;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSideLength) *
                (halfPerimeter - secondSideLength) * (halfPerimeter - thirdSideLength));
        System.out.println("Triangle area is " + area);
        return area;
    }

    @Override
    public String getColor() {
        System.out.println("The color of triangle is " + this.color);
        return color;
    }
}
