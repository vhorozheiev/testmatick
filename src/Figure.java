abstract class Figure {
    public abstract void draw();

    public abstract double getArea();

    public abstract String getColor();

    @Override
    public String toString() {
        return "Figure{}";
    }
}
