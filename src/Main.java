import java.util.Random;

public class Main {
    private static final int MAX = 25;
    static int arraySize = rnd(MAX);

    /**
     * @param max quantity of shapes
     * @return random integer
     */
    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

    /**
     * this method fills the array with random shapes
     * @return array filled with random shapes
     */
    public static Object[] fillArray() {
        Object[] array = new Object[arraySize];
        Object obj = null;
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            int arraySize = random.nextInt(4);
            switch (arraySize) {
                case 0 -> obj = new Circle("red", 10);
                case 1 -> obj = new Square("black", 6);
                case 2 -> obj = new Triangle("white", 4, 5, 6);
                case 3 -> obj = new Trapezoid("green", 5, 4, 5);
            }
            array[i] = obj;
        }
        return array;
    }

    public static void main(String[] args) {
        Object[] shapes = fillArray();
        for (Object shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}