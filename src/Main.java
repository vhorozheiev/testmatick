import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle("green", 5);
        circle.draw();
        circle.getArea();
        circle.getColor();
        System.out.println("The radius of the circle is " + ((Circle) circle).getRadius());
        System.out.println("/////////////////////////////////////////////////////////");
        Figure square = new Square("blue", 10);
        square.getArea();
        square.getColor();
        square.draw();
        System.out.println("/////////////////////////////////////////////////////////");
        Figure triangle = new Triangle("white", 5, 4, 6);
        triangle.getColor();
        triangle.draw();
        triangle.getArea();


//        Object [] o = fill();
//        System.out.println(Arrays.toString(o));
    }
//    static int arraySize = 10;
//    public static Object[] fill() {
//        Object[] array = new Object[arraySize];
//        Object obj = null;
//        Random randomizer = new Random();
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = randomizer.nextInt(3);
//            switch (randomNumber) {
//                case 0 -> obj = new Circle("red", 10);
//                case 1 -> obj = new Square("black", 6);
//                case 2 -> obj = new Triangle();
//            }
//            array[i] = obj;
//        }
//        return array;
//    }
}
