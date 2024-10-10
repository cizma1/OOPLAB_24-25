package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        drawStarsPiramid(5);

    }

    public static void drawStarsPiramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
