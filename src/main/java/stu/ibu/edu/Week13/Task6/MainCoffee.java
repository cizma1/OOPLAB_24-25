package stu.ibu.edu.Week13.Task6;

public class MainCoffee {
    public static void main(String[] args) {
        CoffeeBuilder builder = new EspressoBuilder();
        builder.buildType();
        Coffee coffee = builder.getCoffee();
        System.out.println(coffee);
    }
}
