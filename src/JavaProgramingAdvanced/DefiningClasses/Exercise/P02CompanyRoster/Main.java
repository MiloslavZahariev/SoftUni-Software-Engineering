package JavaProgramingAdvanced.DefiningClasses.Exercise.P02CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployers = Integer.parseInt(scanner.nextLine());
        List<Employee> list = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < numberOfEmployers; i++) {
            String[] employeeData = scanner.nextLine().split(" ");
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];

            Employee employee = null;
            switch (employeeData.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (employeeData[4].contains("@")) {
                        String employeeEmail = employeeData[4];
                        employee = new Employee(name, salary, position, department, employeeEmail);
                    } else {
                        int age = Integer.parseInt(employeeData[4]);
                        employee = new Employee(name, salary, position, department, age);
                    }

                    break;
                case 6:
                    String email = employeeData[4];
                    int age = Integer.parseInt(employeeData[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
            }

            boolean departmentExists = departmentList.stream().anyMatch(dep -> dep.getName().equals(department));
            if (!departmentExists) {
                Department department1 = new Department(department);
                departmentList.add(department1);
            }

            Department currentDepartment = departmentList
                    .stream()
                    .filter(dep -> dep.getName().equals(department))
                    .findFirst().get();
            currentDepartment.getEmployees().add(employee);
        }

        Department highestPaidDepartment = departmentList
                .stream().max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();

        System.out.printf("Highest Average Salary: %s%n",highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((first,second) -> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);

    }
}
