package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P01CompanyRoster;


import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAverageSalary(List<Employee> employees) {
        double averageSalary = 0;

        for (Employee employee : employees) {
            averageSalary += employee.getSalary();
        }
            averageSalary /= employees.size();

        return averageSalary;
    }

}
