public class Square extends Figure {
    private int lengthSide;
    private String color;

    public Square(String color, int lengthSide) {
        this.color = color;
        this.lengthSide = lengthSide;
    }

    @Override
    public void draw() {
        System.out.println("Square has been drawn");
    }

    @Override
    public double getArea() {
        return lengthSide * 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getLengthSide() {
        return lengthSide;
    }

    @Override
    public String toString() {
        return "Square: " +
                "Area = " + getArea() +
                ", length of the side = " + getLengthSide() +
                ", color is " + getColor();
    }
}
