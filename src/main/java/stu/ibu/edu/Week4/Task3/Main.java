package stu.ibu.edu.Week4.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 48, 23, "Finland"));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 63, "Finland"));
        printDepartment(people);
    }

    public static void printDepartment(List<Person> people) {
        System.out.println(people);
    }
}
