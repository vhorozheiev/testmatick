import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    static int arraySize = 10;

    public static Object[] fillArray() {
        Object[] array = new Object[arraySize];
        Object obj = null;
        Random randomizer = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = randomizer.nextInt(4);
            switch (randomNumber) {
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
        Object[] figures = fillArray();
        List<Object> list = Arrays.asList(figures);
        for (Object figure : list) {
            System.out.println(list.stream());
        }
    }
}