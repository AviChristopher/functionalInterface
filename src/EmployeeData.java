import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeData {

    // Method to create and return a list of Employee objects
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        // Adding Employee objects to the list
        employees.add(new Employee("Jacob", 30, "Finance", 75000, "Chief Financial Officer"));
        employees.add(new Employee("Alisha", 32, "IT", 64000, "Software Engineer"));
        employees.add(new Employee("Sam", 42, "HR", 75000, "Chief Human Resource Officer"));
        employees.add(new Employee("Sasha", 26, "IT", 63000, "IT Specialist"));

        return employees;
    }

    // Function to get a formatted string with Employee's name and department
    public static Function<Employee, String> getNameAndDepartment = (Employee employee) -> {
        return employee.getName() + ":" + employee.getDepartment();
    };

    // Function to get a formatted string with Employee's name and position
    public static Function<Employee, String> getNameAndJobTitle = (Employee employee) -> {
        return employee.getName() + ":" + employee.getPosition();
    };
}
