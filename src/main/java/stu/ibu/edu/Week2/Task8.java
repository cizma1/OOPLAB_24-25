package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        invertedPyramid(5);
    }

    public static void invertedPyramid(int rows){
        for(int i=rows;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
