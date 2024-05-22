package org.example.homework10.task2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeManagement {

    public static record Employee(String firstName, String lastName, String hireDate) {}

    public static void main(String[] args) {
        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        System.out.println("Sorted by name:");
        printOrderedList(list, "name");
        System.out.println();

        System.out.println("Sorted by years worked:");
        printOrderedList(list, "years");
    }

    public static void printOrderedList(List<Employee> employees, String criteria) {
        class EmployeeWithDetails {
            private final String fullName;
            private final int yearsWorked;

            public EmployeeWithDetails(Employee employee) {
                this.fullName = employee.firstName() + " " + employee.lastName();
                this.yearsWorked = calculateYearsWorked(employee.hireDate());
            }

            public String getFullName() {
                return fullName;
            }

            public int getYearsWorked() {
                return yearsWorked;
            }

            private int calculateYearsWorked(String hireDate) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate hireLocalDate = LocalDate.parse(hireDate, formatter);
                return LocalDate.now().getYear() - hireLocalDate.getYear();
            }
        }

        List<EmployeeWithDetails> detailedList = new ArrayList<>();
        for (Employee employee : employees) {
            detailedList.add(new EmployeeWithDetails(employee));
        }

        detailedList.sort(new Comparator<EmployeeWithDetails>() {
            @Override
            public int compare(EmployeeWithDetails e1, EmployeeWithDetails e2) {
                if (criteria.equals("name")) {
                    return e1.getFullName().compareTo(e2.getFullName());
                } else if (criteria.equals("years")) {
                    return Integer.compare(e1.getYearsWorked(), e2.getYearsWorked());
                }
                return 0;
            }
        });

        for (EmployeeWithDetails employee : detailedList) {
            System.out.println(employee.getFullName() + " -> " + employee.getYearsWorked() + " years");
        }
    }
}

