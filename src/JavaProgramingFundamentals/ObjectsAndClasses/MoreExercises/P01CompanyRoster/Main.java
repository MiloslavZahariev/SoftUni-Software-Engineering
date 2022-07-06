package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P01CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String employeeData = scanner.nextLine();
            String[] employeeDataArr = employeeData.split(" ");

            String name = employeeDataArr[0];
            double salary = Double.parseDouble(employeeDataArr[1]);
            String position = employeeDataArr[2];
            String department = employeeDataArr[3];

            String email;
            int age;

            Employee employee = new Employee(name, salary, position, department);

            if (employeeDataArr.length == 5) {
                if (employeeDataArr[4].contains("@")) {
                    email = employeeDataArr[4];
                    employee.setEmail(email);
                } else {
                    age = Integer.parseInt(employeeDataArr[4]);
                    employee.setAge(age);
                }
            }
            if (employeeDataArr.length == 6) {
                email = employeeDataArr[4];
                age = Integer.parseInt(employeeDataArr[5]);
                employee.setEmail(email);
                employee.setAge(age);
            }

            employeeList.add(employee);

        }

        fillingDepartmentList(employeeList, departmentList);


        printingBestAverageSalary(departmentList);
    }

    private static void printingBestAverageSalary(List<Department> departmentList) {
        double bestSalary = 0;
        Department bestDepartment = null;

        for (Department department : departmentList) {
            double currentSalary = department.getAverageSalary(department.getEmployees());
            if(bestSalary < currentSalary){
                bestSalary = currentSalary;
                bestDepartment = department;
            }
        }

        System.out.printf("Highest Average Salary: %s%n",bestDepartment.getName());

        List<Employee> bestEmployers = bestDepartment.getEmployees();
        bestEmployers.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee employee : bestEmployers) {
            System.out.printf("%s %.2f %s %d%n",employee.getName(),employee.getSalary(),employee.getEmail(),employee.getAge());
        }


    }

    private static void fillingDepartmentList(List<Employee> employeeList, List<Department> departmentList) {
        while (!employeeList.isEmpty()) {
            String depart = employeeList.get(0).getDepartment();
            Department department = new Department(depart);
            List<Employee> emp = new ArrayList<>();
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getDepartment().equals(depart)) {
                    emp.add(employeeList.get(i));
                    department.setEmployees(emp);
                    employeeList.remove(i);
                    i--;
                }
            }
            departmentList.add(department);
        }
    }
}
