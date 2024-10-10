package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, power, sum=0;

        System.out.print("Enter number: ");
        n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            power=(int)Math.pow(2,i);
            sum+=power;
        }
        System.out.println("Sum of all pow numbers is " + sum);
    }
}
