package stu.ibu.edu.Week6;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statement\n" +
                "\tquit - quit the text user interface\n" +
                "\ttranslate - asks a word and prints its translation\n" +
                "\tadd - adds a word pair to the dictionary\n");
        while (true) {
            System.out.println("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add(){
        System.out.println("In Finnish: ");
        String word = reader.nextLine();

        System.out.println("Translation: ");
        String translation = reader.nextLine();

        System.out.println("Word pair added");
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String translation = "A";
        System.out.println("Translation: " + translation);
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration keys() {
                return null;
            }

            @Override
            public Enumeration elements() {
                return null;
            }

            @Override
            public Object get(Object o) {
                return null;
            }

            @Override
            public Object put(Object o, Object o2) {
                return null;
            }

            @Override
            public Object remove(Object o) {
                return null;
            }
        };

        Scanner reader = new Scanner(System.in);

        TextUserInterface ui = new TextUserInterface(reader, dictionary);

        ui.start();
    }
}
