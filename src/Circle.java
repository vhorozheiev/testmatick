public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "Area = " + getArea() +
                ", radius = " + getRadius() +
                ", color is " + getColor();
    }
}
