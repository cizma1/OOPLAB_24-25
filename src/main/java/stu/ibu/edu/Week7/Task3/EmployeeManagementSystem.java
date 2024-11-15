package stu.ibu.edu.Week7.Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    public record EmployeeRecord(String name, String position, double salary, LocalDate employeeDate){
        public static EmployeeRecord createIntern(String name){
            return new EmployeeRecord(name, "Intern", 20000.0, LocalDate.now());
        }
    }

    public static List<EmployeeRecord> filterByTenure(List<EmployeeRecord> employees){
        return employees.stream()
                .filter(emp -> emp.employeeDate().isBefore(LocalDate.now().minusYears(5)))
                .collect(Collectors.toList());
    }

    public static double calculateAverageSalary(List<EmployeeRecord> employees, String position){
        return employees.stream()
                .filter(emp -> emp.position().equalsIgnoreCase(position))
                .mapToDouble(EmployeeRecord::salary)
                .average()
                .orElse(0.0);
    }

    public static List<EmployeeRecord> findEmployeesByRole(List<EmployeeRecord> employees, String role) {
        return employees.stream()
                .filter(emp -> emp.position().equalsIgnoreCase(role))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<EmployeeRecord> employees = new ArrayList<>();
        employees.add(new EmployeeRecord("Alice", "Senior Developer", 90000.0, LocalDate.of(2015, 5, 20)));
        employees.add(new EmployeeRecord("Bob", "Junior Developer", 50000.0, LocalDate.of(2020, 8, 15)));
        employees.add(new EmployeeRecord("Charlie", "Manager", 100000.0, LocalDate.of(2012, 3, 10)));
        employees.add(new EmployeeRecord("Dana", "Senior Developer", 95000.0, LocalDate.of(2017, 11, 5)));
        employees.add(EmployeeRecord.createIntern("Eve"));

        List<EmployeeRecord> tenuredEmployees = filterByTenure(employees);
        System.out.println("Employees with over 5 years of tenure:");
        tenuredEmployees.forEach(System.out::println);

        double avgSalary = calculateAverageSalary(employees, "Senior Developer");
        System.out.println("\nAverage salary for Senior Developers: $" + avgSalary);

        List<EmployeeRecord> seniorDevelopers = findEmployeesByRole(employees, "Senior Developer");
        System.out.println("\nSenior Developers:");
        seniorDevelopers.forEach(System.out::println);
    }
}
