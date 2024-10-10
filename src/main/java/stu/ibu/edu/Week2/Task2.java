package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int number;
        for(int i=1;i<=3;i++){
            System.out.println("Enter number " + i + ": ");
            number= scanner.nextInt();
            sum+=number;
        }
        System.out.println("Sum of three numbers is " + sum);
    }
}
