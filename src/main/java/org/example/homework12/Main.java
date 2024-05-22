package org.example.homework12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Anna", 21, 95),
                new Student("Igor", 16, 85),
                new Student("Ilya", 22, 72),
                new Student("Oksana", 27, 91),
                new Student("Eva", 20, 58),
                new Student("Ivan", 25, 99),
                new Student("Olena", 18, 45)
        ));

        System.out.println("All student names:");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("\nStudents older than 20 years:");
        students.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("\nStudents with an A grade (grade >= 90):");
        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);

        double averageGrade = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);
        System.out.println("\nAverage grade of all students: " + averageGrade);

        Student highestGradeStudent = students.stream()
                .max(Comparator.comparingInt(Student::getGrade))
                .orElse(null);
        if (highestGradeStudent != null) {
            System.out.println("\nStudent with the highest grade: " + highestGradeStudent.getName() +
                    " with grade " + highestGradeStudent.getGrade());
        }

        long countBelow60 = students.stream()
                .filter(student -> student.getGrade() < 60)
                .count();
        System.out.println("\nNumber of students with a grade below 60: " + countBelow60);
    }
}
