package stu.ibu.edu.Week4.Task2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red", FillType.FILLED);
        Circle circle = new Circle("red", FillType.NOT_FILLED, 14.57);
        Rectangle rectangle = new Rectangle("red", FillType.FILLED, 14.3, 5.7);

        System.out.println(shape.displayInfo());
        System.out.println(circle.displayInfo());
        System.out.println(rectangle.displayInfo());

        double result = shape.getArea();
        System.out.println(result);

        double result1 = circle.getArea();
        System.out.println(result1);

        double result2 = circle.calculateCircumference(3.14, 5.87);
        System.out.println(result2);

        double result3 = circle.calculatecircumference(5.78);
        System.out.println(result3);

        double result4 = rectangle.getArea();
        System.out.println(result4);
    }
}
