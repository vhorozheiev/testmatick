public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        System.out.println("The area of the circle is " + area);
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public String getColor() {
        System.out.println("The color of circle is " + this.color);
        return this.color;
    }

    public double getRadius() {
        return radius;
    }
}
