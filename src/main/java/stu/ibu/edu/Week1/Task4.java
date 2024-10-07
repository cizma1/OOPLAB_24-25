package stu.ibu.edu.Week1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number1, number2;

        System.out.print("Please enter first number: ");
        number1 = reader.nextInt();

        System.out.print("Please enter second number: ");
        number2 = reader.nextInt();

        int sum=number1+number2;

        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
    }
}
