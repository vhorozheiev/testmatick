public class Trapeze extends Figure {
    private String color;
    private int firstSideLength;
    private int secondSideLength;
    private int thirdSideLength;
    private int fourthSideLength;

    public Trapeze(String color, int firstSideLength, int secondSideLength, int thirdSideLength, int fourthSideLength) {
        this.color = color;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
        this.fourthSideLength = fourthSideLength;
    }

    @Override
    public void draw() {
        System.out.println("Trapeze has been drawn");
    }

    @Override
    public double getArea() {
        double area = 1;
        return area;
    }

    @Override
    public String getColor() {
        System.out.println("The color of triangle is " + this.color);
        return color;
    }
}
