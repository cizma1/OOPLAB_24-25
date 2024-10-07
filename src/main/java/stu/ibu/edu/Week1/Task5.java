package stu.ibu.edu.Week1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int number= reader.nextInt();

        if(number>0){
            System.out.println("This number is POSITIVE.");
        }
        else if(number<0){
            System.out.println("This number is NEGATIVE.");
        }
        else{
            System.out.println("Number is ZERO.");
        }
    }
}
