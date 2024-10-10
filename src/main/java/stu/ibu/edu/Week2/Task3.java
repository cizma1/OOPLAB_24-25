package stu.ibu.edu.Week2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, sum=0;

        while(true){
            System.out.println("Enter numbers (0 to stop): ");
            num = scanner.nextInt();
            sum+=num;
            if(num==0){
                break;
            }
        }
        System.out.println("The sum of entered numbers is " + sum);
    }
}
