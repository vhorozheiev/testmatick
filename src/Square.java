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
        int area = lengthSide * 2;
        System.out.println("The area of the square is " + area);
        return area;
    }

    @Override
    public String getColor() {
        System.out.println("The color of the square is " + color);
        return color;
    }
}
