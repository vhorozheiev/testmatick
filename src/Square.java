public class Square extends Shape {
    private int lengthSide;
    private String color;

    public Square(String color, int lengthSide) {
        this.color = color;
        this.lengthSide = lengthSide;
    }

    /**
     * Method to draw figure
     */
    @Override
    public void draw() {
        System.out.println("Square has been drawn");
    }

    /**
     * @return area of square
     */
    @Override
    public double getArea() {
        return lengthSide * 2;
    }

    /**
     * @return color of square
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * @return length of the square side
     */
    public int getLengthSide() {
        return lengthSide;
    }

    /**
     * @return information about object
     */
    @Override
    public String toString() {
        return "Square: " +
                "Area = " + getArea() +
                ", length of the side = " + getLengthSide() +
                ", color is " + getColor();
    }
}
