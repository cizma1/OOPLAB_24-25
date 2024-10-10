package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, last;

        System.out.println("Enter first number: ");
        first = scanner.nextInt();

        System.out.println("Enter last number: ");
        last = scanner.nextInt();

        int current=first;

        System.out.println("Numbers between " + first + " and " + last + ": ");
        while(current<=last){
            System.out.print(current + " ");
            current++;
        }
    }
}
