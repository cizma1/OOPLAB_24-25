package stu.ibu.edu.Week2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setPassword="Svejedno";
        String password;

        while(true){
            System.out.println("Enter password: ");
            password = scanner.nextLine();
            if(password.equals(setPassword)){
                System.out.println("Congratulate your password is correct!");
                break;
            }
        }
    }
}
