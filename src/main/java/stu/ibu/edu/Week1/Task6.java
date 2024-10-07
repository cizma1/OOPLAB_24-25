package stu.ibu.edu.Week1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int number1 = reader.nextInt();

        System.out.print("Please enter second number: ");
        int number2 = reader.nextInt();

        if(number1>number2){
            System.out.println("Number " + number1 + " is greater than " + number2 + ".");
        }
        else if(number1<number2){
            System.out.println("Number " + number1 + " is less than " + number2 + ".");
        }
        else{
            System.out.println("Numbers are equal.");
        }
    }
}
