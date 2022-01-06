public class Circle extends Shape {
    private String color;
    private double radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    /**
     *  Method to draw circle
     */
    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    /**
     * @return area of circle
     */
    @Override
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        return Math.PI * (this.radius * this.radius);
    }

    /**
     * @return color of circle
     */
    @Override
    public String getColor() {
        return this.color;
    }

    /**
     * @return radius of circle
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * @return information about object
     */
    @Override
    public String toString() {
        return "Circle: " +
                "Area = " + getArea() +
                ", radius = " + getRadius() +
                ", color is " + getColor();
    }
}
