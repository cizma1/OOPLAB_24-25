package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n;
        System.out.println("Enter n: ");
        n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            printText();
        }
    }

    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
