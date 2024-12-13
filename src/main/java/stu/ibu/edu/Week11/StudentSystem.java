package stu.ibu.edu.Week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) throws IOException, InvalidStudentDataException{
        List<Student> studentList = readStudents(filename);
        validateStudentData(studentList);
        this.students = studentList;
    }

    public StudentSystem(List<Student> students) throws InvalidStudentDataException{
        validateStudentData(students);
        this.students = students;
    }

    public static List<Student> readStudents(String filename) throws IOException {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String university = parts[2].trim();
                    String department = parts[3].trim();
                    double gpa = Double.parseDouble(parts[4].trim());
                    studentList.add(new Student(id, name, university, department, gpa));
                }
            }
        }
        return studentList;
    }

    public int noOfStudents() {
        return students.size();
    }

    // Method to get a student by ID
    public Optional<Student> getStudentById(int id) {
        return students.stream()
                .filter(student -> student.getID() == id)
                .findFirst();
    }

    // Method to get the student with the highest GPA
    public Student getHighestGPAStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        return students.stream()
                .max(Comparator.comparingDouble(Student::getGPA))
                .orElseThrow(() -> new EmptyStudentListException("List of students is empty."));
    }

    // Method to get the student with the longest name
    public Student getLongestNameStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }
        return students.stream()
                .max(Comparator.comparingInt(student -> student.getName().length()))
                .orElseThrow(() -> new EmptyStudentListException("List of students is empty."));
    }

    // Private method to validate student data
    private void validateStudentData(List<Student> students) throws InvalidStudentDataException {
        if (students.stream().anyMatch(student -> student.getGPA() < 6 || student.getGPA() > 10)) {
            throw new InvalidStudentDataException("Read data has invalid rows.");
        }
    }
}
