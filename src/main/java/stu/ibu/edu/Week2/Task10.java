package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int gueesNum;
        int number = 1 + (int)(100 * Math.random());
        int numberOfGuesses=0;
        while(true){
            System.out.println("Guees the number: ");
            gueesNum = scanner.nextInt();
            numberOfGuesses++;
            if(gueesNum>number){
                System.out.println("Lower!" + " - This is your " + numberOfGuesses + ". guess!");
            }
            else if(gueesNum<number){
                System.out.println("Higher!" + " - This is your " + numberOfGuesses + ". guess!");
            }
            else{
                System.out.println("You are correct!");
                System.out.println("You made " + numberOfGuesses + " guesses!");
                break;
            }
        }
    }
}
